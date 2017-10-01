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
		
		System.out.print("Enter the name: \n");
		
		// hasNextInt, hasNextFloat, hasNextDouble, hasNextBoolean
		// hasNextByte
		// nextInt, nextFloat, nextDouble
		
		if(userInput.hasNextLine()) {
			
			this.setName(userInput.nextLine());
			
		}
		
		this.setFavoriteColor();
		this.setUniqueID();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getUniqueID() {
		return uniqueID;
	}
	
	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to " + this.uniqueID);
	}
	
	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 1000000;
		
		this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}
	
	public void setFavoriteChar() {
		int randomNumber = (int) (Math.random() * 126) + 1;
		
		this.favoriteChar = (char) randomNumber;
		
		if(randomNumber == 32) {
			
			System.out.println("Favourite character set to Space");
			
		} else if(randomNumber == 10) {
			
			System.out.println("Favourite character set to Newline");
			
		} else {
			
			System.out.println("Favourite character set to " + this.favoriteChar);
			
		}
		
		if((randomNumber > 97) && (randomNumber < 122)) {
			
			System.out.println("Favourite character is a lowercase letter");
			
		}
		
		if(((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
			
			System.out.println("Favourite character is a letter");
			
		}
		
		int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;
		
		switch(randomNumber) {
		
			case 8:
				System.out.println("Favourite character set to backspace");
				break;
				
			case 10:
			case 11:
			case 12:
				System.out.println("Favourite character set to something else");
				break;
				
			default :
				System.out.println();
				break;
		
		}
		
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	protected static void countTo(int startingNumber) {
		
		for(int i = startingNumber; i <= 100; i++) {
			
			if(i == 90) continue;
			
			System.out.println(i);
			
		}
		
	}

	public static void main(String[] args) {
		
		Animal theAnimal = new Animal();
		
	}
	
	
}
