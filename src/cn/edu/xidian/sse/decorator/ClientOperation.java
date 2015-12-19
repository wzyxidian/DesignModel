package cn.edu.xidian.sse.decorator;

/**
 * 
 * @author zhiyong wang
 * �ͻ��˲�������,����ʵ�����������ʮ���䣬���·����ף�Java I/O���е�Ӧ��
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
