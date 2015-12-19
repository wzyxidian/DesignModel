package cn.edu.xidian.sse.factorymethod;

/**
 * 
 * @author zhiyong wang
 * �ͻ���
 *
 */
public class ClientOperation {

	public static void main(String[] args) {
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createOperation();
		student.buyRice();
		student.sweep();
		student.wash();
	}
}
