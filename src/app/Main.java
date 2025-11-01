package app;

import static app.Helper.println;

public class Main {
    static void main() {
        Employee accountant = new Employee("Pupkin Ivanov Dmitrievich", "Backend Dev", "pupkin@gmail.com", "+380934527748", 28);
        println("");
        println(accountant);
        println("");

        Car mercedes = new Car("S class", 2024, 350);

        mercedes.start();
        println("");
        mercedes.getCarInfo();
    }
}
