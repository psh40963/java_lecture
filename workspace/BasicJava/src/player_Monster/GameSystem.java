package player_Monster;

import java.util.Scanner;

public class GameSystem {
	Scanner sc = new Scanner(System.in);
	String input;
	
	static void menu(){
		System.out.print(  "[MENU]  1.STATUS 2.COMBAT 3.RECOVER 4. EXIT\n>");
      //System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
	void wait(int i){
		long end = System.currentTimeMillis();
		long start = System.currentTimeMillis();
		while((end-start)<i)
			end=System.currentTimeMillis();
	}
	
	void status(Player player){
		System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println(  "■ [Lv "+player.lv+" "+player.name+"] EXP "+player.exp+"/"+player.exp_max+" HP "+player.hp+"/"+player.hp_max+" "+player.gold+" gold"+"   ■");
		System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
	void welcomeMessage(Player player){
		System.out.println("Welcome to game world ["+player.name+"]. Please wait ");
		for(int i=0; i<45; i++){
			this.wait(20);
			System.out.print("■");
		}
		System.out.println("\n■■■■■■■■■■■■■ LOADING COMPLETE ■■■■■■■■■■■■■■");
		System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
	void battle(Player player){
		field : while(true){
			fieldlist();
			System.out.print(">");
			input = sc.nextLine();
			
			switch(input){
			case "1" : battlefield(1,player);
				break;
			case "2" : battlefield(2,player);
				break;
			case "3" : battlefield(3,player);
				break;
			case "4" : battlefield(4,player);
				break field;
			default : 
				System.out.println("You put the wrong command! Try again.");
				break;
			}
		}
		
	}
	
	void battlefield(int i,Player player){
		Monster rabbit = new Monster("rabbit",1);
		Monster rat = new Monster("rat",2);
		Monster slime = new Monster("slime",2);
		Monster snake = new Monster("snake",3);
		Monster wolf = new Monster("wolf",4);
		switch(i){
		case 1:
			while(true){
				System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(  "■■■■■■■  You Met wild [rabbit] !!! ■■■■■■■■■■");
				player.battle(rabbit);
				System.out.print("Do you want to have another battle? (y,n) ");
				input = sc.nextLine();
				if( input.equals("n") )
					break;
			}
			break;
		case 2:
			System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println(  "this is not implemented yet ");
			break;
		case 4:
			break;
		default :	
			System.out.println("You put the wrong command! Try again.");
			break;
		}
		
		
		
	}
	
	void fieldlist(){
		System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println(  "■■■CHOOSE A BATTLE FIELD YOU WANT TO JOIN■■■■");
		System.out.println(  "■■■1.EASY 1[  ONLY LV1 MONSTERS IN HERE");
		System.out.println(  "■■■2.EASY 2[MONSTER LEVEL 1~2]");
		System.out.println(  "■■■3.EASY 3[MONSTER LEVEL 2~3]");
		System.out.println(  "■■■4.BACK TO MENU ■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	


}
