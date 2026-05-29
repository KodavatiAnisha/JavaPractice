package day4;
import java.util.Random;

public class Token {

    public static void main(String[] args) {

        // Characters allowed in token
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Object of Random class
        Random random = new Random();

        // Token length
        int length = 10;

        // Empty string to store token
        String token = "";

        // Loop to generate token
        for (int i = 0; i < length; i++) {

            // Generate random index
            int index = random.nextInt(characters.length());

            // Add random character to token
            token += characters.charAt(index);
        }

        // Print token
        System.out.println("Generated Token: " + token);
    }
}