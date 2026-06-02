package day4;

import java.util.*;

public class Rolemapping {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Access tier (Admin / Dev / User) : ");
        String tier = scanner.nextLine().toUpperCase();

        int size = switch (tier) {
            case "ADMIN" -> 8;
            case "DEV"   -> 6;
            default      -> 4;
        };          

        var characters = new ArrayList<>(
                List.of("A", "x", "9", "K", "2", "@", "f", "R", "4", "Q", "7"));

        Collections.shuffle(characters);

        String mfaToken = String.join("", characters.subList(0, size));

        System.out.println("Generated MFA Token: " + mfaToken);

        scanner.close();
    }
}