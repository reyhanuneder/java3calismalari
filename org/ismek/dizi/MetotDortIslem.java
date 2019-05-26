package org.ismek.dizi;

import java.util.Scanner;

public class MetotDortIslem {

	public static void main(String[] args) {

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
			bolme(sayi1,sayi2);
		} else if (secenek == 2) {
			carpma(sayi1,sayi2);
		} else if (secenek == 3) {
			toplama(sayi1,sayi2);
		} else if (secenek == 4) {
			cikarma(sayi1,sayi2);
		
		}
		else { System.out.println("yanlýþ deðer girdiniz.");}
	}
	public static void toplama(int sayi1, int sayi2) {
		int sonuc = (sayi1 + sayi2);
		System.out.println("Sonuç: " + sonuc);
	}

	public static void cikarma(int sayi1, int sayi2) {
		int sonuc = (sayi1 - sayi2);
		System.out.println("Sonuç: " + sonuc);
	}

	public static void carpma(int sayi1, int sayi2) {
		int sonuc = (sayi1 * sayi2);
		System.out.println("Sonuç: " + sonuc);
	}

	public static void bolme(int sayi1, int sayi2) {
		float sonuc = ((float) sayi1 / sayi2);
		System.out.println("Sonuç: " + sonuc);
	}

}