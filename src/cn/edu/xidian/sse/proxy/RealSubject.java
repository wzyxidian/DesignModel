package cn.edu.xidian.sse.proxy;

/**
 * 
 * @author zhiyong wang
 * 定义真实物体
 *
 */
public class RealSubject extends Subject{

	@Override
	public void request() {
		System.out.println("真实物体想干的事情");
	}

	
}
