package com.gdx.game;

import java.util.ArrayList;
import java.util.*;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class SBoss implements ApplicationListener{
	public static final ArrayList<Texture> SB = new ArrayList<Texture>();
	static SpriteBatch batch ;
	public int hp = 15;
	float x = RainbowMonster.iWidth * RainbowMonster.Scale -400;
	
	float y = -40;
	public SBoss() {
		SB.add(new Texture("SB1.png"));
		SB.add(new Texture("SB2.png"));
		SB.add(new Texture("SB3.png"));
		SB.add(new Texture("SB4.png"));
		SB.add(new Texture("SB5.png"));
		SB.add(new Texture("SB6.png"));
		SB.add(new Texture("SB7.png"));
			
	}
	
	
	
		
		
		
	
	@Override
	public void create() {
		
		
		
		
		
		
		
		
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		
		
		
	}
	
	public Texture animetionmon() {
		
			return SB.get((RainbowMonster.move/4)% 7) ;
		
		
		
		}
		
		
		
	
	public float getX() {
		return this.x;
	}
	public float getY() {
		return this.y;
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

}
