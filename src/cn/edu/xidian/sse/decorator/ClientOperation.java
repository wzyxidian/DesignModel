package cn.edu.xidian.sse.decorator;

/**
 * 
 * @author zhiyong wang
 * 客户端测试样例,具体实例有孙悟空七十二变，穿衣服相亲，Java I/O库中的应用
 *
 */
public class ClientOperation {
	public static void main(String[] args) {
		ConcreteComponent cc = new ConcreteComponent();
		ConcreteDecoratorA cda = new ConcreteDecoratorA();
		ConcreteDecoratorB cdb = new ConcreteDecoratorB();
		
		cda.setComponent(cc);
		cdb.setComponent(cda);
		cdb.operation();
	}
}
