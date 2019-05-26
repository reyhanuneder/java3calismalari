package org.ismek.metod;

public class Robot {

	String isim;
	String renk;
	int boy;
	int konum;
	
	void konferansVer(String konusmaMetni) {
		System.out.println(konusmaMetni);
	}
	
	void adimAt(EnumRobotYon yon, int adimSayisi) {
		if (EnumRobotYon.ILERI.equals(yon)) {
			konum += adimSayisi;
		} else {
			konum -= adimSayisi;
		}
	}
	
	void kendiniTanit() {
		System.out.printf("İsim = %s, rengim = %s, boyum = %d", isim, renk, boy);
	}
	
	int neredesin() {
		return konum;
	}
}