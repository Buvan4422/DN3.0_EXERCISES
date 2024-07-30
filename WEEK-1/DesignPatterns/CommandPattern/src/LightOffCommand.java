public class LightOffCommand implements Command{
    private Light lt;

    public LightOffCommand(Light light) {
        this.lt = light;
    }
    @Override
    public void exe() {
        lt.turnOff();
    }

}
