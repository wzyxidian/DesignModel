package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * 
 * @author zhiyong wang
 * �򵥹���ģʽ��
 * ���ӣ�������
 * ��Ŀ������C++��Java��C#��VB.NET����һ�������������ʵ��һ������������̨����Ҫ��������������������ţ��õ������
 *
 *
 * �ͻ��˲����࣬ͨ������������һ��ʵ�ʵ�ʵ������ִ�о���Ĳ��� ��
 * ���ֻ���л����ֲ�����֮�ø��Ŀͻ��˾Ϳ���
 * ���Ҫ����һ�ֲ�������Ҫ���½����ֲ�����ʵ���࣬���ڹ����м�������
 *
 */
public class ClientOperate {
	
	public double operate(String operate, double numberA, double numberB){
		Operation oper = OperationFactory.createOperation(operate);
		oper.setNumberA(numberA);
		oper.setNumberB(numberB);
		return oper.getResult();		
	}

	public static void main(String[] args) {
		ClientOperate co = new ClientOperate();
		co.operate("+", 1.2, 2.9);
	}
}
