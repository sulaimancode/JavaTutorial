// Single line comment

/* Multiline
 * Comment
 * lots of lines!
 */

import java.util.Scanner;
import java.util.*;

public class Animal {
	
	public static final double FAVNUMBER = 1.6180;
	
	private String name;
	private int weight; // -2^31 to 2^31
	private boolean hasOwner = false;
	private byte age; // -28 to 127
	private long uniqueID; // -2^63 to 2^63
	private char favoriteChar;
	private double speed; // numbers with decimal places
	private float height;
	
	protected static int numberOfAnimals = 0;
	
	static Scanner userinput = new Scanner(System.in);

	public Animal() {
		numberOfAnimals++;
		
		int sumOfNumbers = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNumbers);
		
		int diffOfNumbers = 5 - 1;
		System.out.println("5 - 1 = " + diffOfNumbers);
		
		int multOfNumbers = 5 * 1;
		System.out.println("5 x 1 = " + multOfNumbers);
		
		int divOfNumbers = 5 / 1;
		System.out.println("5 / 1 = " + divOfNumbers);
		
		int modOfNumbers = 5 % 3;
		System.out.println("5 % 3 = " + modOfNumbers);
	}
	
	public static void main(String[] args) {
		
		Animal theAnimal = new Animal();
		
	}
	
	
}
