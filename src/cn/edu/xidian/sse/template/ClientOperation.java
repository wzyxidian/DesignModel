package cn.edu.xidian.sse.template;

/**
 * 
 * @author zhiyong wang
 * ����ͻ��˷�ʽ��ֻ�ж����ڳ������е�ģ�巽���Կͻ�������֪��
 * �����ǣ���ʦ�ںڰ�������ҵ��ѧ���Ǹ���д�������������ͻ����൱����ʦ������ѧ�������гɼ�
 *
 */
public class ClientOperation {

	public static void main(String[] args) {
		AbstractClass ac = new ConcreteClassA();
		ac.templateMethod();
		ac = new ConcreteClassB();
		ac.templateMethod();
	}
	
}
