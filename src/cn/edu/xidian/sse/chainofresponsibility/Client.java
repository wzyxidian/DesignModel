package cn.edu.xidian.sse.chainofresponsibility;

/**
 * 
 * @author zhiyong wang
 * 客户端
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteHandler1 c1 = new ConcreteHandler1("部门经理");
		ConcreteHandler2 c2 = new ConcreteHandler2("总经理");
		ConcreteHandler3 c3 = new ConcreteHandler3("ECO");
		
		c1.setSuccessor(c2);
		c2.setSuccessor(c3);
		
		c1.handleRequest(0);
	}
}
