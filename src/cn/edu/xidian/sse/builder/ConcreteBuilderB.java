package cn.edu.xidian.sse.builder;

/**
 * 
 * @author zhiyong wang
 * ����Ĺ�����
 *
 */
public class ConcreteBuilderB extends Builder{

	private Product product = new Product();
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("����X");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("����Y");
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		System.out.println("B�����ɹ�");
		return product;
	}

	
}
