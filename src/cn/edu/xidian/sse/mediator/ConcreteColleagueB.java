package cn.edu.xidian.sse.mediator;

/**
 * 
 * @author zhiyong wang 
 * ͬ��A
 *
 */
public class ConcreteColleagueB extends Colleague{

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void send(String message){
		mediator.send(message, this);
	}
	
	public void notifys(String message){
		System.out.println("ͬ��B�õ�����Ϣ��:" + message);
	}
	
}
