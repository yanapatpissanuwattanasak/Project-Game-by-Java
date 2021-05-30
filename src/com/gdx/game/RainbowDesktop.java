package com.gdx.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class RainbowDesktop {
	
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = RainbowMonster.name_Application;
		cfg.width = RainbowMonster.iWidth * RainbowMonster.Scale;
		cfg.height = RainbowMonster.iHeight * RainbowMonster.Scale;
		new LwjglApplication(new RainbowMonster(),cfg);
		
		
	
		
		
		
		
	
		
		
		
		
		}
}
	