package tts_java;


class In_b{
	String name;
	int age;
	String addressString;
	
	public In_b() {
		System.out.println("i am in b");
	}
	
	public void set() {
		name="adarsh malav";
		age=24;
		addressString="surat";
	}
	public void display() {
		System.out.println(name+" "+age+" "+addressString);
	}
}

class In_a extends In_b{
	
	public void display1() {
		
		System.out.println("i am a");
	}
}
class In_c extends In_a{
	public void display2() {
		System.out.println("i am in c");
	}
}

public class Inheritence1 {
public static void main(String[] args) {
	In_c o = new In_c();
	o.set();
	o.display();
	o.display1();
	o.display2();
	//In_b oB =new In_b();
}
}
