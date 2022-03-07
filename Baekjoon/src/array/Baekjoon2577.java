package array;
import java.util.Scanner;

public class Baekjoon2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt() * sc.nextInt() * sc.nextInt();
		sc.close();
	
		int[] arr = new int[10];
		
		while(value != 0) {
			arr[value%10]++;
			value /= 10;
		}
		
		for( int e : arr ) {
			System.out.println(e);
		}
		
	}

}
