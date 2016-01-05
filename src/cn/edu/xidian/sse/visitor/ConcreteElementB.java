package cn.edu.xidian.sse.visitor;

/**
 * 
 * @author zhiyong wang
 * 具体元素，实现accept操作
 *
 */
public class ConcreteElementB extends Element{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementB(this);
	}

}
