package contacts;

import java.util.Scanner;

public class Record {
    private String name;
    private String surname;
    private String number;

    Record(String name, String surname, String number) {
        this.setName(name);
        this.setSurname(surname);
        this.setNumber(number);
    }

    Record () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        this.setName(scanner.next());
        System.out.println("Enter the surname of the person:");
        this.setSurname(scanner.next());
        System.out.println("Enter the number:");
        this.setNumber(scanner.next());
    }

    public void done(){
        System.out.println("\nA record created!\n" +
                "A Phone Book with a single record created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
