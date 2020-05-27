package ru.geekbrains.java.homeworks;


public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private String telephoneNumber;
    private int salary;
    private int age;


    Employee(String fullName, String position, String eMail, String telephoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;

    }

    void printEmployeeInformation(Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(
                    "Full Name: " + employeeArray[i].fullName + "; " +
                            "Position : " + employeeArray[i].position + "; " +
                            "Email : " + employeeArray[i].eMail + "; " +
                            "Telephone number: " + employeeArray[i].telephoneNumber + "; " +
                            "Salary : " + employeeArray[i].salary + " rubles " + "; " +
                            "Age : " + employeeArray[i].age + " years.\n");
        }
    }

    void chooseAge(Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].age >= 40) {
                System.out.println("Employee age more than 40: " +
                employeeArray[i].fullName+ "; " + employeeArray[i].position+ "; " +employeeArray[i].eMail+ "; "+
                employeeArray[i].telephoneNumber+ "; "+employeeArray[i].salary +" rubles"+"; "+employeeArray[i].age+" years.\n");

            }
        }


    }
}


