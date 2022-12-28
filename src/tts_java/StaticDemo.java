package tts_java;

class SDemo{
	int no;
	static int s_no;
	
	
}

public class StaticDemo {
public static void main(String[] args) {
	SDemo s1= new SDemo();
	SDemo s2= new SDemo();
	SDemo s3= new SDemo();

	s1.no=12;
	s2.no=13;
	s3.no=14;
	
	System.out.println(s1.no);
	System.out.println(s2.no);
	System.out.println(s3.no);
	
    SDemo.s_no=10;
    SDemo.s_no=20;
    SDemo.s_no=30;
	
	System.out.println(SDemo.s_no);
	System.out.println(SDemo.s_no);
	System.out.println(SDemo.s_no);

}
}
