package ch06.control;

import ch06.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("입력된 행동이 없습니다.");
    }
}
