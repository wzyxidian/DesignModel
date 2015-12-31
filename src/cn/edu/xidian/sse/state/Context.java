package cn.edu.xidian.sse.state;

public class Context {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println(this.state);
	}
	
	public Context(State state){
		this.state = state;
	}
	
	public void request(){
		state.handle(this);
	}
}
