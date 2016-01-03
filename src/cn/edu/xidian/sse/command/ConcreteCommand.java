package cn.edu.xidian.sse.command;

/**
 * 
 * @author zhiyong wang
 * 具体的命令调用类，实现了对具体执行过程的封装
 *
 */
public class ConcreteCommand extends Command{

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.execute();
	}

}
