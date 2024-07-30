public class RealImage implements Image {
    private String fn;
    public RealImage(String fn) {
        this.fn = fn;
        loadFromDisk(fn);
    }
    private void loadFromDisk(String fn) {
        System.out.println("Loading " + fn);
    }
    @Override
    public void display() {
        System.out.println("Displaying " + fn);
    }

}
