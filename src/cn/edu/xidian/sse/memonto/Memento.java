package cn.edu.xidian.sse.memonto;

/**
 * 
 * @author zhiyong  wang
 * ����洢Originnator������ڲ�״̬�����ɷ�ֹOriginator���������������ʱ���¼Memento��
 * ����¼�������ӿڣ�Caretakerֻ�ܿ�������¼��խ�ӿڣ���ֻ�ܽ�����¼���ݸ���������
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
