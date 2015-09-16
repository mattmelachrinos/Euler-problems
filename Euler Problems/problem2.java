public class problem2{
	public static void main(String[] Args){
	
		int a = 1;
		int b = 2;
		int num = 2;
		int n = 0;
		boolean flip = true;
		while (a < 4000000 && b < 4000000){
			if (flip){
				a += b;
				if(a%2 == 0){
					num += a;
				}
				flip = false;
				System.out.println(a);
			}
			else{
				b += a;
				if (b%2 == 0){
					num+= b;
				}
				flip = true;
				System.out.println(b);
			}
			n++;
		}
		

		System.out.println(num);
		
	}
}
