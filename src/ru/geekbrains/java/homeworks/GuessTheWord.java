package ru.geekbrains.java.homeworks;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        Random ran = new Random();
        int randomNumber = ran.nextInt(words.length);
        String randomWord = words[randomNumber];
       guessWord(words, randomWord);
    }

    public static void guessWord(String[] inputWords,String inputRandomWord) {
        String userWord = " ";
        do {
            System.out.println("Введите слово из предложенных");
            userWord = scanner.nextLine();
            if (inputRandomWord.equals(userWord)) {
                System.out.println("Верно.");
                break;
            }

            String helpMessage = suggestCorrect(inputRandomWord, userWord);
            System.out.println("Подсказка: " + helpMessage);

        }while (!inputRandomWord.equals(userWord));
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
        return ("Буквенные совпадения "+result + "##############");
    }
}

