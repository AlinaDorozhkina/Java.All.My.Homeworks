package ru.geekbrains.java.homeworks;

public class JavaHome {

    public static void main(String[] args) {
            byte day = 1;
            short week = 30;
            int year = 2500;
            long deposit = 200000000L;
            double temperature = 325.5;
            float money = 23.45f;
            char symbol = 'M';
            boolean result = true;
            String slogan = "Java is the best";
            System.out.println(calculate(5, 10, 15, 20));
            System.out.println("Результат " + hasResult(10, 50));
            System.out.println("Результат " + hasResult(5, 15));
            PositiveOrNegative(5);
            PositiveOrNegative(-20);
            System.out.println(OnlyNegative(20));
            System.out.println(OnlyNegative(-2));
            SayHi("Alina");
            LeapYear(2020);
        }

        public static double calculate ( double a, double b, double c, double d){
            return a * (b + (c / d));

        }

        public static boolean hasResult ( int a, int b){
            if (a + b >= 10 && a + b <= 20) {
                return true;
            } else {
                return false;
            }
        }

        public static void PositiveOrNegative ( int number){
            if (number >= 0) {
                System.out.println("Число " + number + " положительное");
            } else {
                System.out.println("Число " + number + " отрицательное");
            }
        }

        public static boolean OnlyNegative ( int number){
            if (number < 0) {
                return true;
            } else {
                return false;
            }
        }

        public static void SayHi (String name){
            System.out.println("Hi, " + name + "!");

        }

        public static void LeapYear ( int year){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год " + year + " является високосным");

            } else {
                System.out.println("Год " + year + " не является високосным");
            }

        }
    }
