package implementation;

public class RegisterFile {
	Register[] file;

	public RegisterFile(int size) {
		file = new Register[size];
		for (int i = 0; i < size; i++) {
			file[i] = new Register("0", 0, "F" + i);
		}
	}

	@Override
	public String toString() {
		String r = "";
		for (int i = 0; i < file.length; i++) {
			r += file[i].qi + " " + file[i].value + " ";
		}
		System.out.println(r);
		return r;
	}

	public Register getFile(String r) {
		return file[r.indexOf(r.substring(1))];
	}

	public void setFile(int i, Register r) {
		file[i] = r;
	}

	public boolean busyRegister(String r) {
		int index = r.indexOf(r.substring(1));

		if (file[index].qi.equals("0"))
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		String x = "123";
		System.out.println(x.substring(2));
	}
}
