package cn.edu.xidian.sse.template;

/**
 * 
 * @author zhiyong wang
 * 具体实现抽象类中的细节抽象方法
 *
 */
public class ConcreteClassA extends AbstractClass{

	@Override
	public void operation1() {
		System.out.println("ConcreteClassA");	
	}

	@Override
	public void operation2() {
		System.out.println("ConcreteClassA+");
	}

}
