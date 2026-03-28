package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] mediterranean = {"Greek", "Roman", "Phoenician", "Egyptian", "Turkish"};

		//2. print the third element in the array
	System.out.println(mediterranean[2]);
		//3. set the third element to a different value
		
		//4. print the third element again
		String[] names = {"Sarah", "Joe","Ali", "Jose"};
		int[] ages = {12, 15, 9, 5};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		for(int i =0; i<5; i++) {
			System.out.println(mediterranean[i]);
		}
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		Random rand = new Random();
		int[] fiftyInt = new int[50];
		//6. make an array of 50 integers
		for(int i=0; i<fiftyInt.length; i++) {
		fiftyInt[i]=rand.nextInt(500);
		}
	
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
