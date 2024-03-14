import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public  class Ventana extends JFrame implements MouseListener{
	
	
	public Ventana()
	{
		
		this.setSize(1000,580);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.addButtons();

			
	}
	
	public void addButtons()
	{
		JPanel pnBotones = new JPanel();
		pnBotones.setBounds(0,0,1000,500);
		pnBotones.setLayout(null);
		pnBotones.setBackground(Color.white);
		
		JButton btnClick = new JButton("holanda");
		btnClick.setBounds(100,100,100,100);
		btnClick.setBackground(Color.red);
		pnBotones.add(btnClick);
		
		btnClick.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int x = (int) (Math.random() * 1000) + 1;
				int y =(int) (Math.random() * 580) + 1;
				int s  = (int) (Math.random() * 200) + 1;
				int h = (int) (Math.random() * 200) + 1;
				
				JButton btnClick2 = new JButton("presioname");
				btnClick2.setBounds(x,y,s,h);
				btnClick2.setBackground(new Color(((int) (Math.random() * 255) + 1),((int) (Math.random() * 255) + 1),((int) (Math.random() * 255) + 1)));
				btnClick2.setOpaque(true);
				btnClick2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						String hola = JOptionPane.showInputDialog(btnClick2.getText());
						
					}});
				
				pnBotones.add(btnClick2);
				pnBotones.repaint();
				
			}});
		
		this.add(pnBotones);
		
	}





	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX()/10);
		System.out.println(e.getY()/10);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

}






