package org.ismek.fordongusu;

import java.util.Scanner;

public class ForDongusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi = scanner.nextInt();
		System.out.println(sayi);
		for (int i = 0; i < sayi; i++) {
			System.out.println(i);

		}
	}
}
