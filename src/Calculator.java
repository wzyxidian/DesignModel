import java.util.Scanner;

import cn.edu.xidian.sse.simplefactory.ClientOperate;

/**
 * 
 * @author zhiyong wang
 * 简单工厂模式：
 * 例子：计算器
 * 题目：请用C++、Java、C#或VB.NET任意一种面向对象语言实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果。
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
 * 构建父类，操作类，定义字段与属性，（字段是私有的，属性时共有的）
 * 编写用于多态的公共方法
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
 * 以下是继承了父类的加、减、乘、除 四个子类实现类，
 * 实现了继承，多态的方法，同时将操作封装到具体的类中
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