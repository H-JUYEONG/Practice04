package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요 - 미니로또(중복체크 할 것)

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

			System.out.print(arr[i] + "\t");
		}

	}

}