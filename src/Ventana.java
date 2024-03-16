import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public  class Ventana extends JFrame implements MouseListener, KeyListener{
	
	JPanel pnBotones = new JPanel();
	
	public Ventana()
	{
		
		this.setSize(1000,580);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.addButtons();
		addMouseListener(this);
		addKeyListener(this);
		

			
	}
	
	public void addButtons()
	{
		
		pnBotones.setBounds(0,0,1000,500);
		pnBotones.setLayout(null);
		pnBotones.setBackground(Color.white);
		
		JButton btnClick = new JButton("holanda");
		btnClick.setBounds(100,100,100,100);
		btnClick.setBackground(Color.red);
		pnBotones.add(btnClick);
		
		
		
		this.add(pnBotones);
		
	}





	@Override
	public void mouseClicked(MouseEvent e) {

		int z = (int) (Math.random() * 200) + 1;
		int h = (int) (Math.random() * 200) + 1;
		JButton btn = new JButton("hola");
		btn.setBounds(e.getX(),e.getY(),z,h);
		btn.setOpaque(true);
		btn.setBackground(new Color(((int) (Math.random() * 200) + 1),((int) (Math.random() * 200) + 1),((int) (Math.random() * 200) + 1)));
		btn.setText(Integer.toString((int) Math.random() / 100 + 1));
		
		pnBotones.add(btn);
		pnBotones.repaint();
		
	
		System.out.println("holanda");
	}



	@Override
	public void mousePressed(MouseEvent e) {
		
		
		

		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_DELETE)
		{
			pnBotones.removeAll();
			pnBotones.repaint();
		}
		
		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}




