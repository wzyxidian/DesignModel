package cn.edu.xidian.sse.flyweight;

import java.util.Hashtable;

/**
 * 
 * @author zhiyong wang
 * 享元工程，用来创建并管理Flyweight对象。主要是用来确保合理地共享Flyweight，
 * 当用户请求一个Flyweight时，FlyweightFactory对象提供一个已经创建的实例或者创建一个（如果不存在的话）
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
