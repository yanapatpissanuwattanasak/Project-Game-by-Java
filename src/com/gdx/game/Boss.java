package com.gdx.game;

import java.util.ArrayList;
import java.util.*;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Boss implements ApplicationListener{
	public static final ArrayList<Texture> BoR = new ArrayList<Texture>();
	public static final ArrayList<Texture> BoY = new ArrayList<Texture>();
	public static final ArrayList<Texture> BoB = new ArrayList<Texture>();
	public static final ArrayList<Texture> BoP = new ArrayList<Texture>();
	public static final ArrayList<Texture> BoWB = new ArrayList<Texture>();
	public int[] t = new int[5];
	public int t1,t2,t3,t4,t5;
	static SpriteBatch batch ;
	
	public  int lc = 0;
	public int colormon ;
	
	float x = RainbowMonster.iWidth * RainbowMonster.Scale +500 ;
	
	float y = -20;
	public Boss(int t1,int t2,int t3,int t4,int t5) {
		
		t[0] = t1;
		t[1] = t2;
		t[2] = t3;
		t[3] = t4;
		t[4] = t5;
		BoR.add(new Texture("Boss1_R.png"));
		BoR.add(new Texture("Boss2_R.png"));
		BoR.add(new Texture("Boss3_R.png"));
		BoR.add(new Texture("Boss4_R.png"));
		BoR.add(new Texture("Boss5_R.png"));
		BoR.add(new Texture("Boss6_R.png"));
		BoR.add(new Texture("Boss7_R.png"));
		BoY.add(new Texture("Boss1_Y.png"));
		BoY.add(new Texture("Boss2_Y.png"));
		BoY.add(new Texture("Boss3_Y.png"));
		BoY.add(new Texture("Boss4_Y.png"));
		BoY.add(new Texture("Boss5_Y.png"));
		BoY.add(new Texture("Boss6_Y.png"));
		BoY.add(new Texture("Boss7_Y.png"));
		BoB.add(new Texture("Boss1_B.png"));
		BoB.add(new Texture("Boss2_B.png"));
		BoB.add(new Texture("Boss3_B.png"));
		BoB.add(new Texture("Boss4_B.png"));
		BoB.add(new Texture("Boss5_B.png"));
		BoB.add(new Texture("Boss6_B.png"));
		BoB.add(new Texture("Boss7_B.png"));
		BoP.add(new Texture("Boss1_P.png"));
		BoP.add(new Texture("Boss2_P.png"));
		BoP.add(new Texture("Boss3_P.png"));
		BoP.add(new Texture("Boss4_P.png"));
		BoP.add(new Texture("Boss5_P.png"));
		BoP.add(new Texture("Boss6_P.png"));
		BoP.add(new Texture("Boss7_P.png"));
		BoWB.add(new Texture("Boss1_WB.png"));
		BoWB.add(new Texture("Boss2_WB.png"));
		BoWB.add(new Texture("Boss3_WB.png"));
		BoWB.add(new Texture("Boss4_WB.png"));
		BoWB.add(new Texture("Boss5_WB.png"));
		BoWB.add(new Texture("Boss6_WB.png"));
		BoWB.add(new Texture("Boss7_WB.png"));
		
		
		
	}
	
	
	
		
		
		
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		
		
		
		
		
		
		
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
	public void hit() {
	
		lc +=1;
			
	}
	public Texture animetionmon() {
		System.out.println("\n"+lc+" asdasd = "+ t[lc]);
		if (t[lc] == 1) {
			return BoR.get((RainbowMonster.move/4)% 6) ;
		}
		else if (t[lc] == 2) {
			return BoY.get((RainbowMonster.move/4)% 6) ;
		}else if (t[lc] == 3) {
			return BoB.get((RainbowMonster.move/4)% 6) ;
		}
		else if (t[lc] == 4) {
			return BoP.get((RainbowMonster.move/4)% 6) ;
		}
		else 
			return BoWB.get((RainbowMonster.move/4)% 6) ;
		
		
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
