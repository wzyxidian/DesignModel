package cn.edu.xidian.sse.builder;

/**
 * 
 * @author zhiyong wang
 * ��Ϊ����һ��Product����ĸ�������ָ���ĳ���ӿ�
 *
 */
public abstract class Builder {
	
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getProduct();
}
