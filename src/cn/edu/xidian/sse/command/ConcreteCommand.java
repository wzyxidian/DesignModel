package cn.edu.xidian.sse.command;

/**
 * 
 * @author zhiyong wang
 * �������������࣬ʵ���˶Ծ���ִ�й��̵ķ�װ
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
