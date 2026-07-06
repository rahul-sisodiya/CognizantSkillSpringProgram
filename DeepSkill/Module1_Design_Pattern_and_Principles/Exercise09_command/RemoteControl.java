package JavaFSE.DeepsKilling.Module1_Design_Patterns_and_Principles.Exercise09_command;

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}