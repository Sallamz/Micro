package implementation;

public class Instruction {
	String type, dest, src1, src2;
	int start;
	int remainingTime;
	int end;
	int execTime;

	public Instruction(String type, String dest, String src1, String src2) {
		this.type = type;
		this.dest = dest;
		this.src1 = src1;
		this.src2 = src2;
	}

	@Override
	public String toString() {

		return "Instruction: " + type + " " + dest + " " + src1 + " " + src2;
	}

	public static void main(String[] args) {
		Instruction i = new Instruction("s", "i", "c", "k");
		System.out.println(i.toString());
	}

}
