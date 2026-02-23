package com.exception;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\HP\\Desktop\\demo.txt");
		f.createNewFile();
		System.out.println("file creating successfully.");
	}

}
