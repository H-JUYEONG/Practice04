package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		// 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		int sum = 0; // arr 배열에 저장된 값들의 합

		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num; // arr 배열에 입력한 값을 저장
			sum += arr[i]; 
		}

		double avg = sum / 5;

		System.out.println("평균은 " + avg + "입니다.");
		
		sc.close();

	}

}
