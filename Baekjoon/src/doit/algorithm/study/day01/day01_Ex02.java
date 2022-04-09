package doit.algorithm.study.day01;

public class day01_Ex02 {

	static int max4(int a, int b, int c, int d) {	//4개의 값을 입력받아 최댓값을 구하는 예제
		
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		if(d>max) max = d;
		
		return max;
	}
	static int min4(int a, int b, int c, int d) {	//4개의 값을 입력받아 최소값을 구하는 예제
		
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		
		return min;
	}
	static int min3(int a, int b, int c) {	//3개의 값을 입력받아 최소값을 구하는 예제
		
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {

		System.out.println(max4(5, 2, 1, 10));
		System.out.println(max4(11, 2, 1, 10));
		System.out.println(min3(5, 15, 1));
		System.out.println(min3(5, 2, 111));
		System.out.println(min4(51, 2, 111, 13));
		System.out.println(min4(52, 2, 111, 17));
		
		
	}

}
