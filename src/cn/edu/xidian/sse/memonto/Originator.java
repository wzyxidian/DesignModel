package cn.edu.xidian.sse.memonto;

/**
 * 
 * @author zhiyong wang
 * 负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。
 * Originator可根据需要决定Memento存储Originator的哪些内部状态。
 *
 */
public class Originator {

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private String state;
	
	public Memento createMemento(){
		return new Memento(state);
	}
	
	public void recoverState(Memento memento){
		this.state = memento.getState();
	}
	
	public void showState(){
		System.out.println("original 的状态" + state);
	}
}
