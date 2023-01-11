package ch06.control;

import ch06.command.Command;

import java.util.stream.IntStream;

public class RemoteControl {

    /**
     * 이 리모컨 코드들은 각 7개의 ON, OFF 명령을
     * 처리할 수 있다. 각 객체를 담아두고 추후에 실행시킨다.
     */
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        IntStream.rangeClosed(1,8)
                .forEach(index -> {
                    onCommands[index] = noCommand;
                    offCommands[index] = noCommand;
                });
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slog) {
        offCommands[slog].execute();
    }


}
