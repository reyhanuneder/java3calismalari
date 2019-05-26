package org.ismek.metod;
import java.util.Scanner;

public class VucutKitleEndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Boy=");
		float boy = scanner.nextFloat();

		System.out.println("Kilo=");
		float kilo = scanner.nextFloat();

		float sonuc = kitleEndeksiHesapla(boy, kilo);

		System.out.println("Vücut kitle endeksiniz: " + sonuc);
	}

	public static float kitleEndeksiHesapla(float boy, float kilo) {
		return kilo / (boy * boy);

	}

}
