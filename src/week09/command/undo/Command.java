package week09.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
