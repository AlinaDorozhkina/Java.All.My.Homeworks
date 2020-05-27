package ru.geekbrains.java.homeworks;

public class Main  {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Sorokin Petr", "administrator", "sorokinadmin@mail.ru",
                "+7910555555", 50000, 30);
        employeeArray[1] = new Employee("Sinitsina Marina", "chef", "marinasheg@mail.ru",
                "+79104444444", 60000, 45);
        employeeArray[2] = new Employee("Golubeva Irina", "waiter", "waiterIrina@mail.ru",
                "+7910333333", 30000, 20);
        employeeArray[3] = new Employee("Ivanov Evgenii", "director", "ivanovDirector@mail.ru",
                "89106666666", 80000, 50);
        employeeArray[4] = new Employee("Osipova Margarita", "accountent", "accountMargo@mail.ru",
                "89107777777", 70000, 41);

        employeeArray[0].printEmployeeInformation(employeeArray);
        System.out.println("Selection by age:\n");
        employeeArray[0].chooseAge(employeeArray);
    }

    }

