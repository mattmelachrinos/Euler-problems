public class problem19{
	
	public static void main (String[] Args){
		int numOfSundays = 0;
		int dayOfWeek = 0;
		int month = 0;
		int day = 0;
		int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 29};
		for (int year = 0; year < 101 ; year++){
			month = 0;
			for (; month < 12; month++){
				day = 0;
				if (month == 1 && year%4 == 0 && year > 0){
					month = 12;
				}
				for (; day < array[month]; day++){
					dayOfWeek++;
					if (dayOfWeek==0 && day==0 && year > 0){
						numOfSundays++;
					}
					if (dayOfWeek == 6){
						dayOfWeek = -1;
					}
				}
				if(month == 12){
					month = 1;
				}
			}
		}
		System.out.println(numOfSundays);
	}
}