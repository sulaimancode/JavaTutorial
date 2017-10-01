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
	
	static Scanner userinpute = new Scanner(System.in);

	public Animal() {
		super();
	}
	
	
	
}
