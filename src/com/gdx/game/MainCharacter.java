package com.gdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class MainCharacter {
	public static int diecount = 0;
	public  final static ArrayList<Texture> womenR = new ArrayList<Texture>();
	public static  final ArrayList<Texture> womenL = new ArrayList<Texture>();
	public  final static ArrayList<Texture> monsterwellR = new ArrayList<Texture>();
	public static final ArrayList<Texture> monsterwellL = new ArrayList<Texture>();
	public static final ArrayList<Texture> MTR = new ArrayList<Texture>();
	public static final ArrayList<Texture> MTL = new ArrayList<Texture>();
	public static final ArrayList<Texture> WTR = new ArrayList<Texture>();
	public static final ArrayList<Texture> WTL = new ArrayList<Texture>();
	public static final ArrayList<Texture> MDIE = new ArrayList<Texture>();
	public static final ArrayList<Texture> WDIE = new ArrayList<Texture>();
	static Texture manfall;
	static Texture womenfall;
	public  MainCharacter() {
		monsterwellR.add( new Texture("main011.png"));
		monsterwellR.add(new Texture("main01_1.png"));
		monsterwellR.add(new Texture("main01_2.png"));
		monsterwellR.add(new Texture("main01_3.png"));
		
		monsterwellL.add(new Texture("main0211.png"));
		monsterwellL.add( new Texture("main02_1.png"));
		monsterwellL.add(new Texture("main02_2.png"));
		monsterwellL.add(new Texture("main02_3.png"));
		
		womenR.add(new Texture("main002.png"));
		womenR.add(new Texture("main002_2.png"));
		womenR.add(new Texture("main002_3.png"));
		womenR.add(new Texture("main002_4.png"));
		
		womenL.add(new Texture("main002L.png"));
		womenL.add(new Texture("main002_2L.png"));
		womenL.add(new Texture("main002_3L.png"));
		womenL.add(new Texture("main002_4L.png"));
		
		MTR.add(new Texture("MTR1.png"));
		MTR.add(new Texture("MTR2.png"));
		MTR.add(new Texture("MTR3.png"));
		MTR.add(new Texture("MTR4.png"));
		
		MTL.add(new Texture("MTL1.png"));
		MTL.add(new Texture("MTL2.png"));
		MTL.add(new Texture("MTL3.png"));
		MTL.add(new Texture("MTL4.png"));
		
		WTL.add(new Texture("WTL1.png"));
		WTL.add(new Texture("WTL2.png"));
		WTL.add(new Texture("WTL3.png"));
		WTL.add(new Texture("WTL4.png"));
		
		WTR.add(new Texture("WTR1.png"));
		WTR.add(new Texture("WTR2.png"));
		WTR.add(new Texture("WTR3.png"));
		WTR.add(new Texture("WTR4.png"));
		
		MDIE.add(new Texture("mdie1.png"));
		MDIE.add(new Texture("mdie2.png"));
		MDIE.add(new Texture("mdie3.png"));
		MDIE.add(new Texture("mdie4.png"));
		MDIE.add(new Texture("mdie5.png"));
		MDIE.add(new Texture("mdie6.png"));
		MDIE.add(new Texture("mdie7.png"));
		
		WDIE.add(new Texture("wdie1.png"));
		WDIE.add(new Texture("wdie2.png"));
		WDIE.add(new Texture("wdie3.png"));
		WDIE.add(new Texture("wdie4.png"));
		WDIE.add(new Texture("wdie5.png"));
		WDIE.add(new Texture("wdie6.png"));
		WDIE.add(new Texture("wdie7.png"));
		
		manfall = new Texture("mfall.png");
		womenfall = new Texture("wfall.png");
		
		
		
	}
	public static Texture movecharacter(int movement,int di) {
		
		if(movement == 0) {
			if(RainbowMonster.chose == 0)
				if(di == 1)
				return monsterwellR.get((RainbowMonster.move/4)%4) ;
				else
					return monsterwellL.get((RainbowMonster.move/4)%4) ;
			else
				if(di == 1)
					return womenR.get((RainbowMonster.move/4)%4) ;
					else
					return womenL.get((RainbowMonster.move/4)%4) ;
				
		}
		if(movement == 1) {
			if(RainbowMonster.chose == 0)
				if(di == 1)
				return MTR.get((RainbowMonster.move/4)%4) ;
				else
					return MTL.get((RainbowMonster.move/4)%4) ;
			else
				if(di == 1)
					return WTR.get((RainbowMonster.move/4)%4) ;
					else
					return WTL.get((RainbowMonster.move/4)%4) ;
		}
		if(movement == 3) {
			diecount += 1;
			if(diecount <= 40) {
			if(RainbowMonster.chose == 0)	
				return MDIE.get((diecount/6)%7) ;
			else
				return WDIE.get((diecount/6)%7) ;
			}
			else  
				if(RainbowMonster.chose == 0)	
				return MDIE.get(6) ;
			else
				return WDIE.get(6) ;
			}
		if(movement == 4){
			if(RainbowMonster.chose == 0)	
				return manfall;
			else
				return womenfall;
			
		}
	
					
		
		
		
		return null;
		
		
	}

}
