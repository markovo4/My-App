package app;

public class Main {
    static void main() {
        Person john = new Person("John", 30, "Engineer");
        Person bob = new Person("Bob", 35, "Doctor");
        Person mary = new Person("Mary", 25, "Teacher");


        System.out.println(john);
        System.out.println(bob);

        System.out.println("Before profession update");
        System.out.println(mary);

        boolean result = mary.setProfession("Architecture");
        if(!result) System.out.println("Invalid Profession");

        System.out.println("After profession update");

        System.out.println(mary);


    }
}
