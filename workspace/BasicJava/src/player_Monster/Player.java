package player_Monster;

import java.util.Scanner;

public class Player{
	int lv;
	int exp;
	int hp;
	int hp_now;
	int power=100;
	int money;
	String name;

	Player(){
		this(1,0,80,100);
		System.out.print("type your name > ");
		Scanner sc = new Scanner(System.in);
		this.name = sc.nextLine();
		welcomeMessage();
	}
	Player(int lv, int exp, int hp, int money){
		this.lv = lv;
		this.exp = exp;
		this.hp = hp;
		this.hp_now = hp;
		this.money = money;
	}
	void welcomeMessage(){
		System.out.println("Welcome to this world ["+this.name+"]. Please wait ");
		for(int i=0; i<42; i++){
			GameSystem.wait(50);
			System.out.print("■");
		}
		System.out.println("\n■■■■■■■■■■■■ LOADING COMPLETE ■■■■■■■■■■■■");
		System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
	void status(){
		System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println(  "[Lv "+this.lv+" "+this.name+"] EXP "+"HP "+this.hp_now+"/"+this.hp+" "+this.money+" gold");
		System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
	}


}