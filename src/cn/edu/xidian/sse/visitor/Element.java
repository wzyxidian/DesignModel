package cn.edu.xidian.sse.visitor;

/**
 * 
 * @author zhiyong wang
 * ����һ��accept����������һ��������VisitorΪ����
 *
 */
public abstract class Element {
	public abstract void accept(Visitor visitor);
}
