package obligatorio.presentacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import obligatorio.negocio.App;
import obligatorio.negocio.IUsuarioAutenticable;


public class frmLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField JTNombre;
	private JPasswordField JPContraseña;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{43, 36, 86, 0, 0, 0, 56, 86, 0};
		gbl_contentPane.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTituloSesion = new JLabel("inicie sesión");
		lblTituloSesion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTituloSesion = new GridBagConstraints();
		gbc_lblTituloSesion.insets = new Insets(0, 0, 5, 5);
		gbc_lblTituloSesion.gridx = 4;
		gbc_lblTituloSesion.gridy = 1;
		contentPane.add(lblTituloSesion, gbc_lblTituloSesion);
		
		JLabel lblUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 3;
		gbc_lblUsuario.gridy = 3;
		contentPane.add(lblUsuario, gbc_lblUsuario);
		
		JTNombre = new JTextField();
		GridBagConstraints gbc_jTNombre = new GridBagConstraints();
		gbc_jTNombre.anchor = GridBagConstraints.NORTHWEST;
		gbc_jTNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jTNombre.gridx = 4;
		gbc_jTNombre.gridy = 3;
		contentPane.add(JTNombre, gbc_jTNombre);
		JTNombre.setColumns(10);
		
		JLabel lblConstraseña = new JLabel("Contraseña");
		lblConstraseña.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblConstraseña = new GridBagConstraints();
		gbc_lblConstraseña.anchor = GridBagConstraints.WEST;
		gbc_lblConstraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lblConstraseña.gridx = 3;
		gbc_lblConstraseña.gridy = 4;
		contentPane.add(lblConstraseña, gbc_lblConstraseña);
		
		JPContraseña = new JPasswordField();
		JPContraseña.setColumns(10);
		GridBagConstraints gbc_jPContraseña = new GridBagConstraints();
		gbc_jPContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_jPContraseña.anchor = GridBagConstraints.NORTHWEST;
		gbc_jPContraseña.gridx = 4;
		gbc_jPContraseña.gridy = 4;
		contentPane.add(JPContraseña, gbc_jPContraseña);
		
		JButton btnInicioSesion = new JButton("Iniciar Sesión");
		btnInicioSesion.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        String clave = String.valueOf(JPContraseña.getPassword());
		        String usuario = JTNombre.getText();
		        IUsuarioAutenticable servicios = App.getInstancia();
		       
		        boolean autenticado = servicios.ingresar(usuario, clave);
		        
		        if (autenticado) {
		            dispose();
		            JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "INGRESASTE",
		                    JOptionPane.INFORMATION_MESSAGE);
		            frmRegister r = new frmRegister();
		            r.setVisible(true);
		        } else {
		            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto", "ERROR",
		                    JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});

		GridBagConstraints gbc_btnInicioSesion = new GridBagConstraints();
		gbc_btnInicioSesion.anchor = GridBagConstraints.WEST;
		gbc_btnInicioSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnInicioSesion.gridx = 4;
		gbc_btnInicioSesion.gridy = 5;
		contentPane.add(btnInicioSesion, gbc_btnInicioSesion);
	}

}
