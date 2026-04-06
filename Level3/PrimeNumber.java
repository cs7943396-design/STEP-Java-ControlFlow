import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year >= 1582 &&
            (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {

            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        input.close();
    }
}
