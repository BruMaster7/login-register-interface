package obligatorio.negocio;

import java.util.List;

import obligatorio.negocio.dominio.Usuario;
import obligatorio.negocio.dominio.UsuarioComun;

public interface IUsuarioAutenticable {
	public void registrarUsuario(UsuarioComun usuario);
	public boolean ingresar(String nick, String password);
	public List<Usuario> usuariosRegistrados();

	//public void runIngresar();
}
