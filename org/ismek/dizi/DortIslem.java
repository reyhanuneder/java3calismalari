package org.ismek.dizi;

import java.util.Scanner;

public class DortIslem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.Sayýyý Giriniz: ");
		int sayi1 = scanner.nextInt();

		System.out.println("2.Sayýyý Giriniz: ");
		int sayi2 = scanner.nextInt();

		System.out.println("Ýstediðiniz Ýþlemi Yazýnýz Ardýndan Enter'a Basýnýz:");
		System.out.println("Bölme Ýçin 1'e Basýnýz");
		System.out.println("Çarpma Ýçin 2'e Basýnýz");
		System.out.println("Toplama Ýçin 3'e Basýnýz");
		System.out.println("Çýkarma Ýçin 4'e Basýnýz");

		int secenek = scanner.nextInt();
		if (secenek == 1) {
			float sonuc = ((float) sayi1 / sayi2);
			System.out.println("Sonuç: " + sonuc);
		} else if (secenek == 2) {
			int sonuc = (sayi1 * sayi2);
			System.out.println("Sonuç: " + sonuc);
		} else if (secenek == 3) {
			int sonuc = (sayi1 + sayi2);
			System.out.println("Sonuç: " + sonuc);
		} else if (secenek == 4) {
			int sonuc = (sayi1 - sayi2);
			System.out.println("Sonuç: " + sonuc);
		} else {
			System.out.println("Yanlýþ Deðer Girdiniz!!");
		}

	}
		
	}

