package cn.edu.xidian.sse.visitor;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 *
 */
public class Client {

	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.attach(new ConcreteElementA());
		objectStructure.attach(new ConcreteElementB());
		
		ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
		objectStructure.accept(concreteVisitor1);
		
		ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();
		objectStructure.accept(concreteVisitor2);
	}
}
