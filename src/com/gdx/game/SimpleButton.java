package com.gdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SimpleButton {

    private Sprite skin; 
    

    public SimpleButton(ArrayList<Texture> a, float x, float y, float width, float height) {
    	if(RainbowMonster.chose == 0 && x < 400) {
    		skin = new Sprite(a.get(((RainbowMonster.move)/5)%4)); // your image
    	}
    	else if(RainbowMonster.chose == 1 && x > 400) {
    		skin = new Sprite(a.get(((RainbowMonster.move)/5)%4)); // your image
    	}
    	else
    	
    	skin = new Sprite(a.get(1)); // your image
        skin.setPosition(x, y);
        skin.setSize(width, height);
    }

    public void update (SpriteBatch batch, float input_x, float input_y) {
        checkIfClicked(input_x, input_y);
        skin.draw(batch); // draw the button
    }

    private void checkIfClicked (float ix, float iy) {
        if (ix > skin.getX() && ix < skin.getX() + skin.getWidth()) {
            if (iy > skin.getY()+  skin.getHeight()    && iy < skin.getY() +  skin.getHeight()*2 ) {
                // the button was clicked, perform an action
            	if(ix < 450)
            	RainbowMonster.chose = 0;
            	else
            		RainbowMonster.chose = 1;
                System.out.println("Button clicked !");
                System.out.println(RainbowMonster.chose);
            }
            
        }
        
    }

}
