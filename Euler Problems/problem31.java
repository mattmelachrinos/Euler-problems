public class problem31{
	public static void main(String[] Args){
	
		checker foo = new checker();
		foo.run(foo.total);
		System.out.println(foo.answer);
	
	}
}
class checker{

		public int[] a = {100, 50, 20, 10, 5, 2, 1};
		public int total = 200;
		public int b = 0;
		public int answer = 0;
	
	public void run(int n){
	
		if (a[b] > n && b <6){
			b++;
		}
		n -= a[b];
		
		if (n > 0){
			run(n);
		}else if(n == 0){
			answer++;
			b++;
			if (b!=6){
				run(n + a[b-1]);
			}
		}
		
	}
}