package Tasks.Week2;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        /* 7. Take the name, roll number, and field of interest from the user and print in the format below: 
        Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ".");
        System.out.println("My field of interest is " + fieldOfInterest + ".");

        scanner.close();
    }
}
