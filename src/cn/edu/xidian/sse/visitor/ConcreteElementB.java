package cn.edu.xidian.sse.visitor;

/**
 * 
 * @author zhiyong wang
 * ����Ԫ�أ�ʵ��accept����
 *
 */
public class ConcreteElementB extends Element{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementB(this);
	}

}
