public class problem5{
	public static void main(String[] Args){
		int a = 0;
		int num = 2520;
	
		while(true){
			num++;
			int b = 2;
			a = 0;
			while (a==0){
				if (b==20){
					System.out.println(num); 
					System.exit(0);
				}
				a = num % b;
				b++;	
			}
		}
	}
}