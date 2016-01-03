package cn.edu.xidian.sse.flyweight;

/**
 * 
 * @author zhiyong wang
 * 继承Flyweight超类或者实现了Flyweight的接口，并为内部状态增加存储空间
 *
 */
public class ConcreteFlyweight extends Flyweight{

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("具体Flyweight");
	}

}
