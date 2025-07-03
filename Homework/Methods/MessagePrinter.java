package Homework.Methods;

class MessagePrinter {
    public static void main(String[] args) {

        MessagePrinter printer = new MessagePrinter();
        printer.messagePrinter("Printing message");
    }

    void messagePrinter(String message) {
        System.out.println(message);
    }
}