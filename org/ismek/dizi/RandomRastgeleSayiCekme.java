package org.ismek.dizi;

import java.util.Random;
import java.util.Scanner;

public class RandomRastgeleSayiCekme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("rastgele kaç sayý girilsin?");
		int girilenSayi = scanner.nextInt();
		for (int i = 0; i < girilenSayi; i++) {
			Random rnd = new Random();
			int rastgeleSayi = rnd.nextInt(100);
			System.out.println(rastgeleSayi);
		}

	}

}
