import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        Task_4 task = new Task_4();
        task.CEA();
    }

    public void CEA() {

        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("\n\nОберіть опцію:");
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
                        System.out.println("\nНевідома опція. Спробуйте ще раз.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть 1 або 2.");
                scanner.next();
            }
        }
    }

    public static void processInput(Scanner scanner) {
        System.out.print("\nВведіть кількість елементів масиву: ");
        int n = 0;

        while (n <= 0) {
            try {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("\nКількість елементів масиву повинна бути більшою за 0.");
                    System.out.print("\nВведіть кількість елементів масиву: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть ціле число.");
                System.out.print("\nВведіть кількість елементів масиву: ");
                scanner.next();
            }
        }

        int[] array = new int[n];

        System.out.println("\nВведіть " + n + " дійсних чисел:");
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Елемент " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть ціле число.");
                scanner.nextLine();
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                array[i] *= -1;
            }
        }

        System.out.println("\nМасив зі зміненими знаками непарних елементів:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
