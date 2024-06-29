package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		/*
		  키보드에서 정수로 된 돈의 액수를 입력받아 50000원권, 10000원권, 5000원권, 1000원권, 500원 동전, 100원동전,
		  50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("금액: ");

		int amount = sc.nextInt(); // 입력받은 금액

		int[] wonArray = new int[10];

		int[] count = new int[wonArray.length]; // 각 금액의 필요한 갯수를 저장하는 변수

		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;

		for (int i = 0; i < wonArray.length; i++) {
			count[i] = amount / wonArray[i]; // 처음 입력받은 금액에서 wonArray[i] 값으로 나누기
			amount = amount % wonArray[i]; // 입력받은 금액을 wonArray[i] 값으로 나눈 나머지를 amount에 갱신

			System.out.println(wonArray[i] + "원: " + count[i] + "개");
		}

		sc.close();

	}

}
