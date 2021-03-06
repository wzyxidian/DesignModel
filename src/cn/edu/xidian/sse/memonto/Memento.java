package cn.edu.xidian.sse.memonto;

/**
 * 
 * @author zhiyong  wang
 * 负责存储Originnator对象的内部状态，并可防止Originator以外的其他对象访问备忘录Memento，
 * 备忘录有两个接口，Caretaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象
 *
 */
public class Memento {

	private String state;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento(String state){
		this.state = state;
	}
}
