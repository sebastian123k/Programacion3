import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Ventana extends JFrame {
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	public Ventana()
	{
		
		this.setSize(1000,800);
		this.setLayout(null);
		
		//this.agregarElementos();
		//this.agregarRegistro();
		
		this.admin();	
		this.setVisible(true);
	
	}
	
	public void admin(){
		
		panel3.setBounds(0,0,1000,800);
		panel3.setLayout(null);
		panel3.setBackground(Color.green);
		
		JMenuBar barMain = new JMenuBar();
		JMenu menuFile = new JMenu("Archivo");
		JMenuItem openItem = new JMenuItem("abrir archivo...");
		JMenuItem createItem = new JMenuItem("crear archivo...");
		barMain.add(menuFile);
		menuFile.add(createItem);
		menuFile.add(openItem);
		this.setJMenuBar(barMain);
		
		JLabel lblUsuarios = new JLabel("USUARIOS");
		Font fontIngresar = new Font(Font.MONOSPACED,Font.ITALIC,40);
		lblUsuarios.setFont(fontIngresar);
		lblUsuarios.setBounds(350,20,300,50);
		panel3.add(lblUsuarios);
		
		JLabel titleWitged = new JLabel("total de usuarios",0);
		titleWitged.setBounds(40,100,300,100);
		titleWitged.setFont(new Font(Font.MONOSPACED,Font.ITALIC,20));
		titleWitged.setForeground(Color.white);
		panel3.add(titleWitged);
		
		JLabel contendWitged = new JLabel("100",0);
		contendWitged.setBounds(40,120,300,100);
		contendWitged.setFont(new Font(Font.MONOSPACED,Font.ITALIC,20));
		contendWitged.setForeground(Color.white);
		panel3.add(contendWitged);
		
		JLabel witged = new JLabel("");
		witged.setBounds(40,120,300,100);
		witged.setOpaque(true);
		witged.setBackground(Color.black);
		panel3.add(witged);
		

		
		JButton btnDonwload = new JButton("exportar");
		btnDonwload.setBounds(440,140,100,50);
		btnDonwload.setBackground(Color.red);
		panel3.add(btnDonwload);
		
		JButton btnAdd= new JButton("anadir");
		btnAdd.setBounds(580,140,100,50);
		panel3.add(btnAdd);
		
		String titulos []= {"NO.contreol","Nombre","semestre","promedio","acciones"};
		String elementos[][] = {
				{"NO.contreol","Nombre","semestre","promedio","acciones"},
				{"NO.contreol","Nombre","semestre","promedio","acciones"},
				{"NO.contreol","Nombre","semestre","promedio","acciones"},
				{"NO.contreol","Nombre","semestre","promedio","acciones"},
				};
		
		
		JTable tblMain = new JTable(elementos,titulos);
		tblMain.setBounds(40,250,910,400);
		
		JScrollPane scrol = new JScrollPane(tblMain);
		scrol.setBounds(40,250,100,50);
		panel3.add(tblMain);
		
		
		this.add(panel3);
		
		
		
	}
	
	
	public void agregarRegistro()
	{
		panel2.setBounds(500,0,500,800);
		panel2.setLayout(null);
		panel2.setBackground(Color.yellow);
		
		JLabel lblRegistro = new JLabel();
		Font fontIngresar = new Font(Font.MONOSPACED,Font.ITALIC,40);
		 lblRegistro.setFont(fontIngresar);
		 lblRegistro.setBounds(100,20,300,50);
		 lblRegistro.setText("Registro");
		 lblRegistro.setOpaque(true);
		lblRegistro.setBackground(Color.blue);
		 lblRegistro.setForeground(Color.pink);
		 lblRegistro.setHorizontalAlignment(0);
		panel2.add( lblRegistro);
		
		JLabel lblNombre = new JLabel();
		Font fontRegistro = new Font(Font.MONOSPACED,Font.ITALIC,20);
		 lblNombre.setFont(fontRegistro);
		 lblNombre.setBounds(100,80,300,50);
		 lblNombre.setText("ingresa tu nombre");
		 lblNombre.setOpaque(true);
		lblNombre.setBackground(Color.blue);
		 lblNombre.setForeground(Color.pink);
		 lblNombre.setHorizontalAlignment(0);
		panel2.add( lblNombre);
		
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(100,150,300,25);
		panel2.add(txtUsuario);
		
		JLabel lblinfo = new JLabel();
		lblinfo.setFont(fontRegistro);
		lblinfo.setBounds(100,200,300,50);
		lblinfo.setText("bio");
		lblinfo.setOpaque(true);
		lblinfo.setBackground(Color.blue);
		lblinfo.setForeground(Color.pink);
		lblinfo.setHorizontalAlignment(0);
		panel2.add(lblinfo);
		
		JTextArea txtRegistro = new JTextArea();
		txtRegistro.setBounds(100,280,300,80);
		txtRegistro.setBorder(BorderFactory.createLineBorder(Color.black,2));
		panel2.add(txtRegistro);
		
		JLabel lblpref = new JLabel("preferencias");
		lblpref.setFont(fontRegistro);
		lblpref.setBounds(100,350,300,50);
		lblpref.setHorizontalAlignment(0);
		panel2.add(lblpref);
		
		JCheckBox cbxPref = new JCheckBox();
		cbxPref.setBounds(20,400,100,25);
		cbxPref.setText("Duelces");
		cbxPref.setOpaque(true);
		cbxPref.setBackground(Color.blue);
		cbxPref.setForeground(Color.pink);
		panel2.add(cbxPref);
		
		JCheckBox cbxPref2 = new JCheckBox();
		cbxPref2.setBounds(150,400,100,25);
		cbxPref2.setText("saladp");
		cbxPref2.setOpaque(true);
		cbxPref2.setBackground(Color.blue);
		cbxPref2.setForeground(Color.pink);
		panel2.add(cbxPref2);
		
		JCheckBox cbxPref3 = new JCheckBox();
		cbxPref3.setBounds(250,400,100,25);
		cbxPref3.setText("saladuable");
		cbxPref3.setOpaque(true);
		cbxPref3.setBackground(Color.blue);
		cbxPref3.setForeground(Color.pink);
		cbxPref3.setBorderPainted(true);
		cbxPref3.setBorder(BorderFactory.createLineBorder(Color.black,2));
		panel2.add(cbxPref3);
		
		JLabel lblpref2 = new JLabel("Terminos y condicioes");
		lblpref2.setFont(fontRegistro);
		lblpref2.setBounds(100,450,300,50);
		panel2.add(lblpref2);
		
		ButtonGroup grpTerms = new ButtonGroup();
		
		
		JRadioButton rdnPref = new JRadioButton();
		rdnPref.setBounds(20,500,100,25);
		rdnPref.setText("acepto los terminos");
		panel2.add(rdnPref);
		
		JRadioButton rdnPref2 = new JRadioButton();
		rdnPref2.setBounds(150,500,100,25);
		rdnPref2.setText("no acepto");
		
		panel2.add(rdnPref2);
		
		grpTerms.add(rdnPref);
		grpTerms.add(rdnPref2);
		
		String[] elementos = {"asjhdkja","hola","sheck"};
		JComboBox cmbx1 = new JComboBox(elementos);
		cmbx1.setBounds(100,550,100,50);
		panel2.add(cmbx1);
		
		JButton btnAceptar = new JButton();
		btnAceptar.setBounds(150,620,100,50);
		btnAceptar.setText("Crear");
		panel2.add(btnAceptar);
		
		this.add(panel2);

	}
	
	
	
	
	
	public void agregarElementos()
	{
		panel.setBounds(0,0,500,800);
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
		
		
		
		this.add(panel);
		
	}

}
