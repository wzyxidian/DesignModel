package cn.edu.xidian.sse.visitor;

/**
 * 
 * @author zhiyong wang
 * ��������ߣ�ʵ��ÿ����Visitor�����Ĳ�����ÿ������ʵ���㷨��һ���֣������㷨Ƭ�����Ƕ�Ӧ�ڽṹ�ж������
 *
 */
public class ConcreteVisitor2 extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println("concreteElementA ConcreteVisitor2");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println("concreteElementB ConcreteVisitor2");
	}

}
