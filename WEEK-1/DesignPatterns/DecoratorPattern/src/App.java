public class App {
    public static void main(String[] args) throws Exception {
        Notifier mailntf = new EmailNotifier();
        Notifier smsntf = new SMSNotifierDecorator(mailntf);
        Notifier slackntf = new SlackNotifierDecorator(smsntf);
        slackntf.send("Hello, this is a test message!");
    }
}
