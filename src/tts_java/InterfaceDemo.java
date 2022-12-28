package tts_java;

class Result{
	int marks;
	public void setMarks() {
		marks=24;
	}
}

class Staff extends Result implements Student,inter{
	public void setSno() {
		System.out.println("s no is "+s_no);
		System.out.println("Marks is "+marks);
		System.out.println("i no is "+i_no);
	}
	
}

public class InterfaceDemo {
public static void main(String[] args) {
	Staff obStaff=new Staff();
	obStaff.setMarks();
	obStaff.setSno();
}
}
