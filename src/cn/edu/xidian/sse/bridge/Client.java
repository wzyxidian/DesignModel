package cn.edu.xidian.sse.bridge;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 *
 */
public class Client {

	public static void main(String[] args) {
		Abstract abstraction = new RefinedAbstraction();
		abstraction.setImplementor(new ConcreteImplemetorA());
		abstraction.operation();
		
		abstraction.setImplementor(new ConcreteImplemetorB());
		abstraction.operation();
	}
}
