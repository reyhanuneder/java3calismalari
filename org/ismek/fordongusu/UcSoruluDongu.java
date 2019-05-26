package org.ismek.fordongusu;

import java.util.Scanner;

public class UcSoruluDongu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Faktöriyel Al");
		System.out.println("2.Tek Sayýlarý Yazdýr");
		System.out.println("3.Çýkýþ");
		System.out.println("Seçiminiz Nedir?");

		int secim = scanner.nextInt();
		switch (secim) {
		case 1:
			System.out.println("bir sayý giriniz");
			int sayi = scanner.nextInt();
			int sonuc = 1; 
			for (int i = 1; i <= sayi; i++) {
				sonuc = sonuc * i;

			}
			System.out.println("sonuc=" + sonuc);
			break;
		case 2:
			System.out.println("bir sayý giriniz");
			int sayi2 = scanner.nextInt();
			for (int k = 1; k < sayi2; k=k+2) {
				System.out.println(k);

			} 
			break;
		case 3:

			break;
			
		default:
			break;
		}
	}

}
