package org.ismek.abstraction;

public abstract class Telefon {

	private int boy;
	private String renk;

	void konusulur() {
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}
}
