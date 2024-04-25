import java.util.InputMismatchException;
import java.util.Scanner;
public class Task_2 {

    public void ATEN() {

        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n\nОберіть дію:");
            System.out.println("1. Перебрати циклом while");
            System.out.println("2. Перебрати циклом for");
            System.out.println("3. Перебрати циклом while та вивести числа тільки з непарним індексом");
            System.out.println("4. Перебрати циклом for та вивести числа тільки з парним індексом");
            System.out.println("5. Вивести масив в зворотньому порядку");
            System.out.println("6. Перейти до наступного завдання");
            System.out.print("\nВаш вибір: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\nПеребрати циклом while:");
                        int i = 0;
                        while (i < numbers.length) {
                            System.out.print(numbers[i] + " ");
                            i++;
                        }
                        break;
                    case 2:
                        System.out.println("\nПеребрати циклом for:");
                        for (int number : numbers) {
                            System.out.print(number + " ");
                        }
                        break;
                    case 3:
                        System.out.println("\nПеребрати циклом while та вивести числа тільки з непарним індексом:");
                        int k = 1;
                        while (k < numbers.length) {
                            System.out.print(numbers[k] + " ");
                            k += 2;
                        }
                        break;
                    case 4:
                        System.out.println("\nПеребрати циклом for та вивести числа тільки з парним індексом:");
                        for (int m = 0; m < numbers.length; m += 2) {
                            System.out.print(numbers[m] + " ");
                        }
                        break;
                    case 5:
                        System.out.println("\nМасив в зворотньому порядку:");
                        for (int n = numbers.length - 1; n >= 0; n--) {
                            System.out.print(numbers[n] + " ");
                        }
                        break;
                    case 6:
                        System.out.println(" ");
                        running = false;
                        break;
                    default:
                        System.out.println("\nНевідома опція. Спробуйте ще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nНеправильний ввід! Будь ласка, введіть число від 1 до 6.");
                scanner.next();
            }
        }
    }
}
