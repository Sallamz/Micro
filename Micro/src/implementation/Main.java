package implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	ReservationStation ld;
	ReservationStation sd;
	ReservationStation mul;
	ReservationStation add;
	Memory memory = new Memory(1024);
	RegisterFile regFile = new RegisterFile(32);
	InstructionQueue queue = new InstructionQueue();
	int currCycle = 1;

	public Main() {

		readInputs();
		System.out.println(ld.station[0].op);
	}

	void readInputs() {

		// File path is passed as parameter
		File myObj = new File("F://Java Workspace/Micro/src/implementation/test.txt");

		try {
			Scanner myReader = new Scanner(myObj);
			String result = "";
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				result += data + "\n";
//				System.out.println(data);

			}
			//Add instructions to the instructions' queue
			result = result.substring(0, result.length() - 1);
			String[] inst = result.split("#")[0].split("\n");
			for (int i = 0; i < inst.length; i++) {
				queue.add(inst[i]);

			}
			// init Reservation Stations with sizes specified by user
			
			String[] sizes = result.split("#")[1].split("\n");
			int ldSize = Integer.parseInt(sizes[1].split(":")[1]);
			int sdSize = Integer.parseInt(sizes[2].split(":")[1]);
			int addSize = Integer.parseInt(sizes[3].split(":")[1]);
			int mulSize = Integer.parseInt(sizes[4].split(":")[1]);
			
			ld = new ReservationStation(ldSize, "L.D");
			sd = new ReservationStation(sdSize, "S.D");
			add = new ReservationStation(addSize, "ADD.D");
			mul = new ReservationStation(mulSize, "MUL.D");
//			
			myReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Main();

	}
}