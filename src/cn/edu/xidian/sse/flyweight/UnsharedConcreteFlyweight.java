package cn.edu.xidian.sse.flyweight;

/**
 * 
 * @author zhiyong wang
 * 那些不需要共享的Flyweight子类，因为Flyweight接口共享成为可能，但他并不强制共享
 *
 */
public class UnsharedConcreteFlyweight extends Flyweight{

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("不共享的具体Flyweight");
	}

	
}
