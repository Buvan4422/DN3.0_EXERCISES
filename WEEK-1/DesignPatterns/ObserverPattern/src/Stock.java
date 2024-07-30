public interface Stock {
    void notifyObs();
    void register(Observer obs);
    void deregister(Observer obs);
}
