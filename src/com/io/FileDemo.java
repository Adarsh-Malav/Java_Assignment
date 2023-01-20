package com.io;

import java.io.File;

/*
 * File class : 
 */
class FDemo{
	File file;
	public FDemo() {
		file=new File("file3.txt");
		try {
			file.createNewFile();
			display();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void display() {
		
		//is,can has boolean
		
		System.out.println("is file or not? "+file.isFile());
		System.out.println("is Directory or not?"+file.isDirectory());
		System.out.println("is executable or not? "+ file.canExecute());
		System.out.println("can read or not "+file.canRead());
		System.out.println("can write or not "+file.canWrite());
		System.out.println("path of the file..."+file.getPath());
		System.out.println("Absolute path of the file..."+file.getAbsolutePath());
		
	}
		
}

public class FileDemo {
public static void main(String[] args) {
	new FDemo();
}
}
