package com.moc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	
	private static String name;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Salutation sal = new Salutation();
		
		System.out.println("Insert name ");
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in ));

		 name = inbr.readLine();
		
		 System.out.println(Float.valueOf(name));
		
		
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Application.name = name;
	}

	
	
}
