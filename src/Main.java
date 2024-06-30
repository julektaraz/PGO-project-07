import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            fillArray(array);
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void fillArray(int[] array) throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed.");
            }

            array[i] = num;
        }

        scanner.close();
    }
}