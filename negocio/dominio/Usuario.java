package obligatorio.negocio.dominio;

import java.time.LocalDateTime;

public abstract class Usuario {
    private String nick;
    private String password;
    private String nombreCompleto;
    private String email;
    private int intentosFallidos;
    private boolean bloqueado;
    private LocalDateTime tiempoDesbloqueo;

    public Usuario(String nick, String password, String nombreCompleto, String email) {
        this.nick = nick;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.intentosFallidos = 0;
        this.bloqueado = false;
        this.tiempoDesbloqueo = null;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public LocalDateTime getTiempoDesbloqueo() {
        return tiempoDesbloqueo;
    }

    public boolean autenticar(String nick, String password) {
        if (bloqueado && LocalDateTime.now().isBefore(tiempoDesbloqueo)) {
           System.out.println("Usuario bloqueado");
            return false;
        }

        if (this.nick.equals(nick) && this.password.equals(password)) {
            intentosFallidos = 0;  // Reiniciar intentos fallidos después de un inicio de sesión exitoso
            System.out.println("Contraseñia correcta.");
            return true;
        } else {
            intentosFallidos++;
            System.out.println("Intento fallido");
            if (intentosFallidos >= 3) {
                bloquear();
                System.out.println("Se bloquea usuario por intentos incorrectos");
            }
            return false;
        }
    }

    public void bloquear() {
        System.err.println("El usuario " + this.nick + " ha sido bloqueado por 3 minutos.");
        this.bloqueado = true;
        this.tiempoDesbloqueo = LocalDateTime.now().plusMinutes(3);
    }

    @Override
    public String toString() {
        return "Usuario [nick=" + nick + ", nombreCompleto=" + nombreCompleto + ", email=" + email
                + ", intentosFallidos=" + intentosFallidos + ", bloqueado=" + bloqueado + "]";
    }
}

