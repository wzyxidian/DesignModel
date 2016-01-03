package cn.edu.xidian.sse.flyweight;

/**
 * 
 * @author zhiyong wang
 * �ͻ���
 *
 */
public class Client {

	
	public static void main(String[] args) {
		FlyweightFactory ff = new FlyweightFactory();
		Flyweight fx = ff.getFlyweight("X");
		Flyweight fy = ff.getFlyweight("Y");
		Flyweight fz = ff.getFlyweight("Z");
		
		fx.operation();
		fy.operation();
		fz.operation();
	}
}
