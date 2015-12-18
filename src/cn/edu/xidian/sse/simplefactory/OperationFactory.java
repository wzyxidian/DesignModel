package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * @author zhiyong wang
 * 定义工厂类，返回类型为抽象类，但是实际新建对象为子类实例
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
