import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Ventana extends JFrame {
	
	
	JPanel panel = new JPanel();
	
	public Ventana()
	{
		this.setSize(500,500);
		this.setLayout(null);
		this.agregarElementos();
		this.add(panel);
		this.setVisible(true);
	
	}
	
	public void agregarElementos()
	{
		panel.setBounds(0,0,500,500);
		panel.setLayout(null);
		panel.setBackground(Color.red);
		
		JLabel lblIngresar = new JLabel();
		Font fontIngresar = new Font(Font.MONOSPACED,Font.ITALIC,40);
		lblIngresar.setFont(fontIngresar);
		lblIngresar.setBounds(100,20,300,50);
		lblIngresar.setText("Acceder");
		lblIngresar.setOpaque(true);
		lblIngresar.setBackground(Color.blue);
		lblIngresar.setForeground(Color.pink);
		panel.add(lblIngresar);
		
		JLabel lblUsuario = new JLabel();
		Font fontUsuario = new Font(Font.MONOSPACED,Font.ITALIC,20);
		lblUsuario.setFont(fontUsuario);
		lblUsuario.setBounds(100,100,300,25);
		lblUsuario.setText("Ingresa tu Usuario");
		lblUsuario.setOpaque(true);
		lblUsuario.setBackground(Color.blue);
		lblUsuario.setForeground(Color.pink);
		panel.add(lblUsuario);
		
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(100,150,300,25);
		panel.add(txtUsuario);
		
		JLabel lblContrasena = new JLabel();
		Font fontContrasena = new Font(Font.MONOSPACED,Font.ITALIC,20);
		lblContrasena.setFont(fontContrasena);
		lblContrasena.setBounds(100,200,300,25);
		lblContrasena.setText("Ingresa tu contrasena");
		lblContrasena.setOpaque(true);
		lblContrasena.setBackground(Color.blue);
		lblContrasena.setForeground(Color.pink);
		panel.add(lblContrasena);
		
		JPasswordField pwUsuario = new JPasswordField();
		pwUsuario.setBounds(100,250,300,25);
		panel.add(pwUsuario);
		
		JCheckBox cbxGuardar = new JCheckBox();
		cbxGuardar.setBounds(50,290,200,25);
		cbxGuardar.setText("Guardar Contrasena");
		panel.add(cbxGuardar);
		
		JButton btnAceptar = new JButton();
		btnAceptar.setBounds(150,320,100,50);
		btnAceptar.setText("Aceptar");
		panel.add(btnAceptar);
		
		
		
	}

}
