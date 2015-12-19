package cn.edu.xidian.sse.proxy;

/**
 * 
 * @author zhiyong wang
 * ����
 *
 */
public class Proxy extends Subject{
	
	private RealSubject realSubject;
	
	@Override
	public void request() {
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
