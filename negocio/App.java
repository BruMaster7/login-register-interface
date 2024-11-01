package obligatorio.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import obligatorio.negocio.dominio.Administrador;
import obligatorio.negocio.dominio.Usuario;
import obligatorio.negocio.dominio.UsuarioComun;

public class App implements IUsuarioAutenticable {
	private static App aplicacion;
	
    private List<Usuario> usuarios;

    //esto no es mutlihilo (multiusuario)
    public static App getInstancia() {
    	if (aplicacion == null) {
    		aplicacion = new App();
    	} 
    	return aplicacion;
    }
    
    
    private App() {
        this.usuarios = new ArrayList<>();
        this.usuarios.add(new Administrador("pepe","pepe","pepePepe","pepe@pepe"));
  
    }
    
	@Override
	public void registrarUsuario(UsuarioComun usuario) {
		this.usuarios.add(usuario);
		
	}

	@Override
	public boolean ingresar(String nick, String password) {
		boolean result = false;
		for (Usuario usr: usuarios) {
			if (usr.getNick().equals(nick)) {
				result = usr.autenticar(nick, password);
				break;
			}
		}
		return result;
	}

	@Override
	public List<Usuario> usuariosRegistrados() {
		 return usuarios;
	}


/*
    @Override
    public void listarUsuarios(List<Usuario> usuarios) {
        System.out.println("Lista de usuarios registrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        if (buscarUsuarioPorNick(usuario.getNick()) == null) {
            usuarios.add(usuario);
            System.out.println("Usuario registrado con éxito: " + usuario.getNick());
        } else {
            System.out.println("Error: el nick ya está en uso.");
        }
    }
*/
    public Usuario buscarUsuarioPorNick(String nick) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNick().equals(nick)) {
                return usuario;
            }
        }
        return null;
    }

   
    public void runIngresar() {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (true) {  // Bucle infinito para intentar loguearse tantas veces como se desee
            System.out.println("Ingrese su nick (o escriba 'salir' para abandonar):");
            String nick = scanner.nextLine();

            if (nick.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del sistema...");
                break;  // Sale del ciclo si el usuario quiere abandonar el sistema
            }

            System.out.println("Ingrese su contraseña:");
            String password = scanner.nextLine();

            Usuario usuario = buscarUsuarioPorNick(nick);
            if (usuario != null) {
                if (usuario.isBloqueado()) {
                    System.out.println("El usuario " + nick + " está bloqueado. No se puede iniciar sesión.");
                } else {
                    // Intentar ingresar
                    loggedIn = usuario.autenticar(nick, password);
                    if (loggedIn) {
                        System.out.println("Has iniciado sesión correctamente.");
                        break;  // Sale del ciclo si el login fue exitoso
                    }
                }
            } else {
                System.out.println("Usuario no encontrado.");
            }

            System.out.println("¿Desea intentarlo nuevamente? (sí/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("Saliendo del sistema...");
                break;  // Sale del ciclo si el usuario decide no intentarlo nuevamente
            }
        }
    }



}
