package cn.edu.xidian.sse.mediator;

/**
 * 
 * @author zhiyong wang
 * 具体中介者
 *
 */
public class ConcreteMediator extends Mediator {

	private ConcreteColleagueA concreteColleagueA;
	private ConcreteColleagueB concreteColleagueB;
	
	public ConcreteColleagueA getConcreteColleagueA() {
		return concreteColleagueA;
	}
	public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
		this.concreteColleagueA = concreteColleagueA;
	}
	public ConcreteColleagueB getConcreteColleagueB() {
		return concreteColleagueB;
	}
	public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
		this.concreteColleagueB = concreteColleagueB;
	}
	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		if(colleague == concreteColleagueA){
			concreteColleagueB.notifys(message);
		}else{
			concreteColleagueA.notifys(message);
		}
	}
	
	
}
