package ru.geekbrains.java.homeworks;

import java.util.Scanner;

public class JavaHome {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Вам необходимо угадать число. У Вас есть три попытки.");
        int randomNumber = (int) (Math.random() * 9 + 1);
        guessNumber(randomNumber);
    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int userAnswer;
        do {
            System.out.println(message);
            userAnswer = scanner.nextInt();
        } while (userAnswer > max || userAnswer < min);
        return userAnswer;
    }

    public static void guessNumber(int inputRandomNumber) {
        do {
            int tryCount = 3;
            for (int i = 1; i <= 3; i++) {
                int userAnswer = getNumberFromScanner("Введите число от 0 до 9", 0, 9);
                if (userAnswer == inputRandomNumber) {
                    System.out.println("Вы угадали! Поздравляем!");
                    break;
                } else {
                    System.out.println("Ваше число " + ((userAnswer < inputRandomNumber) ? " меньше" : " больше."));
                    tryCount++;
                }
            }
            System.out.println("Загаданное число: " + inputRandomNumber);
            System.out.println("Сыграем еще раз? Ответ: 1 - Да; Ответ: 0 - нет.");
        } while (scanner.nextInt() == 1);
        scanner.close();
    }
}




