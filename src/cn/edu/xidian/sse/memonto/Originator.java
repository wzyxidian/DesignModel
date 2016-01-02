package cn.edu.xidian.sse.memonto;

/**
 * 
 * @author zhiyong wang
 * ���𴴽�һ������¼Memento�����Լ�¼��ǰʱ�������ڲ�״̬������ʹ�ñ���¼�ָ��ڲ�״̬��
 * Originator�ɸ�����Ҫ����Memento�洢Originator����Щ�ڲ�״̬��
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
		System.out.println("original ��״̬" + state);
	}
}
