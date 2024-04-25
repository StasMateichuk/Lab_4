import java.util.InputMismatchException;
import java.util.Scanner;
public class Task_3 {

    public void ODA() {

        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("\nОберіть опцію:");
            System.out.println("1. Ввести значення елементів масиву");
            System.out.println("2. Перейти до наступного завдання");
            System.out.print("\nВаш вибір: ");

            try {
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        processInput(scanner);
                        break;
                    case 2:
                        continueInput = false;
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("Невідома опція. Спробуйте ще раз.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть 1 або 2.");
                scanner.next();
            }
        }
    }

    private static void processInput(Scanner scanner) {

        int n = 0;
        boolean validInput = false;
        while (!validInput) {

            try {
                System.out.print("\nВведіть кількість елементів масиву: ");
                n = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть ціле число.");
                scanner.next();
            }
        }


        double[] numbers = new double[n];

        System.out.println("\nВведіть " + n + " дійсних чисел:");
        for (int i = 0; i < n; i++) {
            boolean validNumber = false;
            while (!validNumber) {

                try {
                    System.out.print("Елемент " + (i + 1) + ": ");
                    numbers[i] = scanner.nextDouble();
                    validNumber = true;
                } catch (InputMismatchException e) {
                    System.out.println("\nНеправильний ввід! Будь ласка, введіть ціле число.");
                    scanner.next();
                }
            }
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        System.out.println("\nСума елементів масиву: " + sum);
    }
}
