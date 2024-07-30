public class App {
    public static void main(String[] args) throws Exception {
        Image image1 = new ProxyImage("bwoah.jpg");
        Image image2 = new ProxyImage("hero.jpg");

        image1.display();
        System.out.println("");
        image2.display();

    }
}
