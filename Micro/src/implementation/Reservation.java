package implementation;

public class Reservation {
	String op;
	String qj, qk;
	double vj, vk;
	int A;
	String address;
	boolean jReady, kReady;
	boolean finishedExec = false;
	int timeLeft;

	public Reservation(String op, String qj, String qk, double vj, double vk, int a, String address, boolean jReady,
			boolean kReady) {
		this.op = op;
		this.qj = qj;
		this.qk = qk;
		this.vj = vj;
		this.vk = vk;
		this.A = a;
		this.address = address;
		this.jReady = jReady;
		this.kReady = kReady;
	}

}
