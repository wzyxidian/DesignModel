package cn.edu.xidian.sse.composite;

/**
 * 
 * @author zhiyong wang
 * 是组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理Component
 *
 */
public abstract class Component {

	protected String name;
	
	public Component(String name){
		this.name = name;
	}
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void display();
}
