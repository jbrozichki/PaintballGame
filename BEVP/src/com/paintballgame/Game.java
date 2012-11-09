package com.paintballgame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.paintballgame.engine.entity.Entity;



/**
 * 
 * 
 * 
 * This is the Game class that controls the startup and renderi
 *
 */
public class Game extends BasicGame {
	
		Entity map = null;
	
		 
		public Game()
	    {
	        super("Paintball XXX");
	    }
	 
	    @Override
	    public void init(GameContainer gc) //This is loaded before our game starts. We load maps, images, and other resources.
				throws SlickException {
	 
	    }
	 
	    @Override
	    public void update(GameContainer gc, int delta) 
				throws SlickException     
	    {
	 
	    }
	 
	    public void render(GameContainer gc, Graphics g) 
				throws SlickException 
	    {
	 
	    }
	 
	    public static void main(String[] args) 
				throws SlickException
	    {
	         AppGameContainer app = 
				new AppGameContainer(new Game());
	 
	         app.setDisplayMode(1280, 720, false);
	         app.start();
	    }

}
