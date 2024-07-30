public class App {
    public static void main(String[] args) throws Exception {
        Light light = new Light();
        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);

        RemoteControl rmt = new RemoteControl();

        rmt.setCommand(on);
        rmt.pressButton();

        rmt.setCommand(off);
        rmt.pressButton();
    }
}
