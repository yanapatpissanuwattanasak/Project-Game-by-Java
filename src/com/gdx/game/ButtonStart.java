package com.gdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ButtonStart {

    private Sprite skin;
	
    

    public ButtonStart(Texture texture, float x, float y, float width, float height) {
        skin = new Sprite(texture); // your image
        skin.setPosition(x, y);
        skin.setSize(width, height);
    }

    public void update (SpriteBatch batch, float input_x, float input_y) {
        checkIfClicked(input_x, input_y);
        skin.draw(batch); // draw the button
    }

    private void checkIfClicked (float ix, float iy) {
        if (ix > skin.getX() && ix < skin.getX() + skin.getWidth()) {
            if (iy > skin.getY() -340   && iy < skin.getY() -220   ) {
               
            	RainbowMonster.main = 1;
                System.out.println("Button clicked !");
                
            }
            
        }
        
    }

}
