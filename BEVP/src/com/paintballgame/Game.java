package com.paintballgame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import tools.managers.resource.ResourceManager;

import com.paintballgame.engine.component.render.MapRenderComponent;
import com.paintballgame.engine.entity.Entity;



/**
 * 
 * 
 * 
 * This is the Game class runs our game, using the init(), update, and render methods.
 *
 */
public class Game extends BasicGame {
	
		ResourceManager rl = null;
		Entity map = null;
	
		/**
		 * Constructor for the Game Class
		 */
		public Game()
	    {
	        super("Paintball XXX");
	    }
	 
	    @Override
	    public void init(GameContainer gc) //This is loaded before our game starts. We load maps, images, and other resources.
				throws SlickException {
	    	
	    	//Initialize Game variables
	    	map = new Entity("Paintball Map");
	    	
	    	//Load image resources
	    	rl = ResourceManager.getInstance();
	    	Image img = rl.loadImage("MAP", "/BEVP/src/data/map.jpg");//Load image into memory
	    	map.AddComponent(new MapRenderComponent("BackgroundMap", img));//Add an image render component to our map
	 
	    }
	 
	    @Override
	    public void update(GameContainer gc, int delta)//This method updates our entities. All logic goes here. 
				throws SlickException   
				
			
	    {
	 
	    }
	 
	    public void render(GameContainer gc, Graphics g) //This method renders our entities to the screen
				throws SlickException {
				
				map.render(gc, null, g);
	    	
	    }
	 
	    public static void main(String[] args) 
				throws SlickException
	    {
	         AppGameContainer app = 
				new AppGameContainer(new Game());
	 
	         app.setDisplayMode(900, 500, false);
	         app.start();
	    }

}
