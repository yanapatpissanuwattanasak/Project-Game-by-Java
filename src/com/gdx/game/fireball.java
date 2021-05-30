package com.gdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class fireball {
	public static final ArrayList<Texture> fireballs = new ArrayList<Texture>();
	public float x,y;
	public int time = 0;
	public fireball(float x , float y) {
		this.x = x;
		this.y = y;
		fireballs.add(new Texture("f1.png"));
		fireballs.add(new Texture("f2.png"));
		fireballs.add(new Texture("f3.png"));
		fireballs.add(new Texture("f4.png"));
	}
	public Texture animetion() {
		time += 1;
		return fireballs.get((RainbowMonster.move/4)%4);
	}

}
