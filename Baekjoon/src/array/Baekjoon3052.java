package array;
import java.util.Scanner;

public class Baekjoon3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		boolean[] arr = new boolean[42];
//		
//		for(int i=0; i<10; i++) {
//			arr[sc.nextInt() % 42] = true;
//		}
//		sc.close();
//		
//		int count = 0;
//		for(boolean e : arr) if(e) count++;
//		System.out.println(count);
		
		int arr[] = new int[42];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			int num = sc.nextInt()%42;

			if(arr[num] != 1 ) {
				arr[num] = 1;
				count ++;
			}
		}
		sc.close();
		System.out.println(count);
		
		
	}

}
