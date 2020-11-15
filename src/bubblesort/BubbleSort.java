/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.*;

/**
 *
 * @author Alex
 */
public class BubbleSort {

    static int temp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeatSorting = true;
        int arraytemp;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        char repeat = 'y';
        while (repeat == 'y') {
            System.out.println("Enter a number");
            arraytemp = scanner.nextInt();
            numbers.add(arraytemp);
            System.out.println("Do you want to continue adding number y/n");
            String response = scanner.next();
            while ((response.length()) > 1) {
                System.out.println("Enter a valid answer");
                response = scanner.nextLine();
            }
            while (!(response.charAt(0) == 'y' || response.charAt(0) == 'n')) {
                System.out.println("Enter a valid answer");
                response = scanner.nextLine();
            }
            if (response.charAt(0) == 'n') {
                repeat = 'n';
            }
            
        }
        Integer[] numbersArray = numbers.toArray(new Integer[0]);

        while(issorted(numbersArray)==false){
        for (int i = 0; i < numbersArray.length-1; i++) {
            if (numbersArray[i] < numbersArray[i + 1]) {
                numbersArray = sort(numbersArray);
                repeatSorting = true;
            } 
        }
            
        }
        System.out.println(Arrays.toString(numbersArray));

    }

    public static Integer[] sort(Integer[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        return numbers;

    }
    
    public static boolean issorted(Integer[] numbersArray){
        boolean sorted = true;
        for (int i = 0; i < numbersArray.length-1; i++){
            if (numbersArray[i] < numbersArray[i+1]){
                sorted = false;
            }
        }
        return sorted;
    }

}
