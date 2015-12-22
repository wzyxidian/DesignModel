package cn.edu.xidian.sse.template;

/**
 * 
 * @author zhiyong wang
 * 定义客户端方式，只有定义在抽象类中的模板方法对客户端是已知的
 * 样例是：老师在黑板上留作业，学生们负责抄写，并计算结果，客户端相当于老师，给出学生的所有成绩
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
