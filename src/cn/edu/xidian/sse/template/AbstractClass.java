package cn.edu.xidian.sse.template;

/**
 * 
 * @author zhiyong wang
 * ����ģ��ĳ����࣬����һ��ģ�巽��������ʵ��
 * ����ϸ�ڵĳ��󷽷���������ȥʵ��
 *
 */
public abstract class AbstractClass {

	public abstract void operation1();
	public abstract void operation2();
	
	public void templateMethod(){
		operation1();
		operation2();
	}
}
