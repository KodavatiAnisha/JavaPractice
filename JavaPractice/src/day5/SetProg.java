package day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetProg {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Python");
        names.add("Java");
        names.add("C++");

        // Convert List to Set
        // Creates a new HashSet object.
       // HashSet is a class that implements the Set interface.
        //It automatically removes duplicates.
        
        
        Set<String> uniqueNames = new HashSet<>(names);

        System.out.println("List: " + names);
        System.out.println("Set: " + uniqueNames);

	}

}
