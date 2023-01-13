package ch06.control;

import ch06.command.Command;
import ch06.command.NoCommand;

import java.util.stream.IntStream;

public class RemoteControl {

    /**
     * 이 리모컨 코드들은 각 7개의 ON, OFF 명령을
     * 처리할 수 있다. 각 객체를 담아두고 추후에 실행시킨다.
     */
    Command[] onCommands;
    Command[] offCommands;
    /**
     * 실행한 커맨드의 마지막 커맨드가 가진 취소기능을 넣어둡니다.
     */
    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        IntStream.rangeClosed(1,8)
                .forEach(index -> {
                    onCommands[index] = noCommand;
                    offCommands[index] = noCommand;
                });

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        // 활성화 이후 해당 작업의 취소 기능을 저장해둔다.
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    /**
     * 사용자가 취소버튼을 누르면 마지막 커맨드를 취소시킵니다.
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
