package org.ismek.dizi;

import java.util.Scanner;

public class ClasVeDiziKitapSorgulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç kitap kaydedilecek");
		int kacKitap = scanner.nextInt();
		
		Kitap[] kitaplar = new Kitap[kacKitap];
		
		for (int i = 0; i < kitaplar.length; i++);
			Kitap kitap=new Kitap();
			System.out.println("kitap adýný giriniz");
			kitap.kitapAdi = scanner.next();
			System.out.println("yayýn yýlýný giriniz.");
			kitap.yayinYili = scanner.nextInt();
			
			
		{
		}
	}

}
