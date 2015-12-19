package cn.edu.xidian.sse.decorator;

/**
 * 
 * @author zhiyong wang
 * 建立要添加功能对象的接口，
 * 如果只有一个对象，像给人打扮，这个类就作为添加功能对象的具体实现类，不再是抽象类
 *
 */
public interface Component {
	
	public void operation();
}
