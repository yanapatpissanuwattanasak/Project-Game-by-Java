package com.gdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class Text {
	public static final ArrayList<Texture> Enter = new ArrayList<Texture>();
	public static final ArrayList<Texture> Quit = new ArrayList<Texture>();
	public int type ;
	public int check  = 2;
	public Text(int type) {
		this.type = type;
		Enter.add(new Texture("again3.png"));
		Enter.add(new Texture("again2.png"));
		Enter.add(new Texture("again1.png"));
		Quit.add(new Texture("quit3.png"));
		Quit.add(new Texture("quit2.png"));
		Quit.add(new Texture("quit1.png"));
	}
	public Texture animetion() {
	if(type == 1) {
		if(check == 1)
			return Enter.get((RainbowMonster.move/15)%2);
		else
			return Enter.get(2);
	}
	else
		if(check == 1)
			return Quit.get((RainbowMonster.move/15)%2);
		else 
			return Quit.get(2);
	}
}
