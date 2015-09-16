public class problem14{
	public static void main(String[] Args){
		final long startTime = System.currentTimeMillis();
		
		long num;
		long finalNum = 0;
		
		
		for (long n = 999999; n > 0; n--){
			num = 0;
			for(long i = n; i > 1;){
				if(i%2 == 0){
					i = (i/2);
				}
				else{
					i = ((3*i)+1);
				}
				num++;
			}
			if (num > finalNum){
				finalNum =  num;
				System.out.println(n);
			}
		}
		
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime));

		
	}
}