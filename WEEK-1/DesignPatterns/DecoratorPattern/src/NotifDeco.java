public abstract class NotifDeco implements Notifier {
    protected Notifier ntf;
    public NotifDeco(Notifier notifier) {
        this.ntf = notifier;
    }
    @Override
    public void send(String message) {
        ntf.send(message);
    }
}