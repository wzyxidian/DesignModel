package cn.edu.xidian.sse.chainofresponsibility;

/**
 * 
 * @author zhiyong wang
 * �ڶ���������
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
			System.out.println(this.name + ":���Դ���");
		}else{
			successor.handleRequest(request);
		}
	}

}
