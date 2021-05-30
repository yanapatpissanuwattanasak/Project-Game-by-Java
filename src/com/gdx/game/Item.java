package com.gdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Item {
	
	public int ty;
	public Texture heal,fireball,ice ;
	public Item(int type) {
		this.ty = type;
		
		heal = new Texture("heal.png");
		fireball = new Texture("fireball.png");
		ice = new Texture("ices.png");
	}
	public Texture animetion() {
	if (ty == 1) {
		return heal;
	}
	else if(ty == 2)
		return fireball;
	else
		return ice;
}
	public int power() {
		return ty;
	}
}
