import java.util.Scanner;

class FactorialProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number > 0) {
            int factorial = 1;
            int counter = 1;

            while (counter <= number) {
                factorial = factorial * counter;
                counter++;
            }

            System.out.println("Factorial of " + number + 
                               " is " + factorial);
        } else {
            System.out.println("Enter a positive integer.");
        }

        input.close();
    }
}
