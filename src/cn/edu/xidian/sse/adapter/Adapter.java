package cn.edu.xidian.sse.adapter;

/**
 * 
 * @author zhiyong wang
 * ��������,����Ҫ�������Ľӿ�ת����Ŀ��ӿ�
 *
 */
public class Adapter extends Target{

	Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		adaptee.specialRequest();
	}

}
