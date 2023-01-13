package ch06.command;

import ch06.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    /**
     * 실행시 불을 켜기때문에 불을 끄면 된다.
     */
    @Override
    public void undo() {
        light.off();
    }
}
