package cn.edu.xidian.sse.facade;

/**
 * 
 * @author zhiyong wang
 * 客户端通过外观类访问子类
 *
 */
public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
	}
	
}
