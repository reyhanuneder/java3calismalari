package org.ismek.metod;

public class RobotProgram {

	public static void main(String[] args) {
		
		Robot robot = new Robot();
		robot.isim = "POKEMON";
		robot.boy = 150;
		robot.renk = "SARI";
		
		robot.kendiniTanit();
		System.out.println();
		
		robot.adimAt(EnumRobotYon.ILERI, 10);
		robot.adimAt(EnumRobotYon.ILERI, 3);
		robot.adimAt(EnumRobotYon.GERI, 7);
		robot.adimAt(EnumRobotYon.ILERI, 1);
		robot.adimAt(EnumRobotYon.GERI, 6);
		
		System.out.println(robot.konum);
		
		int neredesin = robot.neredesin();
		System.out.println(neredesin);
		
		robot.konferansVer("BEN BÝR ROBOTUM YAD ELLERDE");
	}
}