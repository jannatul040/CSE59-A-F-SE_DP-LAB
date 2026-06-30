
// Abstraction
interface MessageSender {
    void sendMessage(String message);
}

// Low-level implementation: Email
class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// Another low-level implementation: SMS
class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// High-level module
class NotificationService {

    private MessageSender messageSender;

    // Dependency Injection through constructor
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Using EmailSender
        MessageSender email = new EmailSender();
        NotificationService emailNotification = new NotificationService(email);
        emailNotification.alertUser("Your order has been shipped.");

        System.out.println();

        // Using SMSSender
        MessageSender sms = new SMSSender();
        NotificationService smsNotification = new NotificationService(sms);
        smsNotification.alertUser("Your OTP is 123456.");
    }
}
