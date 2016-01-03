package cn.edu.xidian.sse.chainofresponsibility;

/**
 * 
 * @author zhiyong wang
 * 最后一个处理者
 *
 */
public class ConcreteHandler3 extends Handler{

	public ConcreteHandler3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "可以处理");
	}

	
}
