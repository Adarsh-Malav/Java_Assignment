package tts_java;

class Demo3{
	void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x,int y) {
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int y) {
		int c,x=10;
		c=x+y;
		System.out.println(c);
	}
}


public class MethodOverloading {
public static void main(String[] args) {
	Demo3 o = new Demo3();
	o.add();
	o.add(20, 30);
	o.add(40);
}
}
