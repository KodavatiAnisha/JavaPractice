package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffledup {

    public static void main(String[] args) {

        // Create a list to store String elements
    	
        List<String> names = new ArrayList<>();

        // Add elements to the list
        
        names.add("Java");
        names.add("Python");
        names.add("C++");
        names.add("Java");

        // Print elements before shuffle with identity hash code
        // identityHashCode shows the memory reference of the object
        
        
        System.out.println("Before Shuffle:");
        for (String name : names) {
            System.out.println(name + " -> " + System.identityHashCode(name));
        }

        // Shuffle the list
        // This does NOT create new objects
        // It only rearranges existing references in the list
        
        
        Collections.shuffle(names);

        // Print elements after shuffle with identity hash code
        
        
        System.out.println("\nAfter Shuffle:");
        for (String name : names) {
            System.out.println(name + " -> " + System.identityHashCode(name));
        }
    }
}