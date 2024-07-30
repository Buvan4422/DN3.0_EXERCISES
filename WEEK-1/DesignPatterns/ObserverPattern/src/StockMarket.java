import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private String ups;
    public StockMarket() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
         observers.add(observer);
    }
    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObs() {
        for (Observer observer : observers) {
            observer.update(ups);
        }
    }
    public void update(String ups) {
        this.ups = ups;
        notifyObs();
    }

}
