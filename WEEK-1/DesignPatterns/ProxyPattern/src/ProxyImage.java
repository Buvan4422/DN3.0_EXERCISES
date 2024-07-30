public class ProxyImage implements Image{
    private RealImage rimg;
    private String fn;

    public ProxyImage(String fn) {
        this.fn = fn;
    }
    @Override
    public void display() {
        if (rimg == null) {
            rimg = new RealImage(fn);
        }
        rimg.display();
    }
}
