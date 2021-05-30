package com.gdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class ice {
	public static final ArrayList<Texture> ices = new ArrayList<Texture>();
	public float x,y;
	public ice(float x , float y) {
		this.x = x;
		this.y = y;
		ices.add(new Texture("ls1.png"));
		ices.add(new Texture("ls2.png"));
		ices.add(new Texture("ls3.png"));
		ices.add(new Texture("ls4.png"));
	}
	public Texture animetion() {
		return ices.get((RainbowMonster.move/4)%4);
	}

}
