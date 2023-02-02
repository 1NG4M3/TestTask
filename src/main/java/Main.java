import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree(newRandomArray(10));
    }

    //    Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void taskOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println(number);
        }
    }

    //    Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
    //    если нет, то вывести "Нет такого имени"
    public static void taskTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    //    Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    public static void taskThree(int[] arr) {
        System.out.println("Массив, поступивший на вход: " + Arrays.toString(arr));
        System.out.print("Элементы, кратные '3': ");
        for (Integer number : arr) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }

    public static int[] newRandomArray(int countOfElements) {
        int[] arr = new int[countOfElements];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
