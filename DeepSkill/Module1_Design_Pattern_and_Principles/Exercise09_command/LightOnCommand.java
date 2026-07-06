package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise09_command;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}