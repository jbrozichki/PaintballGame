package com.paintballgame;

import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.tiled.TiledMap;

import tools.managers.resource.ResourceManager;

import com.paintballgame.engine.component.player.PlayerComponent;
import com.paintballgame.engine.component.render.MapRenderComponent;
import com.paintballgame.engine.entity.Entity;



/**
 * 
 * 
 * 
 * This is the Game class runs our game, using the init, update, and render methods.
 *
 */
public class Game extends BasicGame implements MouseListener{
	
		
		Entity map = null;
		Entity player = null;
		TiledMap tileMap;
		
		//This is an ArrayList that holds all the entities we want to render on screen.
		ArrayList<Entity> entityQueue = new ArrayList<Entity>();
	
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
	    	
	    	gc.setVSync(true);
	    	
	    	//Initialize Game variables
	    	map = new Entity("Paintball Map");
	    	player = new Entity("Player 1");
	    	player.setPosition(new Vector2f(gc.getWidth()/2,50));
	    	tileMap = new TiledMap("/BEVP/src/data/maptile.tmx");
	    	tileMap.render(0, 0);
	    	System.out.println(tileMap.getTileHeight());
	    	
	    	
	    	//Add entities to render queue
	    	entityQueue.add(map);
	    	entityQueue.add(player);
	    	
	    	//Load image into memory using a resource manager
	    	Image img = ResourceManager.getInstance().loadImage("MAP", "/BEVP/src/data/map.jpg");
	    	
	    	//Add components to entities to enable behavior
	    	map.AddComponent(new MapRenderComponent("BackgroundMap", img));//Add a MapRenderComponent to our map
	    	player.AddComponent(new PlayerComponent(player.getId()));//Add a PlayerComponent to our player entity
	    	
	 
	    }
	 
	    public void update(GameContainer gc, int delta)//This method updates our entities. All logic goes here. 
				throws SlickException  {
	    	
	    	for (Entity x : entityQueue) {//We cycle through each entity in our queue and update it.
	    		x.update(gc, null, delta);
	    	}
	    	
	    }
	 
	    public void render(GameContainer gc, Graphics g) //This method renders our entities to the screen
				throws SlickException {
				
	    	for (Entity x : entityQueue) {//We cycle through each entity in our queue and render it.
	    		x.render(gc, null, g);
	    	}
	    }
	 
	    public static void main(String[] args) 
				throws SlickException
	    {
	         AppGameContainer app = 
				new AppGameContainer(new Game());
	 
	         app.setDisplayMode(900, 500, false);
	         app.start();
	    }
	    
		@Override
		public void mouseMoved(int oldx, int oldy, int newx, int newy) {

			//player.setPosition(new Vector2f(newx,newy));
		}

}
