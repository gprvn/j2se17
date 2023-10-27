package chap01.pack02;

import chap01.pack01.F;

//creating a new package

public class G{
	public static void main(String... args){
		F f;
		System.out.println("Got it");

	}
}

/**
 * javac -d classes pack01/F.java pack02/G.java
 * 
 * java -cp classes chap01.pack02.G
 */