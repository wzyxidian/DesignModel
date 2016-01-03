package cn.edu.xidian.sse.command;

/**
 * 
 * @author zhiyong wang
 * Ϊ���������������һ��Command������ʵ��س���
 */
public abstract class Command {

	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	
	abstract public void execute();
}
