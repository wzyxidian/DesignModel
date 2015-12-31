package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * �������˿ͻ�������Ҫ�Ľӿڲ�ά��һ������״̬��ɫ��ʵ����
 * ����״̬��صĲ���ί�и���ǰ��Concrete State����������
 *
 */
public class Context {

	private Double hour;
	private State state;
	private boolean finish;
	
	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public double getHour() {
		return hour;
	}
	
	public void setHour(Double hour) {
		this.hour = hour;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public Context(){
		this.state = new ForenoonState();
	}
	
	public void writeProgram(){
		this.state.writeProgram(this);
	}
}
