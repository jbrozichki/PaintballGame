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
		
		Image scl = image.getScaledCopy(500, gc.getHeight());
		gr.drawImage(scl, (gc.getWidth()/2)-(scl.getWidth()/2), 0);

	}
 
	@Override
	public void update(GameContainer gc, StateBasedGame sb, int delta) {

	}
 
}