package player_Monster;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Player player1 = new Player();
		GameSystem game = new GameSystem();
		game.welcomeMessage(player1);

		Scanner sc = new Scanner(System.in);
		game : while(true){
			GameSystem.menu();
			String input = sc.nextLine();
			
			switch(input){
			case "1": game.status(player1);
				break;
			case "2": game.battle(player1);
				break;
			case "3": player1.recover();
				break;
			case "4":
				System.out.println("Thank you for enjoying ["+player1.name+"]. There's NO save file for you. BYE :P");
				break game;
			default:
				System.out.println("You put the wrong command! Try again.");
				break;

			}

		}



	}










}
