package app;

import java.util.Random;

public class Main {
    static void main() {
        Random rand = new Random();
        int[][] matrix = new int[4][4];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = rand.nextInt(1, 50);
            }
        }

        int oddSum = 0;
        int evenSum = 0;

        long oddProduct = 1L;
        long evenProduct = 1L;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if(i % 2 == 0) {
                    evenSum += matrix[i][j];
                    evenProduct *= matrix[i][j];
                } else {
                    oddSum += matrix[i][j];
                    oddProduct *= matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nСума елементів у непарних рядках (рядок 1, 3): " + oddSum + "\nСума елементів у парних рядках (рядок 0, 2): " + evenSum);
        System.out.println("\nДобуток елементів у непарних стовпцях (стовпець 1, 3): " + oddProduct + "\nДобуток елементів у парних стовпцях (стовпець 0, 2): " + evenProduct);


        int current = 0;
        Integer firstSum = null;

        //Horizontal Check
        for (int[] ints : matrix) {

            for (int anInt : ints) {
                current += anInt;
            }

            if (firstSum == null) {
                firstSum = current;
            } else if (firstSum != current) {
                System.out.println("\nМатриця не є магічним квадратом.");
                return;
            }
            current = 0;
        }

        //Vertical Check
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {
                current += matrix[j][i];
            }

            if(firstSum != current){
                System.out.println("\nМатриця не є магічним квадратом.");
                return;
            }
            current = 0;
        }

        //Left to Right diagonal Check
        for(int i = 0; i < matrix.length; i++) {
            current += matrix[i][i];
        }

        if(firstSum != current){
            System.out.println("\nМатриця не є магічним квадратом.");
            return;
        }

        //Right to Left diagonal Check
        current = 0;
        for(int i = 0; i < matrix.length; i++) {
            current += matrix[i][matrix.length - 1 - i];
        }

        if(firstSum != current){
            System.out.println("\nМатриця не є магічним квадратом.");
            return;
        }

        System.out.println("\nМатриця є магічним квадратом.");

    }
}
