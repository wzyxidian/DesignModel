package cn.edu.xidian.sse.memonto;

/**
 * 
 * @author zhiyong wang
 * 负责保存好备忘录Memento，不能对备忘录的内容进行操作或检查
 *
 */
public class CareTaker {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
