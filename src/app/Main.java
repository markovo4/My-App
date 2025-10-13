package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static void main(){
        int[] randNumArr = new int[20];

        Random randNum = new Random();

        for (int i = 0; i <= randNumArr.length - 1; i++){
            randNumArr[i] = randNum.nextInt(-100,100);
        }

        // Task 1
        int counter = 0;

        for(int num : randNumArr){
            counter += num;
        }

        System.out.println("\nTask #1\nTotal sum of the array: " + counter);
        System.out.println("\n----------------------------------------------------------");


        //Task 2
        int even = 0;

        for(int num : randNumArr){
            even += num % 2 == 0 ? 1 : 0;
        }

        int odd = randNumArr.length - even;

        System.out.println("\nTask #2\nTotal count of even: " + even + "\nTotal count of odd: " + odd);
        System.out.println("\n----------------------------------------------------------");


        //Task #3
        int min = Arrays.stream(randNumArr).min().getAsInt();
        int max = Arrays.stream(randNumArr).max().getAsInt();

        int indexOfMin = -1;
        int indexOfMax = -1;

        for( int i = 0; i <= randNumArr.length - 1; i++ ) {
            if (randNumArr[i] == min) {
                indexOfMin = i;
            } else if (randNumArr[i] == max) {
                indexOfMax = i;
            }
        }

        System.out.println("\nTask #3\nMax: " + max + "\nMin: " + min + "\nIndex of max: " + indexOfMax + "\nIndex of min: " + indexOfMin);
        System.out.println("\n----------------------------------------------------------");


        //Task #4
        double totalSum = 0;
        double ave;
        boolean startCounter = false;

        for(int num : randNumArr){
            if(num < 0 && !startCounter){
                startCounter = true;
            } else {
                totalSum += num;
            }
        }

        if(!startCounter){
            System.out.println("\nTask #4\nNo Negative numbers to be found!");
        } else {
            ave = totalSum / randNumArr.length;
            System.out.println("\nTask #4\nAverage of the 20 numbers is: " + ave);
        }

    }
}
