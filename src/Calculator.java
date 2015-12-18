import java.util.Scanner;

import cn.edu.xidian.sse.simplefactory.ClientOperate;

/**
 * 
 * @author zhiyong wang
 * �򵥹���ģʽ��
 * ���ӣ�������
 * ��Ŀ������C++��Java��C#��VB.NET����һ�������������ʵ��һ������������̨����Ҫ��������������������ţ��õ������
 *
 */
public class Calculator {
	public double operate(String operate, double numberA, double numberB){
		Operation oper = OperationFactory.createOperation(operate);
		oper.setNumberA(numberA);
		oper.setNumberB(numberB);
		return oper.getResult();		
	}

	public static void main(String[] args) {
		Calculator co = new Calculator();
		co.operate("+", 1.2, 2.9);
	}
}

/**
 * 
 * @author zhiyong wang
 * �������࣬�����࣬�����ֶ������ԣ����ֶ���˽�еģ�����ʱ���еģ�
 * ��д���ڶ�̬�Ĺ�������
 */
abstract class Operation{
	private double numberA;
	private double numberB;
	
	public double getNumberA(){
		 return this.numberA;
	}
	
	public void setNumberA(double numberA){
		this.numberA = numberA;
	}
	
	public double getNumberB(){
		return this.numberB;
	}
	
	public void setNumberB(double numberB){
		this.numberB = numberB;
	}
	
	public double getResult(){
		double result = 0.0;
		return result;
	}
}

/**
 * 
 * @author zhiyong wang
 * �����Ǽ̳��˸���ļӡ������ˡ��� �ĸ�����ʵ���࣬
 * ʵ���˼̳У���̬�ķ�����ͬʱ��������װ�����������
 *
 */
class OperationAdd extends Operation{
	public double getResutl(){
		double result = 0.0;
		result = getNumberA() + getNumberB();
		return result;
	}
}

class OperationSub extends Operation{
	public double getResutl(){
		double result = 0.0;
		result = getNumberA() - getNumberB();
		return result;
	}
}

class OperationMul extends Operation{
	public double getResutl(){
		double result = 0.0;
		result = getNumberA() * getNumberB();
		return result;
	}
}

class OperationDiv extends Operation{
	public double getResutl(){
		double result = 0.0;
		if(getNumberB() != 0)
			result = getNumberA() / getNumberB();
		return result;
	}
}

class OperationFactory{
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