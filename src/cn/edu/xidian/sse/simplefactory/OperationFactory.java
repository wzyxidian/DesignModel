package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * @author zhiyong wang
 * ���幤���࣬��������Ϊ�����࣬����ʵ���½�����Ϊ����ʵ��
 *
 */
public class OperationFactory{
	public static Operation createOperation(String operate){
		Operation oper = null;
		switch(operate){
		case "+":
			oper = new OperationAdd();			
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}
		return oper;
	}
}
