import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\nОберіть завдання для виконання:");
            System.out.println("1. Завдання 1");
            System.out.println("2. Завдання 2");
            System.out.println("3. Завдання 3");
            System.out.println("4. Завдання 4");
            System.out.println("5. Завершити програму");
            System.out.print("\nВаш вибір: ");


            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        TaskName task1 = new TaskName("Завдання 1");
                        task1.printTaskNameInfo();
                        Task_1 Task_1 = new Task_1();
                        Task_1.EA();
                        break;
                    case 2:
                        TaskName task2 = new TaskName("Завдання 2");
                        task2.printTaskNameInfo();
                        Task_2 Task_2 = new Task_2();
                        Task_2.ATEN();
                        break;
                    case 3:
                        TaskName task3 = new TaskName("Завдання 3");
                        task3.printTaskNameInfo();
                        Task_3 Task_3 = new Task_3();
                        Task_3.ODA();
                        break;
                    case 4:
                        TaskName task4 = new TaskName("Завдання 4");
                        task4.printTaskNameInfo();
                        Task_4 Task_4 = new Task_4();
                        Task_4.CEA();
                        break;
                    case 5:
                        System.out.println("\nПрограма завершує роботу.");
                        running = false;
                        break;
                    default:
                        System.out.println("\nНевідома опція. Спробуйте ще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть число від 1 до 5.");
                scanner.next();
            }
        }
    }
}