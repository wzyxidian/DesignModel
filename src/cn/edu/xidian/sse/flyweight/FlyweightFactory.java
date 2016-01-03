package cn.edu.xidian.sse.flyweight;

import java.util.Hashtable;

/**
 * 
 * @author zhiyong wang
 * ��Ԫ���̣���������������Flyweight������Ҫ������ȷ������ع���Flyweight��
 * ���û�����һ��Flyweightʱ��FlyweightFactory�����ṩһ���Ѿ�������ʵ�����ߴ���һ������������ڵĻ���
 *
 */
public class FlyweightFactory {

	private Hashtable flyweight = new Hashtable();
	
	public Flyweight getFlyweight(String key){
		if(!flyweight.contains(key)){
			flyweight.put(key, new ConcreteFlyweight());
		}
		return (Flyweight) flyweight.get(key);
	}
	
}
