package app;

public class PrinterClass implements Printer {

    public PrinterClass(){}

    @Override
    public void print(Message message) {
        String sender = message.getSender();
        String text = message.getText();

        if ((text == null || text.isBlank()) && (sender == null || sender.isBlank())) {
            Printer emptyHandler = message1 -> System.out.println("Прорабатывается пустое сообщение от анонимного пользователя...");
            emptyHandler.print(message);

        } else if(sender == null || sender.isBlank()) {
            System.out.println("Анонимный пользователь отправил сообщение: " + text);
        }
        else {
            System.out.println("Пользователь " + sender + " отправил сообщение: " + text);
        }
    }

    public static class Message {
        public String text;
        public String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        String getText() {
            return this.text;
        }
        String getSender() {
            return this.sender;
        }

        void setText(String text) {
            this.text = text;
        }

        void setSender(String sender) {
            this.sender = sender;
        }
    }
}
