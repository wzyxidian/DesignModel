package cn.edu.xidian.sse.memonto;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 *
 */
public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("3");
		originator.showState();
		
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(originator.createMemento());
		
		originator.setState("4");
		originator.showState();
		
		originator.recoverState(careTaker.getMemento());
		originator.showState();
	}
	
	
}
