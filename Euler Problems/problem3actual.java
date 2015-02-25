import java.util.ArrayList;

public class problem3actual{
	public static void main (String[] Args){
		ArrayList<Long> answerList = new ArrayList<Long>();
		long num = 600851475143L; 
		
		for(long i = 2; i < 300400000L; i++){
			if(num%i == 0){
				answerList.add(num/i);
			}
		}
		System.out.println(answerList);
		int i = 0;
		out:
		while(true){
			for(int j = 2;  ; j++){
				if (answerList.get(i)%j == 0){
					break;
				}
				else if(j == (answerList.get(i)/2)){
					break out;
					
				}
				
			}
			
		
			i++;
		}
		System.out.println(answerList.get(i));
	}
}