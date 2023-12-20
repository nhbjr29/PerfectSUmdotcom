import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInt = 0;
        int i = 1, sum = 0;
        while (true) {
            String askUser = "Enter a number: ";
            System.out.println(askUser);
            System.out.println("Print 0 to exit");
            userInt = in.nextInt();

            if (userInt == 0) {
                break;
            }
            sum = 0;
            while (i <= userInt / 2) {
                if (userInt % i == 0) {
                    sum += i;
                }
                i++;
            }
            i = 1;
            System.out.println("Sum of divisors: " + sum);

            if (sum == userInt) {
                System.out.println(userInt + " is a perfect number.");
            } else if (sum < userInt) {
                System.out.println(userInt + " is a deficient number.");
            } else {
                System.out.println(userInt + " is an abundant number.");
            }
        }
        in.close();
    }
}
