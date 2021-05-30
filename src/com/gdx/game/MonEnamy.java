package com.gdx.game;

import java.util.ArrayList;
import java.util.*;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MonEnamy {
	public static final ArrayList<Texture> GoR = new ArrayList<Texture>();
	public static final ArrayList<Texture> GoY = new ArrayList<Texture>();
	public static final ArrayList<Texture> GoB = new ArrayList<Texture>();
	public static final ArrayList<Texture> GDIE = new ArrayList<Texture>();
	static SpriteBatch batch ;
	Texture gobin;
	public int run = 0;
	public int colormon ;
	
	float x = RainbowMonster.iWidth * RainbowMonster.Scale + 200 ;
	
	float y;
	public MonEnamy(int type,float x,float y) {
		this.colormon= type;
		this.x = x;
		this.y = y;
		GDIE.add(new Texture("G1die.png"));
		GDIE.add(new Texture("G2die.png"));
		GDIE.add(new Texture("G3die.png"));
		GDIE.add(new Texture("G4die.png"));
		GDIE.add(new Texture("G5die.png"));
		GoR.add(new Texture("GoRed1.png"));
		GoR.add(new Texture("GoRed2.png"));
		GoR.add(new Texture("GoRed3.png"));
		GoR.add(new Texture("GoRed4.png"));
		GoY.add(new Texture("GoYellow1.png"));
		GoY.add(new Texture("GoYellow2.png"));
		GoY.add(new Texture("GoYellow3.png"));
		GoY.add(new Texture("GoYellow4.png"));
		GoB.add(new Texture("GoBlue1.png"));
		GoB.add(new Texture("GoBlue2.png"));
		GoB.add(new Texture("GoBlue3.png"));
		GoB.add(new Texture("GoBlue4.png"));
		
		
	}
	public MonEnamy(int type) {
		this.colormon= type;
		GDIE.add(new Texture("G1die.png"));
		GDIE.add(new Texture("G2die.png"));
		GDIE.add(new Texture("G3die.png"));
		GDIE.add(new Texture("G4die.png"));
		GDIE.add(new Texture("G5die.png"));
		GoR.add(new Texture("GoRed1.png"));
		GoR.add(new Texture("GoRed2.png"));
		GoR.add(new Texture("GoRed3.png"));
		GoR.add(new Texture("GoRed4.png"));
		GoY.add(new Texture("GoYellow1.png"));
		GoY.add(new Texture("GoYellow2.png"));
		GoY.add(new Texture("GoYellow3.png"));
		GoY.add(new Texture("GoYellow4.png"));
		GoB.add(new Texture("GoBlue1.png"));
		GoB.add(new Texture("GoBlue2.png"));
		GoB.add(new Texture("GoBlue3.png"));
		GoB.add(new Texture("GoBlue4.png"));
		
		
	}
	
	
	
		
		
		
	
	
		
		
		
		
	
	
	
	public Texture animetionmon() {
		run += 1;
		if (this.colormon == 1) {
			return GoR.get((RainbowMonster.move/4)% 4) ;
		}
		if (this.colormon == 2) {
			return GoY.get((RainbowMonster.move/4)% 4) ;
		}
		else if (this.colormon == 3) {
		
			return GoB.get((RainbowMonster.move/4)% 4) ;
		}
		else {
			if(run < 20)
			return GDIE.get((run/4)%5);
			else
				return GDIE.get(4);
		}
		
		
	}
	public float getX() {
		return this.x;
	}
	public float getY() {
		return this.y;
	}

	

}
