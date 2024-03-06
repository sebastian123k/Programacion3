import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ventana extends JFrame implements MouseListener{
	
	public Ventana()
	{
		
		this.setSize(1000,700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		addMouseListener(this);
			
	}
	
	@Override
	public void paint(Graphics g) {

		super.paint(g);
		
		Graphics g2d = (Graphics2D) g;
		
		g2d.setColor(Color.cyan);
		g2d.fillRect(0,0,1000,700);
		
		g2d.setColor(Color.BLACK);
		g2d.fillOval(85, 382, 130, 120);

		g2d.fillOval(65, 432, 130, 120);
	
		g2d.fillOval(105, 442, 130, 120);

	
		g2d.setColor(Color.GREEN);
		g2d.fillOval(100, 400, 100, 100);
		
		g2d.setColor(Color.GREEN);
		g2d.fillOval(80, 440, 100, 100);
		
		g2d.setColor(Color.GREEN);
		g2d.fillOval(120, 450, 100, 100);
		
		g2d.setColor(Color.GRAY);
		g2d.fillRect(0, 500, 1000, 200);
		
		
		/////////////////
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(360, 300, 150, 200);
		
		g2d.setColor(Color.blue);
		g2d.fillRect(370, 310, 130, 180);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(300, 400, 150, 100);
		
		g2d.setColor(Color.pink);
		g2d.fillRect(310, 410, 130, 80);
		
		g2d.setColor(Color.yellow);
		g2d.fillRect(70, 250, 60, 60);
		
		g2d.setColor(Color.yellow);
		g2d.fillRect(180, 120, 60, 60);
		
		g2d.setColor(Color.yellow);
		g2d.fillRect(242, 120, 60, 60);
		
		g2d.setColor(Color.yellow);
		g2d.fillRect(900, 190, 60, 60);
		
		g2d.setColor(Color.green);
		g2d.fillRect(700, 390, 80, 110);
		
		g2d.setColor(Color.green);
		g2d.fillRect(680, 360, 120, 40);
		
		g2d.setColor(Color.green);
		g2d.fillRect(850, 300, 200, 200);
		
		
		
		
		
		
		
		
		
		
		
		int mario[][] ={
				{0,0,0,0,0,1,1,1,1,1,0},
				{0,0,0,0,1,2,2,2,1,1,0},
				{0,0,0,1,2,2,1,1,1,1,0},
				{0,0,1,2,2,1,1,1,1,1,1},
				{0,0,1,2,2,1,1,1,1,1,1},
				{0,0,1,2,2,3,3,3,3,1,0},
				{0,0,1,2,3,3,3,1,3,1,0},
				{0,0,1,2,3,3,3,1,3,1,0},
				{0,0,1,2,3,3,3,3,3,3,0},
				};
		
		for(int x = 0;x<9;x++)
		{
			for(int y = 0;y<9;y++)
			{
				switch(mario[y][x])
				{
				case 1:
					g2d.setColor(Color.BLACK);
					
					g2d.fillRect(x*10+10,y*10+10, 10, 10);
				break;
				
				case 2:
					g2d.setColor(Color.green);
					
					g2d.fillRect(x*10+10,y*10+10, 10, 10);
				break;
				
				case 3:
					g2d.setColor(Color.yellow);
					
					g2d.fillRect(x*10+10,y*10+10, 10, 10);
				break;
				}
				
			}
		}
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



