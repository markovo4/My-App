package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
     static void main() {

        int[] randIntArr = new int[15];
        Random randInt = new Random();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < randIntArr.length; i++){
            randIntArr[i] = randInt.nextInt(1, 100);
        }

        System.out.println("Original Array: " + Arrays.toString(randIntArr));

        for(int i = 1; i < randIntArr.length; i++){
            int current = randIntArr[i];
            int prev = i - 1;

            while(prev >= 0 && randIntArr[prev] > current){
                randIntArr[prev + 1] = randIntArr[prev];
                prev--;
            }

            randIntArr[prev + 1] = current;
        }

        System.out.println("Sorted Array: " + Arrays.toString(randIntArr) + "\n\n");

        System.out.print("Please enter an integer, index of which you would like to find within an array: ");
        int num = scanner.nextInt();

        int left = 0;
        int right = randIntArr.length - 1;
        int index = -1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(randIntArr[mid] == num){
                index = mid;
                break;
            } else if(randIntArr[mid] < num) {
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }

        if(index != -1){
            System.out.println("Index of your element is: " + index);
        } else {
            System.out.println("Could not find the index: " + index);
        }

    }
}
