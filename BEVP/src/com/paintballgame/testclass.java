package com.paintballgame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class testclass extends BasicGame{
	
		 
	    public testclass()
	    {
	        super("Birds eye view paintball!!");
	    }
	 
	    @Override
	    public void init(GameContainer gc) 
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
				new AppGameContainer(new testclass());
	 
	         app.setDisplayMode(800, 600, false);
	         app.start();
	    }

}
