package cn.edu.xidian.sse.builder;

/**
 * 
 * @author zhiyong wang
 * ����Ĺ�����
 *
 */
public class ConcreteBuilderA extends Builder{

	private Product product = new Product();
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("����A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("����B");
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		System.out.println("A�����ɹ�");
		return product;
	}

	
}
