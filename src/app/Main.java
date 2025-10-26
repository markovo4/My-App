package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int pow(int num) {
        return num * num;
    }

    static double volumeOfCylinder(double radius, double height) {
        return (Math.PI * (radius * radius) * height);
    }

    static int arrSum(int[] array) {
        int totalSum = 0;

        for(int num : array){
            totalSum += num;
        }

        return totalSum;
    }

    static String stringReverse(String text) {
        char[] charArr = text.toCharArray();
        String reversedText = "";

        for(int i = charArr.length - 1; i >= 0; i--) {
            reversedText += charArr[i];
        }

        return reversedText;
    }

    static int powN(int num, int pow) {
        int result = num;
        for(int i = 1; i < pow; i++){
            result *= num;
        }

        return result;
    }


    static void repeatLog(int n, String log) {
        for(int i = 0; i < n; i++) {
            System.out.println(log);
        }
    }



    static void main() {
        int[] arr = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Введіть ціле число: ");
        int userInput1 = scanner.nextInt();

        System.out.println("Квадрат числа " + userInput1 + " дорівнює " + pow(userInput1) + "\n");

        System.out.println("2. Об'єм циліндра з радіусом 3.5 і висотою 10.0 дорівнює " + volumeOfCylinder(3.5, 10.0) + ".\n");

        System.out.println("3. Масив чисел: " + Arrays.toString(arr) + "\n  Сума всіх елементів масиву дорівнює " + arrSum(arr) + ".\n");

        System.out.println("4. Введіть рядок: Hello, World!\nРядок в зворотньому порядку: " + stringReverse("Hello, World!") + "\n");

        System.out.print("5. Введіть a: ");
        int a = scanner.nextInt();

        System.out.print("\nВведіть b: ");
        int b = scanner.nextInt();

        System.out.println("Результат " + a + "^" + b + " дорівнює " + powN(a, b) + ".");



        System.out.print("\n6. Введіть ціле число n: ");
        int n = scanner.nextInt();

        System.out.print("\nВведіть текстовий рядок: ");
        String text = scanner.next();

        repeatLog(n, text);



    }
}
