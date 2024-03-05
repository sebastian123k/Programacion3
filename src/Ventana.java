import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

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
	
	JPanel bordeRojo = new JPanel();
	JPanel bordeRojo2 = new JPanel();
	
	JPanel bordeVerde = new JPanel();
	JPanel bordeVerde2 = new JPanel();
	
	JPanel panelRosa = new JPanel();
	JPanel panelVerde2 = new JPanel();

	JPanel panelDerecho = new JPanel();
	JPanel panelIzquierdo = new JPanel();
	
	JPanel bord1 = new JPanel();
	JPanel bord2 = new JPanel();
	
	public Ventana()
	{	
		this.setSize(800,770);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculando el interes");
		this.setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
		this.setLocationRelativeTo(null);
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
		panelMain.setSize(780,730);
		panelMain.setBorder(BorderFactory.createLineBorder(new Color(0,255,0,255),10));
		
		JLabel lblInteres = new JLabel("          Registro de usuarios");
		lblInteres.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,20));
		lblInteres.setBackground(new Color(0,255,0,255));
		lblInteres.setForeground(Color.red);
		lblInteres.setOpaque(true);
		panelMain.add(lblInteres,BorderLayout.NORTH);
		
		////////////////////////
		
		/////parte izquierda////
		
		panelIzquierdo.setLayout(new BorderLayout());
		panelIzquierdo.setBackground(new Color(100,250,200));
		panelIzquierdo.setSize(580,680);
		panelIzquierdo.setBorder(BorderFactory.createLineBorder(new Color(0,255,0,255),10));
		panelMain.add(panelIzquierdo,BorderLayout.CENTER);
		
		centro.setLayout(new BorderLayout());
		centro.setBackground(new Color(102,255,204));
		centro.setSize(580,680);
		centro.setBorder(BorderFactory.createLineBorder(new Color(0,255,0,255),10));
		panelIzquierdo.add(centro,BorderLayout.CENTER);
		
		
		borde.setLayout(new BorderLayout());
		borde.setBackground(new Color(100,250,200));
		borde.setBorder(BorderFactory.createLineBorder(new Color(100,250,200),10,true));
		centro.add(borde,BorderLayout.CENTER);
		

		borde2.setLayout(new BorderLayout());
		borde2.setBackground(new Color(100,250,200));
		borde2.setBorder(BorderFactory.createLineBorder(Color.gray,2,true));
		borde.add(borde2,BorderLayout.CENTER);
		
		JLabel lblCalcular = new JLabel("  Datos Generales");
		lblCalcular.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
		lblCalcular.setBackground(new Color(0,0,0,1));
		lblCalcular.setForeground(Color.black);
		lblCalcular.setOpaque(true);
		centro.add(lblCalcular,BorderLayout.NORTH);
	
		GridBagConstraints gbc = new GridBagConstraints();
		
		panelVerde.setLayout(new GridBagLayout());
		panelVerde.setBackground(new Color(100,250,200));
		borde2.add(panelVerde,BorderLayout.CENTER);
		
		
		gbc.insets = new Insets(20,0,0,50);
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel lblCapital = new JLabel("Nombres:");
		lblCapital.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblCapital.setBackground(new Color(0,0,0,1));
		lblCapital.setForeground(Color.black);
		lblCapital.setOpaque(true);
		panelVerde.add(lblCapital,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		
		JTextField txtfldCapital = new JTextField();
		txtfldCapital.setText("  Juan Carlos");
		txtfldCapital.setPreferredSize(new Dimension(140,25));
		panelVerde.add(txtfldCapital,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		
		JLabel lblTiempo = new JLabel("Apellido Paterno:");
		lblTiempo.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblTiempo.setBackground(new Color(0,0,0,1));
		lblTiempo.setForeground(Color.black);
		lblTiempo.setOpaque(true);
		lblTiempo.setHorizontalAlignment(0);
		panelVerde.add(lblTiempo,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		
		JTextField txtfldTiempo = new JTextField();
		txtfldTiempo.setText("  Arcilla");
		txtfldTiempo.setPreferredSize(new Dimension(140,25));
		panelVerde.add(txtfldTiempo,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		
		JLabel lblTasa = new JLabel("Apellido Materno:");
		lblTasa.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblTasa.setBackground(new Color(0,0,0,1));
		lblTasa.setForeground(Color.black);
		lblTasa.setOpaque(true);
		lblTasa.setHorizontalAlignment(0);
		panelVerde.add(lblTasa,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		
		JTextField txtfldTasa = new JTextField();
		txtfldTasa.setText("  Diaz");
		txtfldTasa.setPreferredSize(new Dimension(140,25));
		panelVerde.add(txtfldTasa,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		
		JLabel lblFecha = new JLabel("fecha de nacimiento");
		lblFecha.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblFecha.setBackground(new Color(0,0,0,1));
		lblFecha.setForeground(Color.black);
		lblFecha.setOpaque(true);
		lblFecha.setHorizontalAlignment(0);
		panelVerde.add(lblFecha,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		
		JLabel imgFecha = new JLabel();
		imgFecha.setIcon(new ImageIcon(getClass().getResource("fecha.jpeg")));
		imgFecha.setHorizontalAlignment(0);
		panelVerde.add(imgFecha,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblSexo.setBackground(new Color(0,0,0,1));
		lblSexo.setForeground(Color.black);
		lblSexo.setOpaque(true);
		lblSexo.setHorizontalAlignment(0);
		panelVerde.add(lblSexo,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		
		ButtonGroup btngSexo = new ButtonGroup();
	
		JRadioButton rdnMasculino = new JRadioButton("Masculino");
		rdnMasculino.setBackground(new Color(0,0,0,1));
		btngSexo.add(rdnMasculino);
		
		JRadioButton rdnFemenino = new JRadioButton("Femenino");
		rdnFemenino.setBackground(new Color(0,0,0,1));		
		btngSexo.add(rdnFemenino);
		
		panelVerde.add(rdnMasculino,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		
		panelVerde.add(rdnFemenino,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		
		JLabel lblNaci = new JLabel("Nacionalidad");
		lblNaci.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblNaci.setBackground(new Color(0,0,0,1));
		lblNaci.setForeground(Color.black);
		lblNaci.setOpaque(true);
		lblNaci.setHorizontalAlignment(0);
		panelVerde.add(lblNaci,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 6;
		
		String[] elementos = {"peru                                ","hola","sheck"};
		JComboBox cmbx1 = new JComboBox(elementos);
		panelVerde.add(cmbx1,gbc);
		//////////////////////////////
		//////////////////////////
		/////////////////////////////////////////////
	////////////////////////////////////////////
		////panelsur izquierdo///
		
		bord1.setLayout(new GridLayout(1,1));
		bord1.setBackground(new Color(251,157,156));
		bord1.setBorder(BorderFactory.createLineBorder(new Color(0,255,0,255),10));
		panelIzquierdo.add(bord1,BorderLayout.SOUTH);
		
		bord2.setLayout(new BorderLayout());
		bord2.setBackground(new Color(255,102,102));
		bord2.setBorder(BorderFactory.createLineBorder(new Color(255,102,102),10));
		bord1.add(bord2);
		
		JLabel lblDatos = new JLabel("Datos Opcionales");
		lblDatos.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
		lblDatos.setBackground(new Color(255,102,102));
		lblDatos.setForeground(Color.black);
		lblDatos.setOpaque(true);
		bord2.add(lblDatos,BorderLayout.NORTH);
		
		panelRojo.setLayout(new GridBagLayout());
		panelRojo.setBackground(new Color(255,102,102));
		panelRojo.setBorder(BorderFactory.createLineBorder(Color.red,2));
		bord2.add(panelRojo,BorderLayout.CENTER);
		
		GridBagConstraints gbc4 = new GridBagConstraints();
		
		gbc4.insets = new Insets(0,0,0,0);
		
		gbc4.gridx = 0;
		gbc4.gridy = 0;
		
		JLabel lblInteres2 = new JLabel("Interes:");
		lblInteres2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblInteres2.setBackground(new Color(0,0,0,1));
		lblInteres2.setForeground(Color.black);
		lblInteres2.setOpaque(true);
		lblInteres2.setHorizontalAlignment(0);
		panelRojo.add(lblInteres2,gbc4);
		
		gbc4.gridx = 2;
		gbc4.gridy = 0;
		
		JLabel lblNada = new JLabel("      ");
		lblNada.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblNada.setBackground(new Color(0,0,0,1));
		lblNada.setForeground(Color.black);
		lblNada.setOpaque(true);
		lblNada.setHorizontalAlignment(0);
		panelRojo.add(lblNada,gbc4);
		
		gbc4.gridx = 3;
		gbc4.gridy = 0;
		
		JLabel lblPref = new JLabel("preferencias");
		lblPref.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
		lblPref.setBackground(new Color(0,0,0,1));
		lblPref.setForeground(Color.black);
		lblPref.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,1),8));
		lblPref.setOpaque(true);
		lblPref.setHorizontalAlignment(0);
		panelRojo.add(lblPref,gbc4);
		
		

		
		gbc4.gridx = 0;
		gbc4.gridy = 1;
		
		JTextArea cmbxHola = new JTextArea("Hola amigos \nde youtube gracias \npor compartir\nmis videos");
		cmbxHola.setPreferredSize(new Dimension(150,100));
		JScrollPane sbHola = new JScrollPane(cmbxHola);
		
		sbHola.setPreferredSize(new Dimension(150,20));
		sbHola.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		JScrollPane sbHola2 = new JScrollPane(cmbxHola);
		sbHola2.setPreferredSize(new Dimension(20,100));
		sbHola2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		panelRojo.add(cmbxHola,gbc4);
		
		gbc4.gridx = 0;
		gbc4.gridy = 2;
		
		panelRojo.add(sbHola,gbc4);
	
		gbc4.gridx = 1;
		gbc4.gridy = 1;
		
		panelRojo.add(sbHola2,gbc4);
		
		gbc4.gridx = 3;
		gbc4.gridy = 1;
		
		
		JTextArea cmbxOpciones = new JTextArea("  Cantar \n  escuchar musica \n  Leer \n  Deportes \n  Otros");
		cmbxOpciones.setPreferredSize(new Dimension(150,100));
		JScrollPane sbHola3 = new JScrollPane(cmbxOpciones);
		sbHola3.setPreferredSize(new Dimension(20,100));
		sbHola3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panelRojo.add(cmbxOpciones,gbc4);
		
		gbc4.gridx = 4;
		gbc4.gridy = 1;
		
		
		panelRojo.add(sbHola3,gbc4);
		
		
		
		////////////////////////////parte derecha
		///////////////////////////////
		///////////////////////////////////
		////////////////////////
		///////////////////
		
		
		panelDerecho.setLayout(new BorderLayout());
		panelDerecho.setBackground(new Color(255,153,153));
		
		panelMain.add(panelDerecho,BorderLayout.EAST);
		
		
		
		bordeRojo.setLayout(new GridLayout(1,1));
		bordeRojo.setBackground(new Color(251,157,156));
		bordeRojo.setBorder(BorderFactory.createLineBorder(new Color(0,255,0,255),10));
		panelDerecho.add(bordeRojo,BorderLayout.CENTER);
		
		bordeRojo2.setLayout(new BorderLayout());
		bordeRojo2.setBackground(new Color(251,157,156));
		bordeRojo2.setBorder(BorderFactory.createLineBorder(new Color(251,157,156),10));
		bordeRojo.add(bordeRojo2,BorderLayout.CENTER);
		
		JLabel lblUsuario = new JLabel("Perfil de usuario");
		lblUsuario.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15));
		lblUsuario.setBackground(new Color(251,157,156));
		lblUsuario.setForeground(Color.black);
		lblUsuario.setOpaque(true);
		bordeRojo2.add(lblUsuario,BorderLayout.NORTH);
		
		GridBagConstraints gbc2 = new GridBagConstraints();
		
		panelRosa.setLayout(new GridBagLayout());
		panelRosa.setBackground(new Color(255,153,153));
		panelRosa.setBorder(BorderFactory.createLineBorder(Color.red,2));
		bordeRojo2.add(panelRosa,BorderLayout.CENTER);
		
		gbc2.insets = new Insets(10,10,10,10);
		gbc2.gridx = 0;
		gbc2.gridy = 0;
		
		JLabel imgFoto = new JLabel();
		imgFoto.setIcon(new ImageIcon(getClass().getResource("foto.jpeg")));
		imgFoto.setBounds(330,530,100,32);
		imgFoto.setHorizontalAlignment(0);
		panelRosa.add(imgFoto,gbc2);
		
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		
		JCheckBox cbxFoto = new JCheckBox("Mostra Foto de perfil");
		cbxFoto.setBackground(new Color(0,0,0,1));
		panelRosa.add(cbxFoto,gbc2);
		
		
		gbc2.gridx = 0;
		gbc2.gridy = 2;
		
		JCheckBox cbxFecha = new JCheckBox("Mostra Fecha de nacimiento");
		cbxFecha.setBackground(new Color(0,0,0,1));
		panelRosa.add(cbxFecha,gbc2);
		
		
		///panel sur derecho
		
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.insets = new Insets(20,10,20,10);
		
		panelVerde2.setLayout(new GridBagLayout());
		panelVerde2.setBackground(new Color(102,255,204));
		panelVerde2.setBorder(BorderFactory.createLineBorder(new Color(0,255,0,255),10));
		panelDerecho.add(panelVerde2,BorderLayout.SOUTH);
		
		gbc3.gridx = 0;
		gbc3.gridy = 0;
		
		JLabel imgCancelar = new JLabel();
		imgCancelar.setIcon(new ImageIcon(getClass().getResource("botonsillo.jpeg")));
		panelVerde2.add(imgCancelar,gbc3);
		
		gbc3.gridx = 0;
		gbc3.gridy = 1;
		
		JLabel imgCalcular = new JLabel();
		imgCalcular.setIcon(new ImageIcon(getClass().getResource("botonsote.jpeg")));
		panelVerde2.add(imgCalcular,gbc3);
		
		gbc3.gridx = 0;
		gbc3.gridy = 2;
		
		JLabel imgSalir = new JLabel();
		imgSalir.setIcon(new ImageIcon(getClass().getResource("salir.jpeg")));
		panelVerde2.add(imgSalir,gbc3);
		
		
		
		
		
		
		
		
		
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
