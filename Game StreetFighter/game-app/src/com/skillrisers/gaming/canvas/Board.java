package com.skillrisers.gaming.canvas;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.skillrisers.gaming.sprites.Player;
import com.skillrisers.gaming.sprites.oppPlayer;
import com.skillrisers.gaming.utils.GameConstants;

public class Board extends JPanel implements GameConstants {
	BufferedImage imagebg;
	private Player player;
	private oppPlayer OppPlayer;
	
	private Timer timer;
	
	private void gameLoop() {
		timer=new Timer(100,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				repaint();
			}
		});
		timer.start();
	}
	
	public Board() throws Exception {
		player=new Player();
		OppPlayer =new oppPlayer();
		loadBackgroundImage();
		setFocusable(true);
		bindEvents();
		gameLoop();
	}
	
	private void bindEvents() {
	 KeyListener listner = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.print("Typed "+e.getKeyCode()+" "+e.getKeyChar());																		
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.print("Released "+e.getKeyCode()+" "+e.getKeyChar());
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			//Left Player Ryu
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				player.setSpeed(-SPEED);
				player.move();
			
			
				System.out.print(player.getX());// Not required to be ib the code just for seeing the coordinate change of player
				
				//repaint();
			}
			
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				player.setSpeed(SPEED);
				player.move();
								
				//System.out.print(player.getX());
			
			//	repaint();
			}
			//ryu kick
			if(e.getKeyCode()==KeyEvent.VK_SHIFT) {
				player.setCurrentMove(KICK);
								
				//System.out.print(player.getX());
			
			//	repaint();
			}
			
			//Right Player ken
			//Right Player Ken
		    if(e.getKeyCode()==KeyEvent.VK_A) {
		    	OppPlayer.setSpeed(SPEED);
		    	OppPlayer.move();
		    	
		    //	repaint();
		    }
		    
		  //Right Player Ken
		    if(e.getKeyCode()==KeyEvent.VK_D) {
		    	OppPlayer.setSpeed(-SPEED);
		    	OppPlayer.move();
		    	
		    	//repaint();
		    }
			//System.out.print("Press "+e.getKeyCode()+" "+e.getKeyChar());
		}
	};
	this.addKeyListener(listner);
		
	}
	
		
	@Override
	public void paintComponent(Graphics pen) {
		//Rendering /Painting
		
		/*super.printComponent(pen);
		 * 
		// this when put into code gives 
		nothing is printed on frame when super is enabled
		
		*/
		printBackgroundImage(pen);
		player.paintPlayer(pen);
		OppPlayer.paintPlayer(pen);
	}
	
	private void printBackgroundImage(Graphics pen) {
		pen.drawImage(imagebg, 0,0,GWIDTH,GHEIGHT,null);
	}
	
	private void loadBackgroundImage() {
		try {
		imagebg=ImageIO.read(Board.class.getResource(bg_img));
		}
		catch(Exception ex){
			System.out.println("Background not Found ");
			System.exit(0);
		}
	}
	
	
	
}
