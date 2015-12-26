package cn.edu.xidian.sse.builder;

/**
 * 
 * @author zhiyong wang
 * 具体的构造者
 *
 */
public class ConcreteBuilderB extends Builder{

	private Product product = new Product();
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("部件X");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("部件Y");
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		System.out.println("B生产成功");
		return product;
	}

	
}
