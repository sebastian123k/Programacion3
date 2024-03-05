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
		
		g2d.fillRect(100, 100, 100, 100);
		g2d.drawLine(30, 70, 770, 70);
		
		g2d.drawArc(300,300,45,45,45,180);
		g2d.drawArc(300,300,45,45,45,180);
		
		g2d.drawOval(100, 200, 50, 100);
		g2d.fillOval(300, 200, 50, 100);
		
		g2d.drawPolygon(new Polygon());
		((Graphics2D) g2d).setStroke(new BasicStroke(10));
		g2d.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		g2d.drawString("holanda",400,100);
		
		g2d.drawRoundRect(300,300 , 100, 50, 100, 100);
		
		try {
			BufferedImage image = ImageIO.read(new File("src/spider.png"));
			g2d.drawImage(image,0,0,null);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}



