import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.*;

public class Ventana extends JFrame {
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panelTrasero = new JPanel();
	
	
	JPanel panelMain = new JPanel();
	JPanel centro = new JPanel();
	JPanel panelVerde = new JPanel();
	JPanel panelRojo = new JPanel();
	JPanel panelVerdeSur = new JPanel();
	JPanel borde = new JPanel();
	JPanel borde2 = new JPanel();
	
	public Ventana()
	{	
		this.setSize(450,570);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculando el interes");
		this.setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
		//this.agregarImagenes();
		//this.agregarElementos();
		//this.agregarRegistro();
		//this.admin();	
		this.diseno();
		this.setVisible(true);
	}
	
	public void diseno()
	{
		//panelmain//////////////////////
		
		panelMain.setLayout(new BorderLayout());
		panelMain.setBackground(Color.red);
		panelMain.setSize(430,530);
		panelMain.setBorder(BorderFactory.createLineBorder(Color.white,10));
		
		JLabel lblInteres = new JLabel(" Interes");
		lblInteres.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,30));
		lblInteres.setBackground(Color.white);
		lblInteres.setForeground(Color.red);
		lblInteres.setOpaque(true);
		panelMain.add(lblInteres,BorderLayout.NORTH);
		
		////////////////////////
		/////panelcenthro////
		
		centro.setLayout(new BorderLayout());
		centro.setBackground(new Color(156,249,156));
		centro.setSize(580,680);
		centro.setBorder(BorderFactory.createLineBorder(Color.white,10));
		panelMain.add(centro,BorderLayout.CENTER);
		
		
		borde.setLayout(new BorderLayout());
		borde.setBackground(new Color(156,249,156));
		borde.setBorder(BorderFactory.createLineBorder(new Color(156,249,156),10));
		centro.add(borde,BorderLayout.CENTER);
		

		borde2.setLayout(new BorderLayout());
		borde2.setBackground(new Color(156,249,156));
		borde2.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		borde.add(borde2,BorderLayout.CENTER);
		
		JLabel lblCalcular = new JLabel("  Calcular Interes");
		lblCalcular.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
		lblCalcular.setBackground(new Color(156,249,156));
		lblCalcular.setForeground(Color.black);
		lblCalcular.setOpaque(true);
		centro.add(lblCalcular,BorderLayout.NORTH);
		
		panelVerde.setLayout(new GridLayout(4,2));
		panelVerde.setBackground(new Color(156,249,156));
		panelVerde.setBorder(BorderFactory.createLineBorder(new Color(156,249,156),10));
		borde2.add(panelVerde,BorderLayout.CENTER);
		
		
		JLabel lblCapital = new JLabel("Capital:");
		lblCapital.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblCapital.setBackground(new Color(156,249,156));
		lblCapital.setForeground(Color.black);
		lblCapital.setOpaque(true);
		lblCapital.setHorizontalAlignment(0);
		panelVerde.add(lblCapital);
		
		JTextField txtfldCapital = new JTextField();
		txtfldCapital.setBorder(BorderFactory.createLineBorder(new Color(156,249,156),20));
		txtfldCapital.setText("  1500");
		panelVerde.add(txtfldCapital);
		
		JLabel lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblTiempo.setBackground(new Color(156,249,156));
		lblTiempo.setForeground(Color.black);
		lblTiempo.setOpaque(true);
		lblTiempo.setHorizontalAlignment(0);
		panelVerde.add(lblTiempo);
		
		JTextField txtfldTiempo = new JTextField();
		txtfldTiempo.setBorder(BorderFactory.createLineBorder(new Color(156,249,156),20));
		txtfldTiempo.setText("  2");
		panelVerde.add(txtfldTiempo);
		
		JLabel lblTasa = new JLabel("             Tasa de interes:");
		lblTasa.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblTasa.setBackground(new Color(156,249,156));
		lblTasa.setForeground(Color.black);
		lblTasa.setOpaque(true);
		lblTasa.setHorizontalAlignment(0);
		panelVerde.add(lblTasa);
		
		JTextField txtfldTasa = new JTextField();
		txtfldTasa.setBorder(BorderFactory.createLineBorder(new Color(156,249,156),20));
		txtfldTasa.setText("  0.1");
		panelVerde.add(txtfldTasa);
		
		JLabel imgCalcular = new JLabel();
		imgCalcular.setIcon(new ImageIcon(getClass().getResource("botonsote.jpeg")));
		imgCalcular.setBounds(330,530,100,32);
		imgCalcular.setHorizontalAlignment(0);
		panelVerde.add(imgCalcular);
		
		JLabel imgCancelar = new JLabel();
		imgCancelar.setIcon(new ImageIcon(getClass().getResource("botonsillo.jpeg")));
		imgCancelar.setBounds(330,530,100,32);
		imgCancelar.setHorizontalAlignment(0);
		panelVerde.add(imgCancelar);
		
		
		
		
		
		////panelsur///
		
		
		panelRojo.setLayout(new GridLayout(2,2));
		panelRojo.setBackground(new Color(251,157,156));
		panelRojo.setBorder(BorderFactory.createLineBorder(Color.white,10));
		panelMain.add(panelRojo,BorderLayout.SOUTH);
		
		JLabel lblInteres2 = new JLabel("Interes:");
		lblInteres2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblInteres2.setBackground(new Color(251,157,156));
		lblInteres2.setForeground(Color.black);
		lblInteres2.setBorder(BorderFactory.createLineBorder(new Color(251,157,156),25));
		lblInteres2.setOpaque(true);
		lblInteres2.setHorizontalAlignment(0);
		panelRojo.add(lblInteres2);
		
		JTextField txtfldInteres = new JTextField();
		txtfldInteres.setBorder(BorderFactory.createLineBorder(new Color(251,157,156),20));
		txtfldInteres.setText("  315.000000002");
		panelRojo.add(txtfldInteres);
		
		JLabel lblMonto = new JLabel("Monto:");
		lblMonto.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblMonto.setBackground(new Color(251,157,156));
		lblMonto.setForeground(Color.black);
		lblMonto.setBorder(BorderFactory.createLineBorder(new Color(251,157,156),25));
		lblMonto.setOpaque(true);
		lblMonto.setHorizontalAlignment(0);
		panelRojo.add(lblMonto);
		
		JTextField txtfldMonto = new JTextField();
		txtfldMonto.setBorder(BorderFactory.createLineBorder(new Color(251,157,156),20));
		txtfldMonto.setText("  1815.000000002");
		panelRojo.add(txtfldMonto);
		
		
		
		
		
		this.add(panelMain);
		
	}
	
	public void agregarElementos()
	{
		
		
		panelTrasero.setBounds(0,0,770,650);
		panelTrasero.setLayout(null);
		panelTrasero.setBackground(new Color(39,63,100));
		
		
		
		JLabel lblUsuario2 = new JLabel();
		Font fontUsuario2 = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblUsuario2.setFont(fontUsuario2);
		lblUsuario2.setBounds(290,500,300,25);
		lblUsuario2.setText("Dont have an Account?");
		lblUsuario2.setBackground(new Color(0,0,0,1));
		lblUsuario2.setForeground(new Color(255,255,255));
		panelTrasero.add(lblUsuario2);
		

		JLabel lblIngresar2 = new JLabel();
		Font fontIngresar2 = new Font(Font.SANS_SERIF,Font.ITALIC,30);
		lblIngresar2.setFont(fontIngresar2);
		lblIngresar2.setBounds(210,20,300,50);
		lblIngresar2.setText("User Login");
		lblIngresar2.setOpaque(true);
		lblIngresar2.setHorizontalAlignment(0);
		lblIngresar2.setBackground(new Color(0,0,0,1));
		lblIngresar2.setForeground(new Color(255,255,255));
		panelTrasero.add(lblIngresar2);
		
		JLabel lblImagen3 = new JLabel();
		lblImagen3.setIcon(new ImageIcon(getClass().getResource("boton2.png")));
		lblImagen3.setBounds(330,530,100,32);
		panelTrasero.add(lblImagen3);
		
		
		
		panel.setBounds(100,100,550,400);
		panel.setLayout(null);
		panel.setBackground(new Color(39,63,120));
		
		
		JLabel lblIngresar = new JLabel();
		Font fontIngresar = new Font(Font.SANS_SERIF,Font.ITALIC,50);
		lblIngresar.setFont(fontIngresar);
		lblIngresar.setBounds(120,20,300,70);
		lblIngresar.setText("My Account");
		lblIngresar.setOpaque(true);
		lblIngresar.setHorizontalAlignment(0);
		lblIngresar.setBackground(new Color(0,0,0,1));
		lblIngresar.setForeground(new Color(216,199,137));
		panel.add(lblIngresar);
		
		
		
		
		JLabel lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(getClass().getResource("icono.png")));
		lblImagen.setBounds(92,150,32,32);
		panel.add(lblImagen);
		
		JLabel lblImagen2 = new JLabel();
		lblImagen2.setIcon(new ImageIcon(getClass().getResource("icono2.png")));
		lblImagen2.setBounds(92,250,32,32);
		panel.add(lblImagen2);

		
		JLabel lblUsuario = new JLabel();
		Font fontUsuario = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblUsuario.setFont(fontUsuario);
		lblUsuario.setBounds(120,120,300,25);
		lblUsuario.setText("Enter your Username");
		lblUsuario.setOpaque(true);
		lblUsuario.setBackground(new Color(0,0,0,1));
		lblUsuario.setForeground(new Color(255,255,255));
		panel.add(lblUsuario);
		
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(120,150,300,35);
		panel.add(txtUsuario);
		
		JLabel lblContrasena = new JLabel();
		Font fontContrasena = new Font(Font.SANS_SERIF,Font.ITALIC,15);
		lblContrasena.setFont(fontContrasena);
		lblContrasena.setBounds(120,220,300,25);
		lblContrasena.setText("Enter your Pasword");
		lblContrasena.setOpaque(true);
		lblContrasena.setBackground(new Color(0,0,0,1));
		lblContrasena.setForeground(new Color(255,255,255));
		panel.add(lblContrasena);
		
		JTextField pwUsuario = new JTextField();
		pwUsuario.setBounds(120,250,300,35);
		pwUsuario.setText("  PASWORD");
		pwUsuario.setForeground(new Color(100,100,100,100));
		panel.add(pwUsuario);
		
		
		JLabel btnAceptar = new JLabel();
		btnAceptar.setIcon(new ImageIcon(getClass().getResource("botonsito.png")));
		btnAceptar.setBounds(200,320,200,50);
		panel.add(btnAceptar);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo.setBounds(0,0,770,650);
		panelTrasero.add(fondo);
		
		JLabel fondo2 = new JLabel();
		fondo2.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondo2.setBounds(1,-250,548,648);
		panel.add(fondo2);
		
		
		
		this.add(panel);
		this.add(panelTrasero);
		
	}
	
	public void agregarImagenes()
	{
		panel4.setBounds(0,0,1000,800);
		panel4.setLayout(null);
		panel4.setBackground(Color.red);
		
		JLabel lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(getClass().getResource("spider.png")));
		lblImagen.setBounds(10,10,500,500);
		panel4.add(lblImagen);
		this.add(panel4);
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
	
	
	
	
	
	

}
