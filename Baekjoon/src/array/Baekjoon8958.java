package array;
import java.util.Scanner;

public class Baekjoon8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = new String[sc.nextInt()];
				
		for(int i=0; i<array.length; i++) {
			array[i] = sc.next();
		} sc.close();
		
		for(int i=0; i<array.length; i++) {
			
			int count = 0; //연속횟수
			int sum = 0; //누적합산
			for(int j=0; j<array[i].length(); j++) {
				if(array[i].charAt(j) == 'O') {
					count++;
				}else {
					count = 0;
				}
				sum += count;
			}
			
			System.out.println(sum);
			
		}
		
	}
}
