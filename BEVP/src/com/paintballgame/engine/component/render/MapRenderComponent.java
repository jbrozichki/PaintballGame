package com.paintballgame.engine.component.render;
 
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.state.StateBasedGame;
 
public class MapRenderComponent extends RenderComponent {
 
	Image image;
 
	public MapRenderComponent(String id, Image image)
	{
		super(id);
		this.image = image;
	}
 
	@Override
	public void render(GameContainer gc, StateBasedGame sb, Graphics gr) {

		gr.drawImage(image, 0, 0);
	}
 
	@Override
	public void update(GameContainer gc, StateBasedGame sb, int delta) {
		
	}
 
}