package cn.edu.xidian.sse.command;

/**
 * 
 * @author zhiyong wang
 * 消息的发起者
 *
 */
public class Invoker {

	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void execute(){
		command.execute();
	}
}
