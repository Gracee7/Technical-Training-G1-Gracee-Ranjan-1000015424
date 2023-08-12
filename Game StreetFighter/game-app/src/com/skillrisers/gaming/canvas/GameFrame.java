package com.skillrisers.gaming.canvas;

import javax.swing.JFrame;

import com.skillrisers.gaming.utils.GameConstants;
// crtl+shift+O shortcut key for organizing input

public class GameFrame extends JFrame implements GameConstants {
	
	public GameFrame() throws Exception {
		setResizable(false);
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(GWIDTH,GHEIGHT);
		setLocationRelativeTo(null);
		Board board=new Board();
		add(board);//board added in frame
		setVisible(true);
	}

	public static void main(String[] args) {
		try {
		GameFrame obj =new GameFrame();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
