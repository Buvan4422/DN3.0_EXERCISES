public class SingletonPattern {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.getName("This is the first log message.");
        l2.getName("This is the second log message.");

        if (l1 == l2) {
            System.out.println("Both l1 and l2 are the same instance.");
        } else {
            System.out.println("l1 and l2 are different instances.");
        }
    }
}

