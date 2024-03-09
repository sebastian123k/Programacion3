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
		
		this.setSize(1000,580);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		addMouseListener(this);
			
	}
	
	@Override
	public void paint(Graphics g) {

		super.paint(g);
		
		Graphics g2d = (Graphics2D) g;
		
		//fondo
		g2d.setColor(new Color(6,100,255));
		g2d.fillRect(0,0,1000,700);
		
		
		/// nubes traceras//
		
		g2d.setColor(new Color(235,244,255));
		
		g2d.fillRoundRect(260,460,240,50,100,50);
		
		g2d.fillRoundRect(160,410,240,50,100,50);
		
		g2d.fillRoundRect(260,360,240,50,100,50);
		
		g2d.fillRoundRect(780,130,200,50,100,50);
		
		g2d.fillRoundRect(650,180,240,50,100,50);
		
		//montanilas
		
		g2d.setColor(new Color(198,227,255));
		g2d.fillRoundRect(20,150,200,500,500,200);
		
		g2d.fillRoundRect(380,150,200,500,500,200);
		
		g2d.fillRoundRect(585,80,200,700,500,200);
		
		//nubes2
		
		g2d.setColor(Color.white);
		
		g2d.fillRoundRect(470,310,240,50,100,50);
		
		
		//montanilas de frente
		
				g2d.setColor(new Color(118,178,215));
				
				g2d.fillRoundRect(-70,350,200,300,500,200);
				
				g2d.fillRoundRect(350,350,250,300,500,200);
				
				g2d.fillRoundRect(600,250,250,400,600,200);
				
		//nubes de frente
				
				g2d.setColor(Color.white);
				
				g2d.fillRoundRect(-60,230,240,50,100,50);
				
				g2d.fillRoundRect(220,280,240,50,100,50);

		
		
		//arbusto
		
				g2d.setColor(Color.BLACK);
				g2d.fillOval(115, 455, 190, 120);

				g2d.setColor(new Color(4,252,13));
				g2d.fillOval(120, 460, 180, 100);
				
		//bolas de las monta;as
		
		g2d.setColor(Color.white);
		g2d.fillOval(160,200,20,40);
		g2d.fillOval(160,300,20,40);
		g2d.fillOval(100,320,20,40);
		
		g2d.fillOval(470,200,20,40);
		g2d.fillOval(420,250,20,40);
		
		g2d.fillOval(670,100,20,40);
		g2d.fillOval(620,150,20,40);
		
		g2d.fillOval(720,300,20,40);
		g2d.fillOval(770,450,20,40);
				
		
		
		
		

		
		
		
		//////////////// bloques de ojetos
				
		g2d.setColor(Color.black);
		g2d.fillRoundRect(845, 345, 50, 50,5,5);
		
		g2d.setColor(Color.gray);
		g2d.fillRoundRect(850, 350, 40, 40,5,5);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(845, 395, 50, 50,5,5);
		
		g2d.setColor(Color.gray);
		g2d.fillRoundRect(850, 400, 40, 40,5,5);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(845, 445, 50, 50,5,5);
		
		g2d.setColor(Color.gray);
		g2d.fillRoundRect(850, 450, 40, 40,5,5);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(895, 345, 50, 50,5,5);
		
		g2d.setColor(new Color(253,226,42));
		g2d.fillRoundRect(900, 350, 40, 40,5,5);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(945, 345, 50, 50,5,5);
		
		g2d.setColor(new Color(253,226,42));
		g2d.fillRoundRect(950, 350, 40, 40,5,5);
		
		
	
		
		//tuberia
		g2d.setColor(Color.black);
		g2d.fillRect(420, 410, 130, 140);
		
		g2d.setColor(new Color(78,77,140));
		g2d.fillRect(425, 420, 120, 130);
		
		g2d.setColor(Color.black);
		g2d.fillRect(410, 360, 150, 60);
		
		g2d.setColor(new Color(78,77,140));
		g2d.fillRect(415, 365, 140, 55);
		
		g2d.setColor(new Color(132,131,204));
		
		g2d.fillRect(430, 365, 5, 185);

		g2d.fillRect(440, 365, 5, 185);

		g2d.fillRect(445, 365, 5, 185);
		
		g2d.fillRect(470, 365, 5, 185);
		
		g2d.fillRect(500, 365, 5, 185);
		
		g2d.fillRect(515, 365, 5, 185);
		
		g2d.fillRect(525, 365, 5, 185);
		
		g2d.fillRect(537, 365, 5, 185);
		
		g2d.setColor(Color.BLACK);
		
		g2d.fillRect(410, 415, 145, 5);
		
		
		
		
		//otra parte del suelo
		g2d.setColor(Color.black);
		g2d.fillRect(0, 495, 1000, 200);
		
		g2d.setColor(new Color(205,156,97));
		g2d.fillRect(0, 510, 1000, 200);
		
		
		// suelo
		
		for(double i = 0.0;i<1200;i+=2)
		{
			g2d.setColor(Color.black);
			g2d.fillRect(((int)i),513,6,(int)(Math.cos(i)*10));
			System.out.println((int)(Math.cos(i)*10));
		}
		
		for(double i = 0.0;i<1200;i+=2)
		{
			g2d.setColor(new Color(22,154,27));
			g2d.fillRect(((int)i),510,6,(int)(Math.cos(i)*10));
			System.out.println((int)(Math.cos(i)*10));
		}
		
		for(int i = 0; i<1000;i++)
		{
			g2d.setColor(new Color(222,178,82));
			g2d.fillOval(i*20+i*2,530,10,4+(int)(Math.cos(i)*10));
			
			g2d.fillOval(i*20+i*3,560,10,4+(int)(Math.sin(i)*20));
		}
		
		
		
		g2d.setColor(new Color(22,154,27));
		g2d.fillRect(0, 497, 1000, 10);
		
		
		
		
		//mariano
		
		int mario[][] ={
				{0,0,0,0,0,0,1,1,1,1,0,0,0,0,0},
				{0,0,0,0,1,1,2,2,2,2,1,0,0,0,0},
				{0,0,0,1,2,2,2,2,2,2,1,0,0,0,0},
				{0,0,1,2,2,2,2,1,1,1,1,1,1,1,0},
				{0,1,2,2,2,1,1,1,1,1,1,1,1,1,1},
				{0,1,2,2,1,1,1,3,3,3,3,1,1,1,0},
				{1,1,1,1,1,1,3,3,3,1,3,1,0,0,0},
				{1,3,3,1,1,1,3,3,3,1,3,1,1,1,0},
				{1,3,3,3,1,1,1,3,3,3,3,3,3,3,1},
				{1,3,3,3,3,1,3,3,1,3,3,3,3,3,1},
				{0,1,3,3,3,3,3,1,1,1,3,3,3,1,0},
				{0,0,1,1,3,3,3,3,3,1,1,1,1,0,0},
				{0,1,1,1,1,3,3,3,3,3,3,1,0,0,0},
				{0,1,2,2,1,1,1,1,1,1,1,0,0,0,0},
				{1,2,2,2,2,2,1,1,3,3,3,1,0,0,0},
				{1,2,2,2,2,2,1,3,3,3,3,3,1,0,0},
				{1,2,2,2,2,2,1,3,3,3,3,3,1,0,0},
				{1,1,2,2,2,2,2,1,3,3,3,1,1,1,0},
				{1,1,1,2,2,2,2,1,1,1,1,1,3,1,0},
				{0,1,1,1,1,1,1,1,1,3,3,1,3,1,0},
				{0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
				{0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
				{0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
				{0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
				{0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
				{0,0,0,1,2,2,2,2,1,0,0,0,0,0,0},
				{0,0,0,1,2,2,2,2,2,1,0,0,0,0,0},
				{0,0,0,1,1,1,1,1,1,1,0,0,0,0,0}
				
				
				};
		
		int posx = 380;
		int posy = 440;
		
		for(int x = 0;x<15;x++)
		{
			for(int y = 0;y<28;y++)
			{
				switch(mario[y][x])
				{
				case 1:
					g2d.setColor(Color.BLACK);
					
					g2d.fillRect(x*2+posx,y*2+posy, 2, 2);
				break;
				
				case 2:
					g2d.setColor(Color.red);
					
					g2d.fillRect(x*2+posx,y*2+posy, 2, 2);
				break;
				
				case 3:
					g2d.setColor(Color.pink);
					
					g2d.fillRect(x*2+posx,y*2+posy, 2, 2);
				break;
				}
				
			}
		}
		
		
		//planta pirania 
		
		
		int planta[][] ={
				{0,1,1,1,0,0,0,0,0,0,0,0,1,1,1,0},
				{1,4,4,4,1,0,0,0,0,0,0,1,4,4,4,1},
				{1,4,4,4,1,0,0,0,0,0,0,1,4,4,4,1},
				{1,4,4,4,4,1,0,0,0,0,1,4,4,4,4,1},
				{0,1,4,4,4,4,1,0,0,1,4,4,4,4,1,0},
				{0,0,1,4,4,4,4,1,1,4,4,4,4,1,0,0},
				{0,1,2,1,4,1,4,4,4,4,4,4,1,2,1,0},
				{0,1,2,2,1,4,4,4,4,4,4,1,2,2,1,0},
				{1,2,2,2,2,1,1,1,1,1,1,2,4,4,2,1},
				{1,2,4,4,2,2,2,2,2,2,2,2,2,2,2,1},
				{1,2,4,4,2,2,4,4,2,2,2,2,2,2,2,1},
				{0,1,2,2,2,2,4,4,2,2,4,2,2,2,1,0},
				{0,1,2,4,4,2,2,2,2,2,2,2,2,2,1,0},
				{0,0,1,1,4,2,2,2,2,2,2,2,1,1,0,0},
				{0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0},
				{0,0,0,0,1,1,3,3,3,3,3,1,1,0,0,0},
				{0,0,0,0,1,3,3,3,3,3,3,3,1,0,0,0},
				{0,0,1,1,3,3,3,1,1,1,3,3,3,1,1,0},
				{0,1,3,3,3,3,1,1,0,1,1,3,3,3,3,1},
				{1,3,3,3,3,1,0,0,0,0,0,1,3,3,3,1},
				{0,1,3,3,1,0,0,0,0,0,0,0,1,3,1,0},
				{0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,0},
				};
		
		int po2x = 470;
		int po2y = 290;
		
		for(int x = 0;x<16;x++)
		{
			for(int y = 0;y<22;y++)
			{
				switch(planta[y][x])
				{
				case 1:
					g2d.setColor(Color.BLACK);
					
					g2d.fillRect(x*2+po2x,y*2+po2y, 2, 2);
				break;
				
				case 2:
					g2d.setColor(Color.red);
					
					g2d.fillRect(x*2+po2x,y*2+po2y, 2, 2);
				break;
				
				case 3:
					g2d.setColor(Color.green);
					
					g2d.fillRect(x*2+po2x,y*2+po2y, 2, 2);
				break;
				
				case 4:
					g2d.setColor(Color.white);
					
					g2d.fillRect(x*2+po2x,y*2+po2y, 2, 2);
				break;
				}
				
			}
		}
		g2d.setColor(Color.red);
		g2d.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
		g2d.drawString("Mario", 70, 70);
		g2d.setColor(Color.white);
		
		g2d.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		g2d.drawString("  X   5", 80, 90);
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



