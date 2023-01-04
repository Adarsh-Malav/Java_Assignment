package tts_java.com.cls;
/*
 * StringBuffer : is mutable value can be changed
 */
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer stringBuffer=new StringBuffer("This is tops technology");

	
	System.out.println("length of stringbuffer is "+stringBuffer.length());
	System.out.println("original string is "+stringBuffer);

	stringBuffer.insert(0, "hi ");
	System.out.println("length of stringbuffer is "+stringBuffer.length());
	System.out.println("original string is "+stringBuffer);
	
	stringBuffer.append(" Adarsh");
	System.out.println("length of stringbuffer is "+stringBuffer.length());
	System.out.println("original string is "+stringBuffer);
	
	stringBuffer.delete(0, 5);
	System.out.println("length of stringbuffer is "+stringBuffer.length());
	System.out.println("original string is "+stringBuffer);
	
	stringBuffer.reverse();
	System.out.println("length of stringbuffer is "+stringBuffer.length());
	System.out.println("original string is "+stringBuffer);
}
}
