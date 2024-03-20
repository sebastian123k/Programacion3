import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public  class Ventana extends JFrame {
	
	JPanel pnBotones = new JPanel();
	JPanel pnGato = new JPanel();
	
	////
	boolean turno = false;
	JButton btn[] = new JButton[9];
	///
	
	public Ventana()
	{
		
		this.setSize(580,580);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		//this.addButtons();
		//addMouseListener(this);
		//addKeyListener(this);
		this.addCatgame();
			
	}
	
	String letra = "X";
	public void comprobarGanador()
	{
		letra = "X";
		winner();
		letra = "O";
		winner();
	}
	
	public void winner()
	{
		for(int i = 0;i<9;i+=3)
		{
			if(btn[i].getText().equals(letra) && btn[i+1].getText().equals(letra) && btn[i+2].getText().equals(letra))
			{
				String tilin = JOptionPane.showInputDialog(this,"el ganador es "+ letra ,JOptionPane.QUESTION_MESSAGE);
			}
		}	
		
		for(int i=0;i<3;i++)
		{
			if(btn[i].getText().equals(letra) && btn[i+3].getText().equals(letra) && btn[i+6].getText().equals(letra))
			{
				String tilin = JOptionPane.showInputDialog(this,"el ganador es "+ letra ,JOptionPane.QUESTION_MESSAGE);
			}
		}
		
		if(btn[0].getText().equals(letra) && btn[4].getText().equals(letra) && btn[8].getText().equals(letra))
		{
			String tilin = JOptionPane.showInputDialog(this,"el ganador es "+ letra ,JOptionPane.QUESTION_MESSAGE);
		}
		
		if(btn[2].getText().equals(letra) && btn[4].getText().equals(letra) && btn[6].getText().equals(letra))
		{
			String tilin = JOptionPane.showInputDialog(this,"el ganador es "+ letra ,JOptionPane.QUESTION_MESSAGE);
		}
	}
	
	
	public void addCatgame()

	{
		pnGato.setBounds(0,0,500,500);
		pnGato.setLayout(new GridLayout(3,3));
		pnGato.setBackground(Color.white);
		
		
		for(int i = 0;i<9;i++)
		{
			btn[i] = new JButton(" ");
			btn[i].setOpaque(true);
			btn[i].setBackground(new Color(200,0,0));
			btn[i].setForeground(Color.cyan);
			btn[i].setFont(new Font(Font.SANS_SERIF,Font.BOLD,40));
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					JButton btnAux = ((JButton) e.getSource());
					
					if(btnAux.getText().equals(" ")) 
					{
						if(turno)
						{
							((JButton) e.getSource()).setText("O");
							turno = !turno;
							
						}
						else
						{
							((JButton) e.getSource()).setText("X");
							turno = !turno;
						}
						
						comprobarGanador();
						
					}
				
					
				}});
			
			
			pnGato.add(btn[i]);
		}
		

		this.add(pnGato);
		pnGato.revalidate();
		pnGato.repaint();
	
		
	}
	









}





