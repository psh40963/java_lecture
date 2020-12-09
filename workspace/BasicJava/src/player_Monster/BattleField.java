package player_Monster;
/* 0 : Default (None) 1 ~ 10 : Helmet //11~ 20 : Weapon //21~ 30 : Armor //31~ 40 : Shield //41~ 50 : Boots //51~ 60 : Consumables  */

public class BattleField {				//Monster(name lv    hp    att   amr   exp  money)
	Monster m0 = new Monster(AllText.monsterNames[0],   1,   60,     6,    2,   4,   1);	//rabbit
	Monster m1 = new Monster(AllText.monsterNames[1],   2,   100,   12,    3,   8,   2);	//wolf
	Monster m2 = new Monster(AllText.monsterNames[2],   3,   250,   22,    5,   25,  5);	//goblin
	Item rabbitShoes = new Item(41,0,30,1);		// Item(int itemcode,int att, int hp, int def)
	
	Monster monster;
	
	void field1(Player player){	
		monster = m0;
		battle(player,monster);
		
		if((float)player.hp/player.hp_max>0.1 && !player.haveItem(rabbitShoes) && Math.random()>0.6)	// first item event, rabbitShoes
			player.getItem(rabbitShoes);
		
	}
	void field2(Player player){	
		monster = (int)(Math.random()*2)==1? m0 : m1;
		battle(player,monster);
	}
	void field3(Player player){	
		monster = (int)(Math.random()*2+1)==2? m1 : m2;
		battle(player,monster);
	}
	
	void battle(Player player,Monster m0){
		final int fight_delay = 1200;
		battle : while(true){
			player.attack(m0);
			GameSystem.wait(fight_delay);
			if(m0.hp <= 0){
				AllText.killed(m0.name);
				m0.hp=m0.hp_max;
				player.getGold(m0.money);
				player.getExp(m0.exp);
				AllText.pressAny();
				break battle;
			}
			m0.attack(player);
			GameSystem.wait(fight_delay);
			if(player.hp <=0){
				player.die();
				break;
			}
		}
	}
	

}
