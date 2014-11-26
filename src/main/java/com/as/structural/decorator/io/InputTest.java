package com.as.structural.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
//FIXME
	public static void main(String[] args) throws IOException {

		FileInputStream filterInputStream = new FileInputStream(
				"src/main/resources/test.txt");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(
				filterInputStream);
		InputStream inputStream = new LowerCaseInputStream(bufferedInputStream);

		int c;
		while ((c = inputStream.read()) >= 0) {
			System.out.print((char) c);
		}

		inputStream.close();
	}

}
