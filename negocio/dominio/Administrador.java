package obligatorio.negocio.dominio;

import java.time.LocalDateTime;

public class Administrador extends Usuario {
    private LocalDateTime fechaRegistro;

    public Administrador(String nick, String password, String nombreCompleto, String email) {
        super(nick, password, nombreCompleto, email);
        this.fechaRegistro = LocalDateTime.now();
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

