package player_Monster;

import java.util.Scanner;

public class Player{
	int lv;
	int exp_max;
	int exp;
	int hp_max;
	int hp;
	int power=100;
	int gold;
	String name;
	int[] exp_table = {0, 60, 100, 150, 260, 330};

	Player(){
		this(1,0,80,100);
		System.out.print("type your name > ");
		Scanner sc = new Scanner(System.in);
		this.name = sc.nextLine();
	}
	Player(int lv, int exp, int hp, int gold){
		this.lv = lv;
		this.exp = exp;
		this.exp_max = exp_table[lv];
		this.hp_max = hp;
		this.hp = hp;
		this.gold = gold;
	}
	void lvup(){

	}
	void recover(){
		int recoverPrice = 1;
		if(this.hp == this.hp_max){
			System.out.println("[FREE] Your HP is already full.");
			return;
		}
		if(gold >= recoverPrice){
			this.gold -= recoverPrice;
			this.hp = this.hp_max;
			System.out.println("[-"+recoverPrice+" gold] You spent gold to recover.");
			System.out.println("Your hp is now fully recovered!");
		}
	}
	
	void battle(Monster monster){
		int damage = monster.lv;
		int bonusGold = monster.lv;
		
		this.hp -= damage;
		this.gold += bonusGold;
		this.exp += monster.lv;
		System.out.printf("You defeated [%s]. got [%d]gold.",monster.name,bonusGold);
		System.out.printf("\nNow your HP is [%d/%d]. Your gold is [%d gold]\n",this.hp,this.hp_max,this.gold);
	}
	
	
	
}



