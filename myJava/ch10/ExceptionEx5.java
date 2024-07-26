package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5 {

	public static void main(String[] args) {
		try {
			FileReader fr = myRead("aaa.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static FileReader myRead(String name) throws FileNotFoundException {
		FileReader fr = new FileReader(name);
		return fr;
	}

}
