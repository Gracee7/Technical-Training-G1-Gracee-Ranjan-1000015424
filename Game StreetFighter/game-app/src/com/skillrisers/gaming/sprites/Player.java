package com.skillrisers.gaming.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import com.skillrisers.gaming.utils.GameConstants;

public class Player extends CommonPlayer implements GameConstants {
	private BufferedImage walkImages[]=new BufferedImage[6];
	private BufferedImage kickImages[]=new BufferedImage[6];
	public Player() throws Exception{
		x=300;
		h=w=150;
		y=FLOOR-h;
		speed=SPEED;
		image=ImageIO.read(Player.class.getResource(player1_image));
		walk();
		kick();
	}
	
	private void walk(){
		walkImages[0]= image.getSubimage(66,233,66,97);
		walkImages[1]= image.getSubimage(146,236,67,95);
		walkImages[2]= image.getSubimage(228,235,58,97);
		walkImages[3]= image.getSubimage(306,236,57,96);
		walkImages[4]= image.getSubimage(376,236,62,96);
		walkImages[5]= image.getSubimage(455,239,61,92);
		
	}
	private void kick(){
		kickImages[0]= image.getSubimage(38,1046,69,98);
		kickImages[1]= image.getSubimage(120,1045,68,97);
		kickImages[2]= image.getSubimage(199,1050,120,93);
		kickImages[3]= image.getSubimage(330,1048,64,96);
		kickImages[4]= image.getSubimage(404,1047,70,100);
		kickImages[5]= image.getSubimage(483,1044,91,104);
		
	}
	
	private BufferedImage printWalk() {
		if(imageIndex>5) {
			imageIndex=0;
		}
		BufferedImage img=walkImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	private BufferedImage printKick() {
		if(imageIndex>5) {
			imageIndex=0;
			currentMove=WALK;
		}
		BufferedImage img=kickImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	@Override
	public BufferedImage defaultImage() {
		if(currentMove==KICK) {
			return printKick();
		}
		else {
			return printWalk();
		}
	}
}

	
