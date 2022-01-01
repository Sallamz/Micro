package implementation;

public class Memory {
	double[] memory;

	public Memory(int size) {
		memory = new double[size];
	}

	double get(int index) {
		if (index >= memory.length || index < -1024) {
			return memory[memory.length - 1];
		}
		if (index < 0) {
			index = index + 1024;
		}
		return memory[index];
	}

	void set(int index, double value) {
		if (index >= memory.length || index < -1024) {
			System.out.println("Sorry, index not valid");
			return;
		}

		if (index < 0) {
			index = index + 1024;
		}

		memory[index] = value;
	}
}
