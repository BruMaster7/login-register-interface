package obligatorio.negocio.dominio;

public class UsuarioComun extends Usuario{

	public UsuarioComun(String nick, String password, String nombreCompleto, String email, int intentosFallidos,
			boolean bloqueado) {
		super(nick, password, nombreCompleto, email);
	}
	
}
