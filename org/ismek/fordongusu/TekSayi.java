package org.ismek.fordongusu;

import java.util.Scanner;

public class TekSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi = scanner.nextInt();
		for (int i = 1; i < sayi; i=i+2) {
			System.out.println(i);

		} 
		for (int i = 1; i < sayi; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
			

		}
	}
}
