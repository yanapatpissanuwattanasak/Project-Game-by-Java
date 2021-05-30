package com.gdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DestoryPower implements ApplicationListener{
	public static final ArrayList<Texture> Pw1 = new ArrayList<Texture>();
	public static final ArrayList<Texture> Pw2 = new ArrayList<Texture>();
	public static final ArrayList<Texture> Pw3 = new ArrayList<Texture>();
	public static final ArrayList<Texture> Pw4 = new ArrayList<Texture>();
	public static final ArrayList<Texture> Pw5 = new ArrayList<Texture>();
	public static final ArrayList<Texture> Pw6 = new ArrayList<Texture>();
	public static final ArrayList<Texture> Pw7 = new ArrayList<Texture>();
	static SpriteBatch batch ;
	private int walk = 0;
	public int colorpower ;	
	float x;
	float y;
	int dis ;
	public DestoryPower(float x,float y,int type,int dis) {
		this.x = x;
		this.y = y;
		this.colorpower = type;
		this.dis = dis;
		Pw1.add(new Texture("R1.png"));
		Pw1.add(new Texture("R2.png"));
		Pw2.add(new Texture("Y1.png"));
		Pw2.add(new Texture("Y2.png"));
		Pw3.add(new Texture("B1.png"));
		Pw3.add(new Texture("B2.png"));
		Pw4.add(new Texture("P1.png"));
		Pw4.add(new Texture("P2.png"));
		Pw5.add(new Texture("WB1.png"));
		Pw5.add(new Texture("WB2.png"));
		Pw6.add(new Texture("O1.png"));
		Pw6.add(new Texture("O2.png"));
		Pw7.add(new Texture("GR1.png"));
		Pw7.add(new Texture("GR2.png"));
	}	
	public Texture animetion() {
	
		if (this.colorpower == 1) {
			return Pw1.get((RainbowMonster.move/3)%2) ;
		}
		if (this.colorpower == 2) {
			return Pw2.get((RainbowMonster.move/3)%2) ;
		}
		if (this.colorpower == 3) {
			return Pw3.get((RainbowMonster.move/3)%2) ;
		}
		if (this.colorpower == 4) {
			return Pw4.get((RainbowMonster.move/3)%2) ;
		}
		if (this.colorpower == 5) {
			return Pw5.get((RainbowMonster.move/3)%2) ;
		}
		if (this.colorpower == 6) {
			return Pw6.get((RainbowMonster.move/3)%2) ;
		}
		else
			return Pw7.get((RainbowMonster.move/3)%2) ;
		
		
	}
	public float getX() {
		return this.x;
	}
	public float getY() {
		return this.y;
	}
	@Override
	public void create() {
	}
	@Override
	public void dispose() {	
	}

	@Override
	public void pause() {		
	}
	@Override
	public void render() {	
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
