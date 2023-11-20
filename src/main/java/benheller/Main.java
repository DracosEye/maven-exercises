package benheller;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get input string
        System.out.print("Give me something to work with: ");
        String inputString = scanner.nextLine();

        // Check for numerical value
        if (StringUtils.isNumeric(inputString)) {
            System.out.println(inputString + " is a number.");
        }
        else {
            System.out.println(inputString + " is not a number.");
        }

        // Manipulate the input
        System.out.println("Flipped case: " + StringUtils.swapCase(inputString));
        System.out.println("Reversed: " + StringUtils.reverse(inputString));

        scanner.close();
    }
}