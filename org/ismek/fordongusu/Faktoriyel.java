package org.ismek.fordongusu;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi = scanner.nextInt();
		int sonuc = 1;
		for (int i = 1; i <= sayi; i++) {
			sonuc = sonuc * i;

		}
		System.out.println("sonuc=" + sonuc);
	}

}
