package model;

public enum MenuEnum {
	ae(1),
	ac(2),
	dae(3),
	dac(4),
	cs(5),
	ea(6);
	
	int value;
	MenuEnum(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
