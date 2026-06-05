package day5;

public class Stringchec_object {

	public static void main(String[] args) {
		
        String str1 = "Hello";

        
        System.out.println("Before:");
        System.out.println("Value: " + str1);

        // Print the identity hash code 
        System.out.println(str1.hashCode());
      
        System.out.println("Reference: " + System.identityHashCode(str1));

        // concat() does NOT modify the existing String object
        // Instead, it creates a NEW String object containing "Hello World"
        // str1 is reassigned to point to the new object
        
        str1 = str1.concat(" World");

        // Print the updated value
        
        System.out.println("\nAfter:");
        System.out.println("Value: " + str1);

        // The identity hash code is different because str1 now points
        // to a different String object
        
        System.out.println(str1.hashCode());
        
        System.out.println("Reference: " + System.identityHashCode(str1));

	}

}
