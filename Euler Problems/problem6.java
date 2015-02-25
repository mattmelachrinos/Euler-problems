public class problem6{
	public static void main(String[] Args){
		int a = 1;
		int num = 0;
		int d;
	
		while(a < 101){
			d = a*a;
			num = num + d;
			a++;
		}
		System.out.println(num);
		a = 1;
		int b = 0;
		while(a<101){
			b = b + a;
			a++;
		}
		System.out.println(b);
		b = b*b;
		System.out.println(b);
		num = b - num;
		System.out.println(num);
	}
}