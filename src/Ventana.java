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
		g2d.setColor(new Color(176,232,250));
		g2d.fillRect(0,0,1000,700);
		
		//arbusto
		
		g2d.setColor(Color.BLACK);
		g2d.fillOval(85, 382, 130, 120);

		g2d.fillOval(65, 432, 130, 120);
	
		g2d.fillOval(105, 442, 130, 120);

	

		g2d.setColor(new Color(78,197,98));
		g2d.fillOval(100, 400, 100, 100);
		
		g2d.fillOval(80, 440, 100, 100);
		
		g2d.fillOval(120, 450, 100, 100);
		
		//otra parte del suelo
		g2d.setColor(Color.black);
		g2d.fillRect(0, 500, 1000, 200);
		
		g2d.setColor(new Color(249,199,192));
		g2d.fillRect(0, 505, 1000, 20);
		
		
		///////////////// plataformarosa y azul
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(380, 250, 180, 250,10,10);

		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(430, 290, 160, 210);
		
		g2d.setColor(new Color(132,191,221));
		g2d.fillRect(385, 255, 170, 245);
		
		g2d.setColor(new Color(31,142,221));
		g2d.fillRect(555, 255, 5, 245);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(300, 350, 150, 150,10,10);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(320, 370, 160, 130);
		
		g2d.setColor(new Color(255,195,184));
		g2d.fillRect(305, 355, 140, 145);
		
		
		//////////////// bloques de ojetos
		
		g2d.setColor(Color.black);
		g2d.fillRect(65, 245, 70, 70);
		
		g2d.setColor(new Color(254,144,98));
		g2d.fillRect(70, 250, 60, 60);
		
		g2d.setColor(Color.black);
		g2d.fillRect(177, 117, 127, 67);
		
		g2d.setColor(new Color(254,144,98));
		g2d.fillRect(242, 120, 60, 60);
		
		g2d.fillRect(180, 120, 60, 60);
		
		g2d.setColor(Color.black);
		g2d.fillRect(897, 187, 65, 65);
		
		g2d.setColor(new Color(254,144,98));
		g2d.fillRect(900, 190, 60, 60);
		
	
		
		//tuberia
		g2d.setColor(Color.black);
		g2d.fillRect(670, 360, 130, 140);
		
		g2d.setColor(new Color(24,136,17));
		g2d.fillRect(675, 370, 120, 130);
		
		g2d.setColor(Color.black);
		g2d.fillRect(660, 310, 150, 60);
		
		g2d.setColor(new Color(24,136,17));
		g2d.fillRect(665, 315, 140, 55);
		
		g2d.setColor(new Color(44,172,50));
		
		g2d.fillRect(680, 315, 5, 185);

		g2d.fillRect(690, 315, 5, 185);

		g2d.fillRect(695, 315, 5, 185);
		
		g2d.fillRect(710, 315, 5, 185);
		
		g2d.fillRect(750, 315, 5, 185);
		
		g2d.fillRect(765, 315, 5, 185);
		
		g2d.fillRect(775, 315, 5, 185);
		
		g2d.fillRect(787, 315, 5, 185);
		
		g2d.setColor(Color.BLACK);
		
		g2d.fillRect(660, 365, 145, 5);
		
		
		
		//plataforma verde
		
		g2d.setColor(Color.black);
		g2d.fillRect(845, 295, 210, 205);
		
		g2d.setColor(new Color(82,216,109));
		g2d.fillRect(850, 300, 200, 200);
		
		
		//tuercas de las palataformas 
		
		g2d.setColor(Color.black );
		g2d.fillOval(318, 368, 20,20);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(320, 370, 15, 15);
		
		g2d.setColor(Color.black );
		g2d.fillOval(408, 368, 20,20);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(410, 370, 15, 15);
		
		g2d.setColor(Color.black );
		g2d.fillOval(318, 468, 20,20);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(320, 470, 15, 15);
		
		g2d.setColor(Color.black );
		g2d.fillOval(408, 468, 20,20);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(410, 470, 15, 15);
		
		g2d.setColor(Color.black );
		g2d.fillOval(408, 268, 20,20);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(410, 270, 15, 15);
		
		g2d.setColor(Color.black );
		g2d.fillOval(518, 268, 20,20);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(520, 270, 15, 15);
		//
		g2d.setColor(Color.black );
		g2d.fillOval(868, 328, 20,20);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(870, 330, 15, 15);
		
		g2d.setColor(Color.black );
		g2d.fillOval(868, 468, 20,20);
		
		g2d.setColor(Color.gray);
		g2d.fillOval(870, 470, 15, 15);
		
		
		// suelo
		
		int avance = 0;
		for(int y =0; y<50;y+=5)
		{
			for(int x =0; x<1000;x+=40)
			{
				g2d.setColor(new Color(45,6,0));
				g2d.fillRect(x+avance,y+530, 20, 20);
				
				g2d.setColor(new Color(227,151,135));
				g2d.fillRect(x+avance+20,y+530, 20, 5);
			}
			
			avance+=5;
			
		}
		
		
		
		
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
		
		int posx = 550;
		int posy = 445;
		
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
		
		g2d.setColor(Color.green);
		g2d.fillRect(730, 230, 10, 80);
		
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
				{0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0},
				
				};
		
		int po2x = 720;
		int po2y = 220;
		
		for(int x = 0;x<16;x++)
		{
			for(int y = 0;y<15;y++)
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



