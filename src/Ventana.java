import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Ventana extends JFrame {
	
	
	JPanel panel = new JPanel();
	
	public Ventana()
	{
		this.setSize(440,380);
		this.setLayout(null);
		this.setTitle("Calculadora");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.agregarElementos();
		this.add(panel);
		this.setVisible(true);
	
	}
	
	public void agregarElementos()
	{
		panel.setBounds(0,-120,500,500);
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,25);
		
		JTextField txtMain = new JTextField();
		txtMain.setBounds(10,150,400,50);
		txtMain.setText("0");
		txtMain.setFont(font);
		txtMain.setHorizontalAlignment(0);	
		txtMain.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.add(txtMain);
		
		JButton btnDiv = new JButton();
		btnDiv.setBounds(310,200,100,50);
		btnDiv.setText("/");
		btnDiv.setBorderPainted(true);	
		btnDiv.setBorder(BorderFactory.createLineBorder(Color.black));
		btnDiv.setOpaque(true);
		btnDiv.setBackground(Color.white);
		btnDiv.setFont(font);
		btnDiv.setForeground(Color.blue);
		panel.add(btnDiv);
		
		JButton btnMulti = new JButton();
		btnMulti.setBounds(310,250,100,50);
		btnMulti.setText("*");
		btnMulti.setBorderPainted(true);	
		btnMulti.setBorder(BorderFactory.createLineBorder(Color.black));
		btnMulti.setOpaque(true);
		btnMulti.setBackground(Color.white);
		btnMulti.setFont(font);
		btnMulti.setForeground(Color.blue);
		panel.add(btnMulti);
		
		JButton btnResta = new JButton();
		btnResta.setBounds(310,300,100,50);
		btnResta.setText("-");
		btnResta.setBorderPainted(true);	
		btnResta.setBorder(BorderFactory.createLineBorder(Color.black));
		btnResta.setOpaque(true);
		btnResta.setBackground(Color.white);
		btnResta.setForeground(Color.blue);
		btnResta.setFont(font);
		panel.add(btnResta);
		
		JButton btnSuma = new JButton();
		btnSuma.setBounds(310,350,100,50);
		btnSuma.setText("+");
		btnSuma.setBorderPainted(true);	
		btnSuma.setBorder(BorderFactory.createLineBorder(Color.black));
		btnSuma.setOpaque(true);
		btnSuma.setBackground(Color.white);
		btnSuma.setForeground(Color.blue);
		btnSuma.setFont(font);
		panel.add(btnSuma);
		
		JButton btnPunto = new JButton();
		btnPunto.setBounds(210,400,100,50);
		btnPunto.setText(".");
		btnPunto.setBorderPainted(true);	
		btnPunto.setBorder(BorderFactory.createLineBorder(Color.black));
		btnPunto.setOpaque(true);
		btnPunto.setBackground(Color.white);
		btnPunto.setForeground(Color.blue);
		btnPunto.setFont(font);
		panel.add(btnPunto);
		
		JButton btnExpandir = new JButton();
		btnExpandir.setBounds(10,400,100,50);
		btnExpandir.setText("[]");
		btnExpandir.setBorderPainted(true);	
		btnExpandir.setBorder(BorderFactory.createLineBorder(Color.black));
		btnExpandir.setOpaque(true);
		btnExpandir.setBackground(Color.white);
		btnExpandir.setFont(font);
		btnExpandir.setForeground(Color.blue);
		panel.add(btnExpandir);
		
		JButton btnAceptar = new JButton();
		btnAceptar.setBounds(310,400,100,50);
		btnAceptar.setText("Aceptar");
		btnAceptar.setBorderPainted(true);	
		btnAceptar.setBorder(BorderFactory.createLineBorder(Color.black));
		btnAceptar.setOpaque(true);
		btnAceptar.setBackground(Color.white);
		btnAceptar.setForeground(Color.blue);
		btnAceptar.setFont(font);
		panel.add(btnAceptar);

		///////////////////////////////////
		
		JButton btnPorcentaje = new JButton();
		btnPorcentaje.setBounds(210,200,100,50);
		btnPorcentaje.setText("%");
		btnPorcentaje.setBorderPainted(true);	
		btnPorcentaje.setBorder(BorderFactory.createLineBorder(Color.black));
		btnPorcentaje.setOpaque(true);
		btnPorcentaje.setBackground(Color.white);
		btnPorcentaje.setForeground(Color.blue);
		btnPorcentaje.setFont(font);
		panel.add(btnPorcentaje);
		
		JButton btnBorrar = new JButton();
		btnBorrar.setBounds(110,200,100,50);
		btnBorrar.setText("<X]");
		btnBorrar.setBorderPainted(true);	
		btnBorrar.setBorder(BorderFactory.createLineBorder(Color.black));
		btnBorrar.setOpaque(true);
		btnBorrar.setBackground(Color.white);
		btnBorrar.setForeground(Color.blue);
		btnBorrar.setFont(font);
		panel.add(btnBorrar);
		
		JButton btnAC = new JButton();
		btnAC.setBounds(10,200,100,50);
		btnAC.setText("AC");
		btnAC.setBorderPainted(true);	
		btnAC.setBorder(BorderFactory.createLineBorder(Color.black));
		btnAC.setOpaque(true);
		btnAC.setBackground(Color.white);
		btnAC.setFont(font);
		btnAC.setForeground(Color.blue);
		panel.add(btnAC);

		
		JButton btn9 = new JButton();
		btn9.setBounds(210,250,100,50);
		btn9.setText("9");
		btn9.setBorderPainted(true);	
		btn9.setBorder(BorderFactory.createLineBorder(Color.black));
		btn9.setOpaque(true);
		btn9.setBackground(Color.white);
		btn9.setFont(font);
		panel.add(btn9);
		
		JButton btn8 = new JButton();
		btn8.setBounds(110,250,100,50);
		btn8.setText("8");
		btn8.setBorderPainted(true);	
		btn8.setBorder(BorderFactory.createLineBorder(Color.black));
		btn8.setOpaque(true);
		btn8.setBackground(Color.white);
		btn8.setFont(font);
		panel.add(btn8);
		
		JButton btn7 = new JButton();
		btn7.setBounds(10,250,100,50);
		btn7.setText("7");
		btn7.setBorderPainted(true);	
		btn7.setBorder(BorderFactory.createLineBorder(Color.black));
		btn7.setOpaque(true);
		btn7.setBackground(Color.white);
		btn7.setFont(font);
		panel.add(btn7);

		
		JButton btn6 = new JButton();
		btn6.setBounds(210,300,100,50);
		btn6.setText("6");
		btn6.setBorderPainted(true);	
		btn6.setBorder(BorderFactory.createLineBorder(Color.black));
		btn6.setOpaque(true);
		btn6.setBackground(Color.white);
		btn6.setFont(font);
		panel.add(btn6);
		
		JButton btn5 = new JButton();
		btn5.setBounds(110,300,100,50);
		btn5.setText("5");
		btn5.setBorderPainted(true);	
		btn5.setBorder(BorderFactory.createLineBorder(Color.black));
		btn5.setOpaque(true);
		btn5.setBackground(Color.white);
		btn5.setFont(font);
		panel.add(btn5);
		
		JButton btn4 = new JButton();
		btn4.setBounds(10,300,100,50);
		btn4.setText("4");
		btn4.setBorderPainted(true);	
		btn4.setBorder(BorderFactory.createLineBorder(Color.black));
		btn4.setOpaque(true);
		btn4.setBackground(Color.white);
		btn4.setFont(font);
		panel.add(btn4);

		
		JButton btn3 = new JButton();
		btn3.setBounds(210,350,100,50);
		btn3.setText("3");
		btn3.setBorderPainted(true);	
		btn3.setBorder(BorderFactory.createLineBorder(Color.black));
		btn3.setOpaque(true);
		btn3.setBackground(Color.white);
		btn3.setFont(font);
		panel.add(btn3);
		
		JButton btn2 = new JButton();
		btn2.setBounds(110,350,100,50);
		btn2.setText("2");
		btn2.setBorderPainted(true);	
		btn2.setBorder(BorderFactory.createLineBorder(Color.black));
		btn2.setOpaque(true);
		btn2.setBackground(Color.white);
		btn2.setFont(font);
		panel.add(btn2);
		
		JButton btn1 = new JButton();
		btn1.setBounds(10,350,100,50);
		btn1.setText("1");
		btn1.setBorderPainted(true);	
		btn1.setBorder(BorderFactory.createLineBorder(Color.black));
		btn1.setOpaque(true);
		btn1.setBackground(Color.white);
		btn1.setFont(font);
		panel.add(btn1);
		
		
		JButton btn0 = new JButton();
		btn0.setBounds(110,400,100,50);
		btn0.setText("0");
		btn0.setBorderPainted(true);	
		btn0.setBorder(BorderFactory.createLineBorder(Color.black));
		btn0.setOpaque(true);
		btn0.setBackground(Color.white);
		btn0.setFont(font);
		panel.add(btn0);
		
		
		
	}

}
