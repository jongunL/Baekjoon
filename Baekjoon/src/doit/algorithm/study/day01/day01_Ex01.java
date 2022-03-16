package doit.algorithm.study.day01;

import java.util.Scanner;

public class day01_Ex01 {
	
	public static void main(String[] args) {
		/*
		 TODO 알고리즘 시작
		 알고리즘이란? 
		 	- 문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합
		 */
		Scanner sc = new Scanner(System.in);
		
		//흐름구조
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = sc.nextInt();
		System.out.print("b의 값 : "); int b = sc.nextInt();
		System.out.print("c의 값 : "); int c = sc.nextInt();
		
		int max = a;
		
		//선택구조 - if문은 양갈래 구조이다.
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은 "+ max + "입니다.");
	}

}
