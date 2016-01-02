package cn.edu.xidian.sse.composite;

/**
 * 
 * @author zhiyong wang
 * ������еĶ��������ӿڣ����ʵ�������£�ʵ�������๲�нӿڵ�Ĭ����Ϊ������һ���ӿ����ڷ��ʺ͹���Component
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
