package com.skillrisers.gaming.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.skillrisers.gaming.utils.GameConstants;

public class oppPlayer extends CommonPlayer implements GameConstants{
	
	public oppPlayer() throws IOException {
		x=GWIDTH-400;
		h=w=150;
		y=FLOOR-h;
		speed=-SPEED;
		image=ImageIO.read(oppPlayer.class.getResource(opp_player_image));
	}
	
	//@Override
	public BufferedImage defaultImage() {
		return image.getSubimage(1104, 1148, 60, 97);
		
	}
	

}
