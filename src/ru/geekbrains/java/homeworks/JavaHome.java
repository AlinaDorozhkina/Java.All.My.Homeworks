package ru.geekbrains.java.homeworks;

import java.util.Scanner;

public class JavaHome {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 9 + 1);
        guessNumber(randomNumber);
    }
    public static void guessNumber(int inputNumber) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Угадайте число от 0 до 9. У Вас есть три попытки.");
            int tryCount = 3;
            for (int i = 1; i <= 3; i++) {
                int userNumber = scanner.nextInt();
                if (userNumber == inputNumber) {
                    System.out.println("Вы угадали! Поздравляем!");
                    break;
                } else {
                    System.out.println("Ваше число " + ((userNumber < inputNumber) ? " меньше" : " больше."));
                    tryCount++;
                }
            }
            System.out.println ("Загаданное число: "+inputNumber);
            System.out.println("Сыграем еще раз? Ответ: 1 - Да; Ответ: 0 - нет.");
        } while (scanner.nextInt()==1);
        scanner.close();
    }

}




