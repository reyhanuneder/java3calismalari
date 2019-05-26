package org.ismek.fordongusu;

import java.util.Scanner;

public class Yildiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi = scanner.nextInt();
for (int i = 0; i < sayi; i++) {
	System.out.print("*");
	for (int j = sayi; j < 1; j--) {
		System.out.println("*");
		
	}
}
	}

}
