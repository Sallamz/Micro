package implementation;

import java.util.LinkedList;
import java.util.Queue;

public class InstructionQueue {
	Queue<Instruction> instructions = new LinkedList<Instruction>();

	public void add(String inst) {

		String[] tokens = inst.split(" ");
		String type, dest, src1, src2;
		src2 = null;
		type = tokens[0];
		dest = tokens[1];
		src1 = tokens[2];

		if (!(type.equals("L.D") || type.equals("S.D")))
			src2 = tokens[3];
		instructions.add(new Instruction(type, dest, src1, src2));
	}

	public Queue<Instruction> getInstructions() {
		return instructions;
	}

//	public static void main(String[] args) {
//		String i = "s i c k s1";
//		InstructionQueue x= new InstructionQueue();
//		x.add(i);
//		System.out.println(x.getInstructions());
//	}
}
