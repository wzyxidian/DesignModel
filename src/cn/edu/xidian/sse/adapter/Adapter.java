package cn.edu.xidian.sse.adapter;

/**
 * 
 * @author zhiyong wang
 * 适配器类,将需要适配的类的接口转换成目标接口
 *
 */
public class Adapter extends Target{

	Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		adaptee.specialRequest();
	}

}
