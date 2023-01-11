package ch06.command;

import ch06.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * LightOffCommand 는 리시버를 off()메서드와 결합한다.
     */
    @Override
    public void execute() {
        light.off();
    }
}
