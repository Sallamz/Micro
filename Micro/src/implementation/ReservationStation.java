package implementation;

public class ReservationStation {
	String type;
	Reservation[] station;

	public ReservationStation(int size, String type) {
		this.type = type;
		station = new Reservation[size];

		for (int i = 0; i < station.length; i++)
			station[i] = new Reservation(null, null, null, 0, 0, 0, "", false, false);
	}

	public boolean addInstruction(Instruction inst, RegisterFile rf) {
		String op = inst.type;
		String src1 = inst.src1;
		String src2 = inst.src2;
		for (int i = 0; i < station.length; i++) {
			if (station[i].op == null) {
				station[i].op = op;
				if (!rf.busyRegister(src1)) {
					station[i].jReady = true;
					station[i].vj = rf.getFile(src1).value;
				}

				else
					station[i].qj = rf.getFile(src1).qi;

				if (!rf.busyRegister(src2)) {
					station[i].kReady = true;
					station[i].vk = rf.getFile(src2).value;
				}

				else
					station[i].qk = rf.getFile(src2).qi;

				return true;
			}

		}
		return false;
	}

}
