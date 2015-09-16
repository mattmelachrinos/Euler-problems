import java.lang.Math;
public class problem12{
	public static void main(String[] Args){
		
		final long startTime = System.currentTimeMillis();
			int tri = 1;
			int i = 2;
			int numOfDiv;
			for (; ; i++ ){
				tri+=i;
				numOfDiv = 2;
				for(int j = 2;  ; j++ ){
					if(j > Math.sqrt(tri)){
						break;
					}
					if(tri%j==0){
						numOfDiv += 2;
					}
					if(j == Math.sqrt(tri)){
						numOfDiv--;
						break;
					}
				}
				if (numOfDiv >= 500){
					break;
				}
			}
		
		final long endTime = System.currentTimeMillis();
		System.out.println(tri);
		System.out.println("Total execution time: " + (endTime - startTime));
	}
}