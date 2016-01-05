package cn.edu.xidian.sse.visitor;

/**
 * 
 * @author zhiyong wang
 * 具体访问者，实现每个由Visitor声明的操作。每个操作实现算法的一部分，而该算法片段乃是对应于结构中对象的类
 *
 */
public class ConcreteVisitor1 extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println("concreteElementA ConcreteVisitor1");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println("concreteElementB ConcreteVisitor1");
	}

}
