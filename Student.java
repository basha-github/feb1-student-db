public class Student {

	int rollNo;
	String name;
	String college;
	int fee;
	int math;
	int sci;
	int eng;

	public Student(int rollNo, String name, String college, int fee, int math, int sci, int eng) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.college = college;
		this.fee = fee;
		this.math = math;
		this.sci = sci;
		this.eng = eng;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "{ \n" + "\"rollNo\":" + rollNo + ", \n" + "\"name\": \"" + name + "\",\n" + " \"college\":\"" + college + "\",\n" + " \"fee\":"
				+ fee + ",\n" + " \"math\":" + math + ", \n" + "\"sci\":" + sci + ",\n" + " \"eng\":" + eng + "\n } \n";
	}

}
