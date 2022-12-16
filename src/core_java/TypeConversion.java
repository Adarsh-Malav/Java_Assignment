package core_java;

public class TypeConversion {
public static void main(String[] args) {
	int il=23;//4
	
	long ll = il;//8//implicit
	
	System.out.println("value of long "+ll);
	
	int i2=(int)ll;//
	
	System.out.println("value of i2 "+ i2);
	
	int i3 = 512;
	byte b1=(byte)i3;
	System.out.println("valye of i3 "+b1);
	
}
}
