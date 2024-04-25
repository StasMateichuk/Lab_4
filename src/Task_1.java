import java.util.InputMismatchException;
import java.util.Scanner;
public class Task_1 {

    public void EA () {

        int[] array = new int[50];

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\nОберіть дію:");
            System.out.println("1. Заповнити масив парними числами");
            System.out.println("2. Заповнити масив непарними числами");
            System.out.println("3. Перейти до наступного завдання");
            System.out.print("\nВаш вибір: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        FAWEN(array);
                        System.out.println("\nМасив:");
                        printArray(array);
                        break;
                    case 2:
                        FAWON(array);
                        System.out.println("\nМасив:");
                        printArray(array);
                        break;
                    case 3:
                        System.out.println(" ");
                        running = false;
                        break;
                    default:
                        System.out.println("\nНевідома опція. Спробуйте ще раз.");
                }

            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть число від 1 до 3.");
                scanner.next();
            }
        }
    }

    public static void FAWEN(int[] arr) {
        int num = 2;
        for (int i = 0; i < 50; i++) {
            arr[i] = num;
            num += 2;
        }
    }

    public static void FAWON(int[] arr) {
        int num = 1;
        for (int i = 0; i < 50; i++) {
            arr[i] = num;
            num += 2;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task_1 task = new Task_1();
        task.EA();
    }
}