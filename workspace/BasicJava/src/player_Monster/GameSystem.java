package player_Monster;

public class GameSystem {
	static void menu(){
		System.out.print(  "[MENU]1.STATUS 2.COMBAT 3.RECOVER 4. EXIT\n>");
      //System.out.println(  "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
	static void wait(int i){
		long end = System.currentTimeMillis();
		long start = System.currentTimeMillis();
		while((end-start)<i)
			end=System.currentTimeMillis();
	}

}
