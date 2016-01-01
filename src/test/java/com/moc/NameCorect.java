package com.moc;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class NameCorect {

	@Test
	public void test() throws IOException {
		
				
		Application.main(null);
		
		assertEquals("aa" , Application.getName());
		
	}

}
