package player_Monster;

public class Monster{
	int lv;
	int hp_max;
	int hp;
	String name;
	int power;
	Monster(String name, int lv){
		this.lv = lv;
		this.hp = lv * 80;
		this.hp_max = this.hp;
		this.power = lv*80;
		this.name = name;
	}


}