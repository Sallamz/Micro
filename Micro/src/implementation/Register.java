package implementation;

public class Register {
	String qi;
	double value;
	String name;

	public Register(String qi, double value, String name) {
		this.name = name;
		this.qi = qi;
		this.value = value;
	}

	public String toString() {

		return "Register: " + qi + " " + value;
	}
}
