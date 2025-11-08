package app;

public class Main {
    static void main() {
        PrinterClass printer = new PrinterClass();
        PrinterClass.Message message = new PrinterClass.Message("Hello World", "Alex");
        printer.print(message);
    }
}
