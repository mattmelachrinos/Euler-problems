import java.lang.*;
import java.util.*;
public class problem27a{
	public static void main(String[] Args){
		ArrayList<Integer> array = new ArrayList<Integer>();
		int i = 3;

		for (; i < 1000 ; i+=2 ){
			for(int j = 2;  ; j++ ){
				if(i%j==0){
					break;
				}
				else if(j >= Math.sqrt(i)){
					array.add(i);
					break;
				}
			}
		}
		int a;
		int num;
		int finalNum = 0;
		int d = 0;
		int finalB = 0;
		int finalA = 0;
		for (int k = 0; k < array.size(); k++){
			a = -1000;
			System.out.println(array.get(k));
			for (; a < 1000; a++){
				num = 0;
				out:
				for(int n = 0; ; n++){
					d = n*n+a*n+k;
					for(int z = 2; ; z++){
					
						if(d%z==0){
							break out;
						}
						else if(z > Math.sqrt(d)){
							num++;
							break;
						}
					}
				}
				if(num > finalNum){
					finalA = a;
					finalB = array.get(k);
				}
				finalNum = Math.max(finalNum, num);
			}
		}
	
		System.out.println(finalA*finalB);
	}
}