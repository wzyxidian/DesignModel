package cn.edu.xidian.sse.builder;

/**
 * 
 * @author zhiyong wang
 * ָ������
 *
 */
public class Director {
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
