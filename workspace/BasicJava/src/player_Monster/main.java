package player_Monster;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Player player1 = new Player();

		Monster homework = new Monster("homework",1);
		Monster mushroom = new Monster("mushroom",2);
		Monster zombie = new Monster("zombie",3);

		Scanner sc = new Scanner(System.in);
		game : while(true){
			GameSystem.menu();
			String input = sc.nextLine();
			
			switch(input){
			case "1": player1.status();
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				System.out.println("Thank you for enjoying ["+player1.name+"]. There's no save file for you. Bye");
				break game;

			}

		}



	}










}
