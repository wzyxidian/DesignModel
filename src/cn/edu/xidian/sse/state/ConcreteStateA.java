package cn.edu.xidian.sse.state;

public class ConcreteStateA extends State{

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateB());
	}

}
