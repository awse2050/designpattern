package ch06.command;

import ch06.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("입력된 행동이 없습니다.");
    }

    @Override
    public void undo() {
        System.out.println("이전 작업이 없습니다.");
    }
}
