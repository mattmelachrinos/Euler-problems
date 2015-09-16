import java.math.*;
import java.util.*;
import java.io.*;

public class problem13{
	public static void main (String[] Args){
		ArrayList<BigInteger> array = new ArrayList<BigInteger>();
			
		
		try{
			Scanner sc = new Scanner(new File("numbers.txt"));
			

			while(sc.hasNextBigInteger()){
				array.add(sc.nextBigInteger());
			}
			sc.close();
		}
		catch(FileNotFoundException fnfe){
			
		}
		BigInteger answer = BigInteger.valueOf(0);
		for (int i = 0; i <100 ; i++){
			answer = answer.add(array.get(i));
			System.out.println(array.get(i));
		}
		System.out.println(answer);
	}
}