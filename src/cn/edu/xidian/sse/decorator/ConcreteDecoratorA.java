package cn.edu.xidian.sse.decorator;

/**
 * 
 * @author zhiyong wang
 * 新增加的具体功能
 *
 */
public class ConcreteDecoratorA extends Decorator{

	@Override
	public void operation() {
		//首先运行员Component的operation()操作，然后执行自己特有的功能
		super.operation();
		System.out.println("A特有的功能");
	}

	
}
