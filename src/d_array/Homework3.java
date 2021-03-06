package d_array;
import java.util.Arrays;
public class Homework3 {
	public static void main(String[] args) {
		//나누어 떨어지는 숫자 배열
		int[] arr = new int[100];
		for(int i=0; i<arr.length; i++)
			arr[i] = (int)(Math.random()*100)+1;
		/*
		 * 2~5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을
		 * '정렬'해서 출력해주세요.
		 * 5
		 * [5,10,15,20,25...]
		 */
		int random = (int)(Math.random()*4)+2;           /////////////////////////
		System.out.printf("2~5 사이의 랜덤한 수 : %d\n",random);//	   Generate random  //
		int size=0;                                      // and make temp array	//
		int[] temp = new int[arr.length];                /////////////////////////
		                                                 
		for(int i=0; i<arr.length; i++){                 /////////////////////////////////////
			if(arr[i]%random ==0)                        // put only valid values on temp	//
				temp[size++]=arr[i];			         /////////////////////////////////////
		}
		int[] result = new int[size];                    //////////////////////////////
		for ( int i=0; i<result.length; i++)             // put value on result	Array//
			result[i] = temp[i];                         //////////////////////////////
		
		for(int i=0; i<result.length; i++){            ///////////////////////////
			int temp2=result[i];                       //						//
			int j;                                     //		I'll use		//
			for(j=i-1; j>=0; j--){                     //	Insertion sort		//
				if(temp2<result[j])                    //			this time	//
					result[j+1]=result[j];             //						//
				else break;                            //                       //
			}                                          //                       //
			result[j+1] = temp2;                       //                       //
		}                                              ///////////////////////////

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(result));

	}
}