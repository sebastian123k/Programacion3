
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public  class Ventana extends JFrame implements MouseListener{
	
	JPanel pnBotones = new JPanel();
	
	public Ventana()
	{
		
		this.setSize(1000,580);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.addButtons();
		addMouseListener(this);
				
	}
	
	public void addButtons()
	{
		
		pnBotones.setBounds(0,0,1000,500);
		pnBotones.setLayout(null);
		pnBotones.setBackground(Color.white);
		
		JButton btnClick = new JButton("holanda");
		btnClick.setBounds(100,100,100,100);
		btnClick.setBackground(Color.red);
		btnClick.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int z = (int) (Math.random() * 200) + 1;
				int h = (int) (Math.random() * 200) + 1;
				
				int x = (int) (Math.random() * 1000) + 1;
				int y = (int) (Math.random() * 500) + 1;
				
				JButton btn = new JButton("hola");
				btn.setBounds(x,y,z,h);
				btn.setOpaque(true);
				btn.setBackground(new Color(((int) (Math.random() * 200) + 1),((int) (Math.random() * 200) + 1),((int) (Math.random() * 200) + 1)));
				btn.setText(Integer.toString((int) Math.random() / 100 + 1));
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						pnBotones.remove(btn);
						pnBotones.revalidate();
						pnBotones.repaint();
						
					}});

				
				pnBotones.add(btn);
				pnBotones.repaint();
				
			}});
		pnBotones.add(btnClick);
		
		
		this.add(pnBotones);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {

		
		
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
		
		pnBotones.setBackground(new Color(((int) (Math.random() * 200) + 1),((int) (Math.random() * 200) + 1),((int) (Math.random() * 200) + 1)));
		
	}

}
