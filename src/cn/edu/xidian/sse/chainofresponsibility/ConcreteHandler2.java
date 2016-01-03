package cn.edu.xidian.sse.chainofresponsibility;

/**
 * 
 * @author zhiyong wang
 * 第二级处理者
 *
 */
public class ConcreteHandler2 extends Handler{

	public ConcreteHandler2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request <30){
			System.out.println(this.name + ":可以处理");
		}else{
			successor.handleRequest(request);
		}
	}

}
