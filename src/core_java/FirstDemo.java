package core_java;

public class FirstDemo {
public static void main(String[] args) {
	System.out.println();
	int var_1 =10;
	int il=23;//4
	long li=10000000000l;//8
	char ci='T';//2
	byte bi=127;//1
	float fi=27.93f;//4
	double di=26.5656565;//8
	boolean bb =true;//1 bit
	
	char c='1';
	
	int ic = c;
	
	char b = (char)ic;
	
	
	System.out.println("integer value " + il);
	System.out.println("long value " + li);
	System.out.println("char value " + ci);
	System.out.println("byte value " + bi);
	System.out.println("float value " + fi);
	System.out.println("double value " + di);
	System.out.println("boolean value " + bb);
	
	System.out.println(var_1);
	System.out.println(c);
	System.out.println(ic);
	System.out.println(b);
	
	char c1 = (char)98;
	System.out.println(c1);
	
	System.out.println("size of integer "+ Integer.BYTES +" bytes");
	System.out.println("size of long " + Long.BYTES +" bytes");
	System.out.println("size of char " + Character.BYTES +" bytes");
	System.out.println("size of byte " + Byte.BYTES +" bytes");
	System.out.println("size of float " + Float.BYTES +" bytes");
	System.out.println("size of double " + Double.BYTES +" bytes");
	
	
	
}	

}
