import java.lang.Math;
public class problem7{
	public static void main(String[] Args){
		int sum = 1;
		int i = 3;
		for (; ; i+=2 ){
			System.out.println("i: " + i);
			for(int j = 2;  ; j++ ){
				//System.out.println("j: " + j);
				//System.console().readLine();
				if(i%j==0){
					break;
				}
				else if(j >= Math.sqrt(i)){
					sum++;
					System.out.println(sum);
					break;
				}
			
			}
			if (sum == 10001){
				break;
			}
		}
		System.out.println(i);
	}
}