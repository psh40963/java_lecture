package d_array;
import java.util.Arrays;

public class Quiz3_teacher {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5 사이의 랜덤한 값이 10개 지정된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 */
				
		int[] temp = new int[5];
		int count = 0;
		for(int i=0; i<arr.length; i++){
			boolean flag = false;
			for(int j=0; j<temp.length; j++){
				if(arr[i] == temp[j])
					flag = true;
			}
			if(!flag){
				temp[count++] = arr[i];
			}
		}
		int[] result = new int[count];
		for(int i=0; i<result.length; i++)
			result[i] = temp[i];
		
		
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(result));
		
	}
}
