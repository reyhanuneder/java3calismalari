package org.ismek.metod;

import java.util.Scanner;

public class OrtalamaHesaplama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sayi1 = 20;
		int sayi2 = 30;
		float sonuc = ortalama(sayi1, sayi2);
		System.out.println(sonuc);
		ortalama();
	}

	static float ortalama(int s1, int s2) {
		return ((float)s1 + s2) / 2;
	}

	static float ortalama() {
		int toplam = 0;
		int[] dizi = { 1, 3, 5, 7, 9 };
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		float ortalama = toplam / 5;
		System.out.println(ortalama);
		return ortalama;
	}
}
