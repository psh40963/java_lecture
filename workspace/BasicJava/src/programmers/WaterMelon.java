package programmers;

public class WaterMelon {
	

	public static void main(String[] args) {
		
		Watermelon sol = new Watermelon();
		System.out.println(sol.solution(3));

	}
	


}
class Watermelon {
    public String solution(int n) {
    	StringBuffer answerb = new StringBuffer("");
    	for( int i=0; i<n; i++){
    		if(i%2 ==0)
    			answerb.append("수");
    		else
    			answerb.append("박");
    	}
        String answer = answerb.toString();
        return answer;
    }
}