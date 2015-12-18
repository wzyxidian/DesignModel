package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * 
 * @author zhiyong wang
 * 简单工厂模式：
 * 例子：计算器
 * 题目：请用C++、Java、C#或VB.NET任意一种面向对象语言实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果。
 *
 *
 * 客户端操作类，通过工厂创建出一个实际的实现类来执行具体的操作 ，
 * 如果只是切换四种操作，之用更改客户端就可以
 * 如果要增加一种操作，就要在新建这种操作的实现类，并在工厂中加以生产
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
