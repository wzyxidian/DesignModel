package cn.edu.xidian.sse.visitor;

/**
 * 
 * @author zhiyong wang
 * 为该对象结构中ConcreteElement的每一个类声明一个visit操作
 *
 */
public abstract class Visitor {

	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
