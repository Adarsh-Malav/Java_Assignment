package com.io;


import java.io.FileReader;
import java.io.FileWriter;


	/*
	 * it points each character thats why hard to maintain thats why database is used 
	 * 1. file IO : file input and output
	 * 2. it is derived from the package java.io 
	 * 3. it is used to store the data permanently into stream
	 * 4. stream is medium to store data permanently
	 * 5. if source is present then we can go to the destination
	 * 
	 * types of stream
	 * 
	 * 1. bytes stream : it works with bytes
	 * 	    1. to write data into files
	 * 			FileOutputStream
	 * 		2. to read data from the file
	 * 			FileInputStream  
	 * 
	 * 2. character stream : it with uni-code
	 * 	  it takes more memory than byte stream (2byte/char)
	 * 		1. to write data into files
	 * 			FileWriter
	 * 		2. to read data from the file
	 * 			FileReader 
	 * 
	 * there are three steps to do file IO
	 * 1. to open the file class into your appropriate class
	 * 2. to write\read data into\from the file 
	 * 3. close the file
	 * 
	 * there will 2 exception for sure
	 * 1. FileNotFound
	 * 2. IOException
	 * 
	 */
	public class CharacterSream {
	
	public static void main(String[] args) {
		
		/*
		 * 
		File f = new File("File1.txt");
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		 */
			
		try {
			FileWriter fos=new FileWriter("File2.txt",true);
			//BufferedOutputStream bo=new BufferedOutputStream(fos);  // for more efficiency
			
			// to append give true in parameter
			String msg="\nTops Technologies";
			
			
			//byte b[]=msg.getBytes();
			
			fos.write(msg);      //or we can directly write --> fos.write(msg.getBytes);
			fos.flush();
			fos.close();
			
			
			System.out.println("data written...");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

		
		try {
			FileReader fis=new FileReader("file2.txt");
			int x;
			while ((x=fis.read())!=-1) {
				System.out.print((char)x);
			}
		
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
