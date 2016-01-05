package cn.edu.xidian.sse.visitor;

/**
 * 
 * @author zhiyong wang
 * 定义一个accept操作，它以一个访问者Visitor为参数
 *
 */
public abstract class Element {
	public abstract void accept(Visitor visitor);
}
