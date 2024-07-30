public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String ups) {
        System.out.println(name + " received stock update: " + ups);
    }
}
