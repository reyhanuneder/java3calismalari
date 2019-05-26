package org.ismek.dizi;

import java.util.Scanner;

public class OgrenciYaslariToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("sýnýf mevcudunu giriniz.");
		int ogrenciSayisi = scanner.nextInt();
		int toplam = 0;
		int[] yasDizisi = new int[ogrenciSayisi];
		for (int i = 0; i < yasDizisi.length; i++) {
			System.out.print((i+1) + ". yaþý giriniz.");
			int yas = scanner.nextInt();
			yasDizisi[i] = yas;
			toplam += yas;
		}
		System.out.println("yaþlar toplamý= "+toplam);
		System.out.print("kaçýncý öðrenci");
		int kacinciOgrenci = scanner.nextInt();
		int ogrenciYasi = yasDizisi[kacinciOgrenci-1];
		System.out.println(ogrenciYasi);
	}
	
}
