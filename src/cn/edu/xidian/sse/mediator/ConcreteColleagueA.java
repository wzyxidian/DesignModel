package cn.edu.xidian.sse.mediator;

/**
 * 
 * @author zhiyong wang 
 * 同事A
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
		System.out.println("同事A得到的消息是:" + message);
	}
	
}
