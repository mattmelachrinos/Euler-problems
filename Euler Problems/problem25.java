import java.math.*;
import java.util.*;
public class problem25{
	public static void main(String[] Args){
		
		final long startTime = System.currentTimeMillis();
		int n = 3;
		try{
			BigInteger a = new BigInteger("1");
			BigInteger b = new BigInteger("2");

			
	
			String numberLength ="";
			boolean flip = true;
			while (numberLength.length() < 1000){
				if (flip){
					a = a.add(b);
					
					flip = false;
				
					numberLength = a.toString();
					
				}
				else{
					b = b.add(a);

					flip = true;
					numberLength = b.toString();
				}
				n++;
			}
		}
		catch(NumberFormatException e){
			System.out.println("oopsies");
		}		
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime));
		System.out.println(n);
		
	}
}
