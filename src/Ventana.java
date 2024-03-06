import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana()
	{
		
		this.setSize(700,700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
			
	}
	
	@Override
	public void paint(Graphics g) {

		super.paint(g);
		
		Graphics g2d = (Graphics2D) g;
		
		g2d.setColor(Color.BLUE);
		g2d.fillRect(0, 0, 700, 700);
		
		g2d.setColor(Color.GRAY);
		g2d.fillRect(430, 160, 70, 100);
		
		g2d.setColor(Color.GRAY);
		g2d.fillRect(420, 120, 90, 40);
		
		g2d.setColor(Color.BLACK);
		int x[] = {430,500,500};
		int y[] = {160,160,190};
		g2d.fillPolygon(new Polygon(x,y,3));
		
		g2d.setColor(Color.orange);
		g2d.fillRect(0, 400, 700, 100);
		
		for(int xi = 10;xi<700; xi+=60)
		{
		
			g2d.setColor(Color.orange);
			g2d.fillRect(xi,360, 50, 250);
			
			int x3[] = {xi,xi+25,xi+50};
			int y3[] = {360,320,360};
			g2d.fillPolygon(new Polygon(x3,y3,3));
				
		}
		
		g2d.setColor(Color.RED);
		int x2[] = {150,290,590};
		int y2[] = {300,110,300};
		g2d.fillPolygon(new Polygon(x2,y2,3));
		
		
		g2d.setColor(Color.yellow);
		g2d.fillRect(190, 300, 350, 270);
		
		for(int yi = 335;yi<570; yi+=40)
		{
			g2d.setColor(Color.red);
			g2d.drawLine(190, yi, 540, yi);
			
			g2d.setColor(Color.red);
			g2d.drawLine(190, yi+1, 540, yi+1);
			
			g2d.setColor(Color.red);
			g2d.drawLine(190+2, yi+2, 540, yi+2);
				
		}
		
		g2d.setColor(Color.gray);
		g2d.fillRect(160, 570, 410, 40);
		
		g2d.setColor(Color.black);
		g2d.fillRect(230, 320, 140, 250);
		
		g2d.setColor(Color.GRAY);
		g2d.fillRect(240, 330, 120, 230);
		
		g2d.setColor(Color.PINK);
		g2d.fillRoundRect(330,450,10,10,90,90);
		
		g2d.setColor(Color.red);
		g2d.fillRect(410, 320, 100, 100);
		
		g2d.setColor(Color.white);
		g2d.fillRect(420, 330, 80, 80);
		
		g2d.setColor(Color.red);
		g2d.fillRect(450, 320, 10,90);
		
		g2d.setColor(Color.red);
		g2d.fillRect(410, 360, 90,10);
		
		g2d.setColor(Color.green);
		g2d.fillRect(0, 600, 700, 300);
		
		
		
		
	}

}



