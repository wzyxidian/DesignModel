package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * 它定义了客户程序需要的接口并维护一个具体状态角色的实例，
 * 将与状态相关的操作委托给当前的Concrete State对象来处理。
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
