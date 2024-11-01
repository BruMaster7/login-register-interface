package obligatorio.presentacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class frmRegister extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	
	/**
	 * Create the frame.
	 */
	public frmRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTituloRegistrer = new JLabel("Registrar usuario");
		lblTituloRegistrer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTituloRegistrer = new GridBagConstraints();
		gbc_lblTituloRegistrer.insets = new Insets(0, 0, 5, 5);
		gbc_lblTituloRegistrer.gridx = 3;
		gbc_lblTituloRegistrer.gridy = 1;
		contentPane.add(lblTituloRegistrer, gbc_lblTituloRegistrer);
		
		JLabel lblUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 2;
		contentPane.add(lblUsuario, gbc_lblUsuario);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 2;
		contentPane.add(textField, gbc_textField);
		
		JLabel lblConstraseña = new JLabel("Contraseña");
		lblConstraseña.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblConstraseña = new GridBagConstraints();
		gbc_lblConstraseña.anchor = GridBagConstraints.EAST;
		gbc_lblConstraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lblConstraseña.gridx = 2;
		gbc_lblConstraseña.gridy = 3;
		contentPane.add(lblConstraseña, gbc_lblConstraseña);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 3;
		gbc_passwordField.gridy = 3;
		contentPane.add(passwordField, gbc_passwordField);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo");
		lblNombreCompleto.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblNombreCompleto = new GridBagConstraints();
		gbc_lblNombreCompleto.anchor = GridBagConstraints.EAST;
		gbc_lblNombreCompleto.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCompleto.gridx = 2;
		gbc_lblNombreCompleto.gridy = 4;
		contentPane.add(lblNombreCompleto, gbc_lblNombreCompleto);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setColumns(10);
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridx = 3;
		gbc_passwordField_1.gridy = 4;
		contentPane.add(passwordField_1, gbc_passwordField_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setVerticalAlignment(SwingConstants.BOTTOM);
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 2;
		gbc_lblEmail.gridy = 5;
		contentPane.add(lblEmail, gbc_lblEmail);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setColumns(10);
		GridBagConstraints gbc_passwordField_2 = new GridBagConstraints();
		gbc_passwordField_2.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_2.gridx = 3;
		gbc_passwordField_2.gridy = 5;
		contentPane.add(passwordField_2, gbc_passwordField_2);
		
		JButton btnRegistrar = new JButton("Registrar");
		GridBagConstraints gbc_btnRegistrar = new GridBagConstraints();
		gbc_btnRegistrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistrar.gridx = 3;
		gbc_btnRegistrar.gridy = 6;
		contentPane.add(btnRegistrar, gbc_btnRegistrar);
		
		JButton btnListaDeUsuarios = new JButton("Lista de usuarios");
		GridBagConstraints gbc_btnListaDeUsuarios = new GridBagConstraints();
		gbc_btnListaDeUsuarios.insets = new Insets(0, 0, 0, 5);
		gbc_btnListaDeUsuarios.gridx = 2;
		gbc_btnListaDeUsuarios.gridy = 8;
		contentPane.add(btnListaDeUsuarios, gbc_btnListaDeUsuarios);
		
		JButton btnVolver = new JButton("Volver");
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolver.gridx = 4;
		gbc_btnVolver.gridy = 8;
		contentPane.add(btnVolver, gbc_btnVolver);
	}

}
