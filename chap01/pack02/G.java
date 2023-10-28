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
 * java -classpath classes chap01.pack02.G
 * java --class-path classes chap01.pack02.G
 * 
 * #######		javac options		######
 * javac -cp <classpath>			Location of classes needed to compile the program
 * javac -classpath <classpath>
 * javac --class-path <classpath>
 * -d <dir>	Directory on which to place generated class files
 * 
 * 
 * 
 * #######		java options		######
 * java -cp <classpath>				Location of classes needed to run the program
 * javac -classpath <classpath>
 * javac --class-path <classpath>
 */