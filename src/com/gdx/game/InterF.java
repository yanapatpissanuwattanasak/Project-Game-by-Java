package com.gdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class InterF extends Game  implements ApplicationListener,Screen {
	private  final ArrayList<Texture> No = new ArrayList<Texture>();
	SpriteBatch batch;
	Texture bg ;
	public static int a = 1;
	@Override
	public void create() {
		batch = new SpriteBatch();
		//bg = new Texture("Inter.png");
		
	}

	@Override
	public void dispose() {
		
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		batch.begin();
		batch.draw(bg,0,0);
		batch.end();
		if(Gdx.input.isKeyPressed(Keys.ENTER)) {
			a +=1;
			 ((Game) Gdx.app.getApplicationListener()).setScreen((Screen) new Starts());
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	public void check() throws Exception{
		throw new Exception();
		
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
