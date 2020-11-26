package d_array;

public class Quiz {

	public static void main(String[] args) {
		//거스름돈 동전 갯수
		int money = (int)(Math.random() * 500)*10;
		int[] coin = {500, 100, 50, 10};
		
		/*
		 * 거스름돈에 동전의 단위마다 몇 개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
		
		System.out.println("거스름돈 :"+money);
		
		for(int i=0; i<coin.length; i++){
			System.out.printf("%3d원: %d개\n",coin[i],money/coin[i]);
			money =money%coin[i];
			}
		

	}

}