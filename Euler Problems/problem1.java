public class problem1{
	public static void main(String[] Args){
	
		int x =0;
		int sum =0;
		while ( x < 1000){
			
			if(x%3==0){
			sum = sum + x;
			}else if(x%5==0){
				sum = sum + x;
			}
		x++;
			
		}

		System.out.println(sum);
	}
}
