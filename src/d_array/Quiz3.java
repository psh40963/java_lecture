package d_array;
import java.util.Arrays;

public class Quiz3 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int[] arr_count = new int[5];
		for(int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
			arr_count[arr[i]-1]++;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5 사이의 랜덤한 값이 10개 지정된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 */
				
		int new_len=5;                          //
		for(int i=0; i<arr_count.length; i++){  //  Find the length
			if(arr_count[i]==0)                 //	of answer
				new_len--;                      //
			}									//  	and declare
		int[] answer = new int[new_len];		//
	
		int temp=0;
		for(int i=0; i<arr.length; i++){
			if(arr_count[arr[i]-1] != 0){
				answer[temp] = arr[i];
				temp++;
				arr_count[arr[i]-1] =0;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
}
