public class BuilderPattern {
    public static void main(String[] args) throws Exception {
        Computer pc = new Computer.Builder()
            .setCPU("Intel i3")
            .setGPU("GT370")
            .setRAM("16 GB")
            .setStorage("500GB")
            .build();
        System.out.println(pc.getInfo());
    }
}
