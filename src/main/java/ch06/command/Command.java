package ch06.command;

public interface Command {
    void execute();
    /**
     * 작업 취소기능의 추가
     */
    void undo();
}
