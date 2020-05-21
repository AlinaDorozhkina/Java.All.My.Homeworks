package ru.geekbrains.java.homeworks;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        System.out.println(guessWord(words));
    }

    public static String guessWord(String[] inputWords) {
        Random ran = new Random();
        int randomNumber = ran.nextInt(inputWords.length);
        String randomWord = inputWords[randomNumber];
        System.out.println("Введите слово из предложенных");
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();
        if (randomWord.equals(userWord)) {
            return "Правильно. Вы отгадали.";
        }
        System.out.println(suggestCorrect(randomWord, userWord));
        while (randomWord.equals(userWord)) {
            System.out.println("Введите новое слово ");
            userWord = scanner.nextLine();

            System.out.println(suggestCorrect(randomWord, userWord));
        }
        return "Правильно. Вы отгадали.";
    }

    public static String suggestCorrect (String inputRandomWord, String inputUserWord){
        String result = " ";
        for (char j = 0; j < inputRandomWord.length(); j++) {
            char a = inputRandomWord.charAt(j);
            char b = inputUserWord.charAt(j);
            if (a == b) {
                char result1 = a;
                result += String.valueOf(result1);
            } else {
                char result2 = '#';
                result += String.valueOf(result2);
            }
        }
        return (result + "##############");
    }
}

