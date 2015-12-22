package cn.edu.xidian.sse.template;

/**
 * 
 * @author zhiyong wang
 * 定义模板的抽象类，定义一个模板方法，具体实现
 * 定义细节的抽象方法，让子类去实现
 *
 */
public abstract class AbstractClass {

	public abstract void operation1();
	public abstract void operation2();
	
	public void templateMethod(){
		operation1();
		operation2();
	}
}
