package ru.geekbrains.java.homeworks;

import java.util.Arrays;

public class JavaHome {

    public static void main(String[] args) {
        replaceArray(new int[]{1, 0, 0, 0, 0, 1, 0, 0, 0, 1});
        fillArrayEveryThird();
        multiPlayArray();
        fillSquareArray();
        findMaxMinElement();
        System.out.println("Есть ли в массиве место, в котором сумма левой и правой части массива равны? " + isBalanceExist(new int []{20, 20,20,40,20}));
    }

    // task1
    public static void replaceArray(int[] array) {
        System.out.println ("Задание 1:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //task2
    public static void fillArrayEveryThird() {
        System.out.println ("Задание 2: ");
        int arrayLength = 0;
        for (int i = 0; i <= 21; i++) {
            if (i % 3 == 0) {
                arrayLength++;
            }
        }
        int[] array2 = new int[arrayLength];
        for (int i = 0, b = 0; i <= 21; i++) {
            if (i % 3 == 0) {
                array2[b] = i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // task3
    public static void multiPlayArray() {
        System.out.println("Задание 3: ");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    //task4
    public static void fillSquareArray() {
        System.out.println ("Задание 4:");
        int[][] squareArray = new int[5][5];
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                if (squareArray[i] == squareArray[j] || j + i == squareArray.length - 1) {
                    squareArray[i][j] = 1;
                }
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }

    }
    //task5
    public static void findMaxMinElement(){
        int[] maxMinArray = new int [10];
        for (int i=0; i<maxMinArray.length;i++){
            maxMinArray[i]= (int)(Math.random()*50+1);
        }
        System.out.print("Задание 5: "+Arrays.toString(maxMinArray));
        int max = maxMinArray[0];
        int min=maxMinArray[0];
        for (int i =0; i<maxMinArray.length;i++){
            if (maxMinArray[i]>max) {
                max = maxMinArray[i];
            }
            if (maxMinArray[i]<min){
                min=maxMinArray[i];
            }
        }
        System.out.println ("\nМаксимальный элемент массива " + max + "\n"+"Минимальный элемент массива " + min);
    }
    //task 6
    public static boolean isBalanceExist(int[] array){
        System.out.println("Задание 6:" +Arrays.toString(array));
        int allElementSum =0;
        for(int i=0; i<array.length; i++){
            allElementSum+=array[i];
        }
        int previousNumbersSum=0;
        for (int i=0; i<array.length; i++){
            if(array[i]+previousNumbersSum == allElementSum -array[i]) {
                return true;
            }else {
                allElementSum-=array[i];
                previousNumbersSum+=array[i];

            }
        }
        return false;
    }



}
