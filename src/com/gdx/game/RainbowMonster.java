package com.gdx.game;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Input.TextInputListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;

public class RainbowMonster extends Game implements ApplicationListener ,TextInputListener{
	
	public static final String name_Application = "RainbowMonster";
	public static final int iWidth = 600;
	public static final int iHeight = 300;
	public static final int Scale = 2;
	
	private  final ArrayList<Texture> womenR = new ArrayList<Texture>();
	private  final ArrayList<Texture> womenL = new ArrayList<Texture>();
	private  final ArrayList<Texture> monsterwellR = new ArrayList<Texture>();
	private final ArrayList<Texture> monsterwellL = new ArrayList<Texture>();
	private   ArrayList<MonEnamy> Goblin = new ArrayList<MonEnamy>();
	private   ArrayList<MonEnamy> Goblincopy = new ArrayList<MonEnamy>();
	private   ArrayList<MonEnamy> Goblindie = new ArrayList<MonEnamy>();
	private   ArrayList<MonEnamy> Goblindiecopy = new ArrayList<MonEnamy>();
	private   ArrayList<Item> Iteminventory = new ArrayList<Item>();
	private   ArrayList<Item> Iteminventorycopy = new ArrayList<Item>();
	
	private   ArrayList<Boss> Bossja = new ArrayList<Boss>();
	private   ArrayList<Boss> Bossjacopy = new ArrayList<Boss>();
	
	private   ArrayList<DestoryPower> Power = new ArrayList<DestoryPower>();
	private   ArrayList<DestoryPower> Powercopy = new ArrayList<DestoryPower>();
	
	private   ArrayList<DestoryPower> BPower = new ArrayList<DestoryPower>();
	private   ArrayList<DestoryPower> BPowercopy = new ArrayList<DestoryPower>();
	
	private   ArrayList<fireball> fireballs = new ArrayList<fireball>();
	private   ArrayList<fireball> fireballscopy = new ArrayList<fireball>();
	
	private   ArrayList<ice> icelance = new ArrayList<ice>();
	private   ArrayList<ice> icelancecopy = new ArrayList<ice>();
	
	private   ArrayList<SBoss> SBossq= new ArrayList<SBoss>();
	private   ArrayList<SBoss> SBossqcopy = new ArrayList<SBoss>();
	private  int create = 0;
	public static boolean play = false;
	private  ArrayList<Double> Lift = new ArrayList<Double>();
	public String namePlayer;
	public static int chose = 0 ; 
	public static int typePower  = 1;
	public int score = 0 ;
	
	SpriteBatch batch;
	Texture monster,monster_1,monster_2,monster_3,monster1,monster1_1,monster1_2,monster1_3,map1,map2,map3,bg,bg2,monsterWomen,Pb;
	Texture monsterWomen2,monsterWomen3,monsterWomen4,monsterWomenL,monsterWomen2L,monsterWomen3L,monsterWomen4L,choose_c;
	Texture pw_1,map4,map5,map6,over,Eb,h1,h2,h3,h4,mapend,scorena,how,how2,gear,winner;
	boolean maxlevel = true;
	float x = 0;
	float y = 5;
	int direction = 1 ;
	int i = 1 ;
	int max = 1;
	int nextlevel = 1;
	int enamy = 10;
	public static int main = 0 ;
	int typec = 1;
	public static int move = 0;
	
	Random rand = new Random();
	int key = 0;
	int movement = 0;
	
	static boolean first = true;
	int jump = 20;
	boolean bos = true;
	boolean bos2 = true;
	public Text enter , quit;
	public MainCharacter Playerdie;
	public MainCharacter Player;
	int cutscreen = 0;
	public boolean item = true ;
	public int cooldown = 0;
	public int bossskill;
	public BitmapFont font1;
	public RainbowMonster() {
		Lift.add(1.0);
		Lift.add(1.0);
		Lift.add(1.0);
		
		
	}
	
	
	
	

	@Override
	public void create() {
		
		
		
		enter = new Text(1);
		quit = new Text(2);
		Goblin.clear();
		batch = new SpriteBatch();
		bos = true;
		scorena = new Texture("score2.png");
		h1 = new Texture("h1.png");
		h2 = new Texture("h2.png");
		h3 = new Texture("h3.png");
		h4 = new Texture("h4.png");
		how = new Texture("how.png");
		MainCharacter Playerdie = new MainCharacter();
		MainCharacter Player = new MainCharacter();
		over = new Texture("Overgame.png");
		monster = new Texture("main011.png");
		monster_1 = new Texture("main01_1.png");
		monster_2 = new Texture("main01_2.png");
		monster_3 = new Texture("main01_3.png");
		
		monster1 = new Texture("main0211.png");
		monster1_1 = new Texture("main02_1.png");
		monster1_2 = new Texture("main02_2.png");
		monster1_3 = new Texture("main02_3.png");
		map1 = new Texture("City1_11.png");
		map2 = new Texture("City21.png");
		map3 = new Texture("City4_1.png");
		map4 = new Texture("map4.png");
		map5 = new Texture("map5.png");
		map6 = new Texture("map6.png");
	
		monsterwellR.add(monster);
		monsterwellR.add(monster_1);
		monsterwellR.add(monster_2);
		monsterwellR.add(monster_3);
		monsterwellL.add(monster1);
		monsterwellL.add(monster1_1);
		monsterwellL.add(monster1_2);
		monsterwellL.add(monster1_3);
		monsterWomen = new Texture("main002.png");
		monsterWomen2 = new Texture("main002_2.png");
		monsterWomen3 = new Texture("main002_3.png");
		monsterWomen4 = new Texture("main002_4.png");
		monsterWomenL = new Texture("main002L.png");
		monsterWomen2L = new Texture("main002_2L.png");
		monsterWomen3L = new Texture("main002_3L.png");
		monsterWomen4L = new Texture("main002_4L.png");
		choose_c = new Texture("arrow.png");
		womenR.add(monsterWomen);
		womenR.add(monsterWomen2);
		womenR.add(monsterWomen3);
		womenR.add(monsterWomen4);
		womenL.add(monsterWomenL);
		womenL.add(monsterWomen2L);
		womenL.add(monsterWomen3L);
		womenL.add(monsterWomen4L);
		Pb = new Texture("BT.png");
		Eb = new Texture("exit.png");
		mapend = new Texture("mapend.png");
		gear = new Texture("howtona.png");
		how2 = new Texture("how2.png");
		winner = new Texture("winner.png");
		
		
		Goblin.add(new MonEnamy(1+rand.nextInt(3)));
		Goblin.add(new MonEnamy(1+rand.nextInt(3)));
		Goblin.add(new MonEnamy(1+rand.nextInt(3)));
		
		for(int k = 0;k<i;k++)
			addmon();
		
		Goblincopy.addAll(Goblin);
		Powercopy.addAll(Power);
		bg = new Texture("bgeiei.png");
		bg2 = new Texture("bgeiei.png");
		
		 font1 = new BitmapFont();
		font1.getRegion().getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);
		font1.getData().setScale(2, 2);
		
		
		
		int ran = 50;
		for(MonEnamy a :Goblin) {
			
			//a.x += rand.nextInt(500);
			a.x += ran + (rand.nextInt(5)*10);
			ran += 100;
		}
		
		
		
		
		
		
		
	}

	@Override
	public void dispose() {
		
		
	}

	@Override
	public void pause() {
		
		
	}

	@Override
	public void render()  {
	
		
		batch.begin();
		
		move += 1;
		bossskill += 1;
		cooldown +=1;
		
		if(move == 10000) {
			move = 0;
		}
		if(this.first) {
	    	Gdx.input.getTextInput(this,"Enter Your Name","New Player!!", namePlayer);
	    	Gdx.app.log("Name",namePlayer);
	    	input(namePlayer);
	    	first = false;
	    	
	    }
		if(main == 0) {
			//Stage stage;
			//TextButtonStyle textbuttonstyle;
			batch.draw(bg,0,0);
			batch.draw(gear,1050,470);
			
			BitmapFont font = new BitmapFont();
			//Skin skin;
			//skin = new Skin();
			//TextureAtlas buttonAtlas = new TextureAtlas(Gdx.files.internal("buttons/buttons.pack"));
			//skin.addRegions(buttonAtlas);
			//TextField.TextFieldStyle style = new TextField.TextFieldStyle();
		    //style.font = new BitmapFont();
		    //style.fontColor = Color.BLACK;
		    //TextField name = new TextField("", style);
		    SimpleButton btn = new SimpleButton(monsterwellR,100,50,300,300);
		    SimpleButton btn2 = new SimpleButton(womenR,800,50,300,300);
		    ButtonStart btn3 = new ButtonStart(Pb,450,400,300,150);
		    ExitButton exit = new ExitButton(Eb,450,100,300,150);
		    float x1 = 100	;
		    float y1 = 150	;
		    if(Gdx.input.isTouched()) {
		    	x1 = Gdx.input.getX();
		    	y1 = Gdx.input.getY();
		    	System.out.println( Gdx.input.getX());
		    	System.out.println( Gdx.input.getY());
		    	 if(Gdx.input.getX() >= 1100 && Gdx.input.getX() <= 1200) {
				    	if(Gdx.input.getY() >= 0 && Gdx.input.getY() <= 100) {
				    		main = 2;
				    	}
				    	
				    }
		    	
		    }
		   
		    btn.update(batch, x1,y1);
		    btn2.update(batch, x1,y1);
		    btn3.update(batch, x1,y1);
		    exit.update(batch, x1, y1);
		    if(chose == 0) 
		    	batch.draw(choose_c,220,300);
		    else
		    	batch.draw(choose_c,920,320);
		   
		    
		    
		    
		    
			if(Gdx.input.isKeyPressed(Keys.ENTER)) {
				
				
				main = 1;
				
			}
		}
		else if (main == 2) {
			if((move/30%2)==0)
				batch.draw(how2,0,0);
			else
			batch.draw(how,0,0);
			
			if(Gdx.input.isKeyPressed(Keys.ESCAPE)) {
			main = 0;
			}
		}
		else if(main == 1) {
			
		
		if(i == 1) {
		batch.draw(map1,0,0);
		}
		else if(i == 2) {
		batch.draw(map2,0,0);
		}
		else if(i == 3) {
		batch.draw(map3,0,0);
		}
		else if(i==4) {
			batch.draw(map4,0,0);
		}
		else if(i==5) {
			batch.draw(map5,0,0);
		}
		else if(i==6) {
			batch.draw(map6,0,0);
		}
		else
			batch.draw(mapend,0,0);
		if(Lift.size() == 3)
			batch.draw(h1,10,iHeight*Scale - 120);
		if(Lift.size() == 2)
			batch.draw(h2,10,iHeight*Scale - 120);
		if(Lift.size() == 1)
			batch.draw(h3,10,iHeight*Scale - 120);
		if(Lift.size() == 0)
			batch.draw(h4,10,iHeight*Scale - 120);
		
		if(this.typec == 1) {
			pw_1 = new Texture("R1.png");
		}
		if(Gdx.input.isKeyPressed(Keys.NUM_1)) {
			this.typec = 1;
			pw_1 = new Texture("R1.png");
		}
		else if(Gdx.input.isKeyPressed(Keys.NUM_2)) {
			this.typec = 2;
			pw_1 = new Texture("Y1.png");
		}
		else if(Gdx.input.isKeyPressed(Keys.NUM_3)) {
			this.typec = 3;
			pw_1 = new Texture("B1.png");
		}
		else if(Gdx.input.isKeyPressed(Keys.Q)) {
			this.typec = 4;
			pw_1 = new Texture("P1.png");
		}
		else if(Gdx.input.isKeyPressed(Keys.W)) {
			this.typec = 5;
			pw_1 = new Texture("WB1.png");
		}
		else if(Gdx.input.isKeyPressed(Keys.E)) {
			this.typec = 6;
			pw_1 = new Texture("O1.png");
		}
		else if(Gdx.input.isKeyPressed(Keys.R)) {
			this.typec = 7;
			pw_1 = new Texture("GR1.png");
		}
		
		batch.draw(pw_1,x+100,y+250);
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			
		}
		//MainCharacter Player = new MainCharacter();
		if(direction == 1) {
			if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
				movement = 0;
				//batch.draw(monsterwellR.get((move/2)%4),x,y);
				if(chose == 0)
				batch.draw(Player.movecharacter(movement,direction),x,y);
				else
					batch.draw(Player.movecharacter(movement,direction),x,y);
			}
			else
				if(chose == 0)
					if(key > 10)
						batch.draw(Player.movecharacter(movement,direction),x,y);
					else
						batch.draw(monsterwellR.get(1),x,y);
				else
					if(key > 10)
						batch.draw(Player.movecharacter(movement,direction),x,y);
					else
					batch.draw(womenR.get(1),x,y);
			
		}
		else if(direction == 2) {
			if(Gdx.input.isKeyPressed(Keys.LEFT)) {
				movement = 0;
				if(chose == 0)
				batch.draw(Player.movecharacter(movement,direction),x,y);
				else
					batch.draw(Player.movecharacter(movement,direction),x,y);
			}
			else
				if(chose == 0)
					if(key > 10)
						batch.draw(Player.movecharacter(movement,direction),x,y);
					else
						batch.draw(monsterwellL.get(1),x,y);
				else
					if(key > 10)
						batch.draw(Player.movecharacter(movement,direction),x,y);
					else
					batch.draw(womenL.get(1),x,y);
			}
		
		font1.draw(batch,namePlayer,x+80,y+260);
		batch.draw(scorena,450,500);
		font1.draw(batch,""+score,650,560);
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			if (x >= -200) {
				if ((x + 50) < iWidth * Scale - 70) {
				x += 10;
				direction = 1;
		if (Goblin.size() <= 0 && i <= 6 &&Bossja.size() == 0) {
				if(x >= (iWidth * Scale - 200)) {
					if(i<max) {
						i += 1;
						x = -100;
						if((i == max)&&(Goblin.size()==0)) {
							enamy = 10;
							create = 1;
							nextlevel += 1;
							bos = true;
							
						}
					
					}		
					}
				}
				}
			}
		}
		else if(Gdx.input.isKeyPressed(Keys.LEFT)){
			if (x <= (iWidth * Scale)+5) {
				if (i > 1 && Goblin.size()== 0 && Bossja.size() == 0 && SBossq.size() == 0 ){
					if ((x <= 0)) {
						x = 550*2;
						i -= 1;
					}
					
				}
				if ((x - 50) > -50) {
				x -= 10;
				direction = 2;
				}
			}
		}
		if(Gdx.input.isKeyPressed(Keys.SPACE)&&(key == 0)){
			
			if(key == 0) {
				if(direction == 1)
			Power.add(new DestoryPower(x+200,y+70,typec,direction));
				else if(direction == 2)
					Power.add(new DestoryPower(x,y+70,typec,direction));
			key += 20;
			
			Powercopy.addAll(Power);
			
			}	
		}
		
		if(Gdx.input.isKeyPressed(Keys.UP)){
			enamy -= 1;
			System.out.print("asdasd");
		}
		if((Goblin.size() == 0)&&(maxlevel)&& Bossja.size() == 0) {
			max += 1;
			maxlevel = false;
			
			
		}
		
		if((i  == 2 )&&(bos)&& max-i ==0) {
			System.out.println("EiEI");
			Bossja.add(new Boss(1+rand.nextInt(3),1+rand.nextInt(3),1+rand.nextInt(3),1+rand.nextInt(3),1+rand.nextInt(3)));
			
			System.out.println(bos);
			System.out.println("EiEI");
			bos = false ;
		}
		if((i  == 4 )&&(bos)&& max-i ==0) {
			System.out.println("EiEI");
			Bossja.add(new Boss(1+rand.nextInt(4),1+rand.nextInt(4),1+rand.nextInt(4),1+rand.nextInt(4),1+rand.nextInt(4)));
			
			System.out.println(bos);
			System.out.println("EiEI");
			bos = false ;
		}
		if((i  == 7 )&&(bos)) {
			
			SBossq.add(new SBoss());
			SBossqcopy.addAll(SBossq);
			bos = false ;
		}
		if((i  == 6 )&&(bos)&& max-i ==0) {
			System.out.println("EiEI");
			Bossja.add(new Boss(1+rand.nextInt(4),1+rand.nextInt(4),1+rand.nextInt(4),1+rand.nextInt(4),1+rand.nextInt(4)));
			
			System.out.println(bos);
			System.out.println("EiEI");
			bos = false ;
		}
		
			
				
		
		
		
		if((Goblincopy.size() > 0)&&(Goblin.size()>0)) {
			for(MonEnamy a :Goblincopy)
			
		 {
			
				for(DestoryPower b : Powercopy) {
				if((a.x - b.x  ) < 0) {
					if(a.colormon == b.colorpower) {
						Goblin.remove(a);
						score += 10;
						Goblindie.add(new MonEnamy(4,a.x,a.y));
						Goblindiecopy.addAll(Goblindie);
					}
						
					Power.remove(b);
				}
				
				
			}
				if(a.y >= -20) {
					if(a.x <= -200) {
						//a.y -= 300;}
						Goblin.remove(a);
						score -= 10;}
					batch.draw(a.animetionmon(),a.x,a.y);	
					a.x -= 5;
					}
					
							if(a.x - x <50) {
								try {
								Goblin.remove(a);
								Lift.remove(0);
								score -= 10;
								}catch(Exception e) {
									Starta();
									main = 3;
									
								}
								
							
						
						}
			}
		}
		
		if((Powercopy.size()>0)) {
			
			
			for(DestoryPower b : Powercopy) {
			
				if(b.x >= RainbowMonster.iWidth * RainbowMonster.Scale) {
					Power.remove(b);	
				}
				if(b.dis == 1)
					b.x += 20;
				else if(b.dis == 2)
					b.x -= 20;
				batch.draw(b.animetion(),b.x,b.y);
				
				
			}
			
			
		}
		
		if(Bossja.size() > 0) {
			System.out.print("asdasdasdaasdasdasdasd");
			for(Boss pp:Bossjacopy) {
				System.out.print(pp.lc);
				for(DestoryPower b :Powercopy) {
					if(pp.x-b.x < 50) {
						Power.remove(b);
						if((pp.t[pp.lc] == b.colorpower)) {
						
						try {
						score += 10;
						pp.hit();
						
						
						}catch(Exception e) {
							Bossja.remove(pp);
						}
						}
					}
					
				}
				try {
					pp.x -= 3;
					System.out.println("     " + pp.x);
					batch.draw(pp.animetionmon(),pp.x,pp.y);
					}catch(Exception e) {
						System.out.println("asdasd");
						Bossja.remove(pp);
						
					}
				if(pp.x - x < 20) {
					try {
					Lift.remove(0);
					Lift.remove(0);
					score -= 20;
					Bossja.remove(pp);
					}catch(Exception e) {
						Starta();
						main = 3;
					}
				}
			}
		}
		for(MonEnamy zd:Goblindiecopy) {
			batch.draw(zd.animetionmon(),zd.x,zd.y);
			if(zd.run > 30) {
				Goblindie.remove(zd);
			}
		}
		for(SBoss a:SBossqcopy) {
			for(DestoryPower b :Powercopy) {
				if(a.x - b.x <-150) {
					if(bossskill >= 700) {
						a.hp -= 1;
						if(a.hp == 0) {
							SBossqcopy.remove(a);
							main = 5;
						}
						Power.remove(b);
						
						System.out.print("asdasdasd" + a.hp);
					}
				}
				
				
			}
			batch.draw(a.animetionmon(),a.x,a.y);
			
		}
		for(DestoryPower a :BPowercopy) {
			if(a.x - x <150) {
				try {
				Lift.remove(0);
				
				BPower.remove(a);
				}catch(Exception e) {
					Starta();
					main = 3;
				}
			}
		}
		BPowercopy.clear();
		BPowercopy.addAll(BPower);
		if(Iteminventorycopy.size() == 0 && cooldown % 400 == 0) {
			Iteminventory.add(new Item(1+rand.nextInt(3)));
			item = true ;
			
		}
		Iteminventorycopy.clear();
		Iteminventorycopy.addAll(Iteminventory);
		
		if(Iteminventorycopy.size() > 0) {
			batch.draw(Iteminventorycopy.get(0).animetion(),150,435);
		}
		
		
		System.out.println(Iteminventorycopy.size());
		if(Gdx.input.isKeyPressed(Keys.UP)&& item) {
			
			if (Iteminventorycopy.get(0).power() == 1 ) {
				if(Lift.size()<3) {
					Lift.add(1.0);
				}
				
				
			}
			int c = 0;
			if(Iteminventorycopy.get(0).power() == 2 ) {
				int space = 50;
				
				fireballs.add(new fireball(x+80,y+70));
				fireballs.add(new fireball(x+80,y+70));
				fireballs.add(new fireball(x+80,y+70));
				fireballs.add(new fireball(x+80,y+70));
				fireballscopy.clear();
				fireballscopy.addAll(fireballs);
				for(fireball a:fireballscopy) {
					c+=1;
					a.y += rand.nextInt(10)*10;
					a.x += space *c;
				}
			}
			if(Iteminventorycopy.get(0).power() == 3 ) {
				int space = 100;
				
				icelance.add(new ice(x+80,y+70));
				icelance.add(new ice(x+80,y+70));
				icelancecopy.clear();
				icelancecopy.addAll(icelance);
				for(ice a:icelancecopy) {
					c+=1;
					a.y += rand.nextInt(10)*10;
					a.x += space *c;
				}
			}
			
			item = false;
			Iteminventory.remove(0);
			cooldown = 0;
		
		
		}
		//=========================================================================
		if(Lift.size()<3) {
			Lift.add(1.0);
		//========================================================================
		}
		for(fireball a:fireballscopy) {
			for(MonEnamy b:Goblincopy) {
				if(b.x - a.x < 50) {
					fireballs.remove(a);
					Goblin.remove(b);
					score += 10;
					Goblindie.add(new MonEnamy(4,a.x,-20));
					Goblindiecopy.addAll(Goblindie);
				}
					
			}
				
			if(a.time > 30 ) {
				fireballs.remove(a);
			}
			batch.draw(a.animetion(),a.x,a.y);
			a.x += 10;
		}
		for(ice a:icelancecopy) {
			for(MonEnamy b:Goblincopy) {
				if(b.x - a.x < 50) {
					icelance.remove(a);
					Goblin.remove(b);
					score += 10;
					Goblindie.add(new MonEnamy(4,a.x,-20));
					Goblindiecopy.addAll(Goblindie);
				}
					
			}
				
			if(a.x > iWidth*Scale  ) {
				icelance.remove(a);
			}
			batch.draw(a.animetion(),a.x,a.y);
			a.x += 25;
		}
		
		if(i == 7 )
			if(Goblin.size() >0)
				bossskill = 0;
			else if(Goblin.size() == 0) {
			
			if(bossskill<600 && bossskill %50 == 0) {
				BPower.add(new DestoryPower(1100,100,1+rand.nextInt(5),1));
				
			}
			if(bossskill >= 800) {
				bossskill = 0;
			}
		}
		for (DestoryPower a : BPowercopy) {
			batch.draw(a.animetion(),a.x-50,a.y);
			a.x -= 10;
			for(DestoryPower b :Powercopy) {
				if(a.x-b.x < 30) {
					if(a.colorpower == b.colorpower) {
					Power.remove(b);
					BPower.remove(a);
					score += 10;
					}
					else 
						Power.remove(b);
				}
				
			}
			if(a.x < 0) {
				BPower.remove(a);
				score -= 10;
			}
		}
		
		
		}
		if(main == 3) {
			
			batch.draw(over,0,0);
			batch.draw(Playerdie.movecharacter(3,2),iWidth-150,iHeight-80);
			
			Bossja.clear();
			batch.draw(enter.animetion(),300,80);
			batch.draw(quit.animetion(),750,80);
			if(Gdx.input.isTouched()) {
				if(Gdx.input.getX() > 300 && Gdx.input.getX() < 400) {
					if(Gdx.input.getY() > 450 && Gdx.input.getY() < 550) {
						Starta();
						x = 0;
						y = 500;
						cutscreen = 0;
						main = 4;
					}
				}
			}
			if(Gdx.input.getX() > 300 && Gdx.input.getX() < 400) {
				if(Gdx.input.getY() > 450 && Gdx.input.getY() < 550) {
					enter.check = 1;
					quit.check = 2;
					
				}
				
			}
			if(Gdx.input.isTouched()) {
				if(Gdx.input.getX() > 750 && Gdx.input.getX() < 850) {
					if(Gdx.input.getY() > 450 && Gdx.input.getY() < 550) {
						Gdx.app.exit();
					}
				}
			}
			if(Gdx.input.getX() > 750 && Gdx.input.getX() < 850) {
				if(Gdx.input.getY() > 450 && Gdx.input.getY() < 550) {
					quit.check = 1;
					enter.check = 2;
					
				}
				
			}
			
			
		}
		if(main == 4){
			
			bos = true;
			Player.diecount = 0;
			cutscreen += 1;
			if(cutscreen == 50)
				main = 1;
			batch.draw(map1,0,0);
			batch.draw(Player.movecharacter(0,1),x,y);
			if(y > 0) {
				y -= 10;
			}
			
		}
		if(main == 5) {
			batch.draw(winner,0,0);
			batch.draw(scorena,450,100);
			font1.draw(batch,""+score,650,160);
		}
		batch.end();
		
		Goblincopy.clear();
		Goblincopy.addAll(Goblin);
		Goblindiecopy.clear();
		Goblindiecopy.addAll(Goblindie);
		Powercopy.clear();
		Powercopy.addAll(Power);
		BPowercopy.clear();
		BPowercopy.addAll(BPower);
		Bossjacopy.clear();
		Bossjacopy.addAll(Bossja);
		Iteminventorycopy.clear();
		Iteminventorycopy.addAll(Iteminventory);
		fireballscopy.clear();
		fireballscopy.addAll(fireballs);
		icelancecopy.clear();
		icelancecopy.addAll(icelance);
		SBossqcopy.clear();
		SBossqcopy.addAll(SBossq);
		
		
		
		
		System.out.println(fireballs.size());
		System.out.println(icelance.size());
		System.out.println(SBossqcopy.size());
		/*System.out.println(nextlevel);
		System.out.println(i+" "+ max);
		System.out.println("EiEI = " + Bossja.size());
		System.out.println(Bossjacopy.size());
		System.out.println(Bossja.size());
		
		System.out.println(bos);
		*/
		/*System.out.println(Powercopy.size());
		System.out.println(Power.size());
		System.out.println(this.Lift.size());*/
		
		if(key>0) {
			if(key > 0) {
				movement = 1;
			}
			key-=1;
			
		}
		
		if((i>0)&&(i== max)&&(nextlevel == max)&&(create == 1)) {
			if(Bossja.size() == 0) {
				bos = true ; 
			}
			Goblin.add(new MonEnamy(1+rand.nextInt(3)));
			Goblin.add(new MonEnamy(1+rand.nextInt(3)));
			Goblin.add(new MonEnamy(1+rand.nextInt(3)));
			
			for(int k = 0;k<i;k++)
				addmon();
			
			Goblincopy.addAll(Goblin);
			Powercopy.addAll(Power);
			int ran = 50;
			for(MonEnamy a :Goblin) {
				
				//a.x += rand.nextInt(500);
				a.x += ran + (rand.nextInt(5)*10);
				ran += 100;
			}
			maxlevel = true;
			create = 0;	
		}
		}
		
		
	
	private void Starta() {
		 x = 0;
		 y = 5;
		 direction = 1 ;
		 i = 1 ;
		 max = 1;
		 nextlevel = 1;
		 enamy = 10;
		 create = 1;
		 score = 0;
		 Lift.clear();
		 Lift.add(1.0);
		 Lift.add(1.0);
		 Lift.add(1.0);
		 Goblin.clear();
		 Bossja.clear();
		 Bossjacopy.clear();
		 Iteminventory.clear();
		 Iteminventorycopy.clear();
		 Power.clear();
		 Powercopy.clear();
		 BPower.clear();
		 BPowercopy.clear();
			
		
		 
		/* MonEnamy moneiei = new MonEnamy(1);
		Random rand = new Random();
		Goblincopy.clear();
		Goblin.clear();*/
		 int key = 0;
		
	}

	
	public void addmon() {
		
		Goblin.add(new MonEnamy(1+rand.nextInt(3)));
		
		
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
	public void canceled() {
		this.namePlayer = "New Player!!";
		
	}




	@Override
	public void input(String a) {
		this.namePlayer = a;
		
	}

}
