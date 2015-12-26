package cn.edu.xidian.sse.builder;

/**
 * 
 * @author zhiyong wang
 * 是为创建一个Product对象的各个部件指定的抽象接口
 *
 */
public abstract class Builder {
	
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract Product getProduct();
}
