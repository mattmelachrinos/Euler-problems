public class problem9{
	public static void main (String[] Args){
		int a = 1;
		int b = 1;
		int c = 1;
		out:
		for(;a < 1000; a++){
			b = 1;
			for(;b < 1000; b++){
				c = 1;
				for (;c < 1000 ; c++){
				//System.out.println(a + " " + b);
				if((a*a) + (b*b) == (c*c)){
					if(a + b + c == 1000){
						System.out.println("a = " + a + " ; b = " + b + " ; c = " + c);
						break out;
					}

				}
				//if(b == 50){
				//	System.out.println(a);
				//}
				}
			}
		}
		a = a*b*c;
		System.out.println(a);
	
	}
}

//175625