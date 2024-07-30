public class LightOnCommand implements Command {
    private Light lit;

    public LightOnCommand(Light light) {
        this.lit = light;
    }

    @Override
    public void exe() {
        lit.turnOn();
    }

}
