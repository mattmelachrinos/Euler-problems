public class problem20{
	
	public static void main (String[] Args){
		int sum = 0;
		String array = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000";
		for (int i = 0; i < array.length() ; i++){
			sum += Integer.parseInt(array.substring(i,i + 1)) ;
		}
		System.out.println(sum);
	}
}