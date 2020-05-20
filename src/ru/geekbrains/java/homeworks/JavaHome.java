package ru.geekbrains.java.homeworks;

import java.util.Arrays;

public class JavaHome {

    public static void main(String[] args) {
        System.out.println ("Задание 1:");
        int[] array = {1, 0, 0, 0, 0, 1, 0, 0, 0, 1};
        System.out.println(Arrays.toString(array));
        replaceArray(array);
        System.out.println(Arrays.toString(array));

        System.out.println ("Задание 2:");
        int [] emptyArray = new int[8];
        fillArrayEveryThird(emptyArray);
        System.out.println (Arrays.toString(emptyArray));

        System.out.println ("Задание 3:");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println (Arrays.toString(arr));
        multiPlayArray(arr);
        System.out.println (Arrays.toString(arr));

        System.out.println ("Задание 4:");
        int [][] squareArray=new int[5][5];
        fillSquareArray(squareArray);

        findMaxMinElement();
        System.out.println("Есть ли в массиве место, в котором сумма левой и правой части массива равны? " + isBalanceExist(new int []{20, 20,20,40,20}));
    }

    // task1
    public static void replaceArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
           /*
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");

            */
            inputArray[i]= (inputArray[i]==0) ? 1:0;
        }
    }

    //task2
    public static void fillArrayEveryThird(int [] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i]=i*3;
            }
        }



    // task3
    public static void multiPlayArray(int [] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i]=(inputArray[i]<6)? (inputArray[i]*2): inputArray[i];
        }
    }

    //task4
    public static void fillSquareArray(int[][]inputSquare) {

        for (int i = 0; i < inputSquare.length; i++) {
            for (int j = 0; j < inputSquare[i].length; j++) {
                if (inputSquare[i] == inputSquare[j] || j + i == inputSquare.length - 1) {
                    inputSquare[i][j] = 1;
                }
                System.out.print(inputSquare[i][j] + " ");
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
