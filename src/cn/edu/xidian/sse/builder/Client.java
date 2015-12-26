package cn.edu.xidian.sse.builder;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 *
 */
public class Client {

	public static void main(String[] args) {
		Director d = new Director();
		
		ConcreteBuilderA ca = new ConcreteBuilderA();
		ConcreteBuilderB cb = new ConcreteBuilderB();
		
		d.construct(ca);
		d.construct(cb);
		
		ca.getProduct();
		cb.getProduct();
	}
}
