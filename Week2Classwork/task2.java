package Tasks.Week2Classwork;

public class task2 {
    public static void main(String[] args) {
        /* Write a program to print simple interest from variables
         * Make 3 variable for amount, time and rate and save the clacuation into a variable
         * Formula:
         * si = amount * time * rate/100;
         */
        int amount = 100;
        int time = 2;
        int rate = 2;
        int si = (amount * time * rate)/100;
        System.out.println(si);
    }
    
}
