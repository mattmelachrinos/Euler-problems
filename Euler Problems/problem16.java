import java.math.*;
import java.util.*;
public class problem16{
	public static void main(String[] Args){
		
		final long startTime = System.currentTimeMillis();
		int sum = 0;
		String number = "";
		try{
			BigInteger a = new BigInteger("2");
			BigInteger b = new BigInteger("2");
			
			for(int i = 0; i<999; i++){
				a = a.multiply(b);
				//System.out.println(a);
			}
			number = a.toString();
			System.out.println(number);
		}
		catch(NumberFormatException e){
			System.out.println("oopsies");
		}		
		System.out.println(number.length());
		number = "10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376";
		for (int i = 0; i < number.length(); i++){
			sum =  sum + (int) number.charAt(i);
		//	System.out.println(number.charAt(i));
			//System.out.println(sum);
		}
		System.out.println(sum);
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime));

		
	}
}
