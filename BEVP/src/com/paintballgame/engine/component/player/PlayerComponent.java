package com.paintballgame.engine.component.player;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

import com.paintballgame.engine.component.render.RenderComponent;

public class PlayerComponent extends RenderComponent {
	
	
	private static float movespeed = 1.5f;
	
	
	Input in = null;

	public PlayerComponent(String id) {//Player constructor
		super(id);
		
	}

    public void update(GameContainer gc, StateBasedGame sb, int delta)
    {		
    		in = gc.getInput();
    		//in.enableKeyRepeat();
    		
    		if (in.isKeyDown(Input.KEY_W)) {//Up Key
    			if (canMove(gc,Input.KEY_W)) {
    				setPosition(owner.getPosition().x,owner.getPosition().y-movespeed);
    			}
    		} 
    		if (in.isKeyDown(Input.KEY_S)){//Down Key
    			if (canMove(gc,Input.KEY_S)) {
    				setPosition(owner.getPosition().x,owner.getPosition().y+movespeed);
    			}
    		} 
    		if (in.isKeyDown(Input.KEY_D)){//Right Key
    			if (canMove(gc,Input.KEY_D)) {
    				setPosition(owner.getPosition().x+movespeed,owner.getPosition().y);
    			}
    		} 
    		if (in.isKeyDown(Input.KEY_A)){//Left Key
    			if (canMove(gc, Input.KEY_A)) {
    				setPosition(owner.getPosition().x-movespeed,owner.getPosition().y);
    			}
    		}
    		
			return;
    }
    
    private boolean canMove(GameContainer gc, int key) {
		
    	switch (key) {
    	
    		case Input.KEY_W:
    		if (owner.getPosition().y >= 0){
    			System.out.println(owner.getPosition().y);
    			return true;
    		}
    		case Input.KEY_S:
    		if (owner.getPosition().y<gc.getHeight()){
    			return true;
    		}
    		case Input.KEY_D:
    		if (owner.getPosition().x<gc.getWidth()){
    			return true;
    		}
			case Input.KEY_A:
			if (owner.getPosition().x>0){
				return true;
			}
    	}
    	return false;
	}

	public void setPosition(float x, float y) {
    	owner.setPosition(new Vector2f(x,y));
    }
	
	public void render(GameContainer gc, StateBasedGame sb, Graphics gr)
    {
		gr.setColor(new Color(20, 255, 20));
		gr.fillOval(this.owner.getPosition().x,this.owner.getPosition().y, 40, 40);
		gr.setColor(new Color(200, 100, 200));
		gr.fillOval(this.owner.getPosition().x,this.owner.getPosition().y, 8, 8);
    
    }

}



