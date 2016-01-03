package cn.edu.xidian.sse.chainofresponsibility;

/**
 * 
 * @author zhiyong wang
 * 第一级处理者
 *
 */
public class ConcreteHandler1 extends Handler{

	public ConcreteHandler1(String name) {
		super(name);
	}

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request < 10){
			System.out.println(this.name + "：可以处理");
		}else{
			successor.handleRequest(request);
		}
	}

}
