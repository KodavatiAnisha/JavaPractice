package day5;

public class Stringcheck {

	public static void main(String[] args) {
		// Create a String object with value "Hello"
		
        String str = "Hello";

        // Print the original String
        
        System.out.println("Before: " + str);

        // Print the hash code of the String
        // hashCode() is calculated based on the String's content
        
        System.out.println("HashCode Before: " + str.hashCode());

        // concat() does NOT modify the existing String object
        // It creates a NEW String object containing "Hello World"
        // Since we are not storing the returned object,
        // the new String is discarded
        
        str.concat(" World");

        // The original String remains unchanged
        
        System.out.println("After concat(): " + str);

        // Hash code is also unchanged because the content is still "Hello"
        
        System.out.println("HashCode After: " + str.hashCode());

	}

}
