package cn.edu.xidian.sse.mediator;

/**
 * 
 * @author zhiyong wang 
 * ͬ��A
 *
 */
public class ConcreteColleagueA extends Colleague{

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void send(String message){
		mediator.send(message, this);
	}
	
	public void notifys(String message){
		System.out.println("ͬ��A�õ�����Ϣ��:" + message);
	}
	
}
