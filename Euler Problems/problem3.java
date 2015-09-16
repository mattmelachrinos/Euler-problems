import java.lang.Math;

public class problem3{
	public static void main(String[] Args){
	
		int a = 999;
		int b = 999;
		int num = 0;
		int maxNum = 0;
		String number = "";
		String revNumber = "";
		String response;

		out:
		for (int k = a; k>99; k--){
			for(int j = b; j>1; j--){
				System.out.println(a + " * " + b);
				num = a*b;
				number = Integer.toString(num);
				revNumber = "";

				for (int i = number.length(); i > 0;){
					i--;
					revNumber += number.charAt(i);
					
				}
				
				if(revNumber.equals(number)){
					maxNum = Math.max(maxNum, num);
					System.out.println("Max: " + maxNum);
					System.console().readLine();
				}

					b--;

			}
			a--;
			b = 999;
		}
		

		System.out.println(num);
		System.out.println(revNumber);
	}
}
