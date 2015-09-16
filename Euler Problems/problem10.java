import java.lang.Math;
public class problem10{
	public static void main(String[] Args){
		long sum = 2;
		for (int i = 3; i < 2000000; i+=2 ){
			System.out.println("i: " + i);
			for(int j = 2;  ; j++ ){
				//System.out.println("j: " + j);
				//System.console().readLine();
				if(i%j==0){
					break;
				}
				else if(j >= Math.sqrt(i)){
					sum += i;
					
					System.out.println("sum = " + sum);
					break;
				}
			
			}
		}
		System.out.println(sum);
	}
}