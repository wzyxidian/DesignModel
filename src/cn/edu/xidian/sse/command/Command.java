package cn.edu.xidian.sse.command;

/**
 * 
 * @author zhiyong wang
 * 为了增加灵活性增加一个Command类进行适当地抽象
 */
public abstract class Command {

	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	
	abstract public void execute();
}
