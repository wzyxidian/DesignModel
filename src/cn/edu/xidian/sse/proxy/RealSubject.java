package cn.edu.xidian.sse.proxy;

/**
 * 
 * @author zhiyong wang
 * ������ʵ����
 *
 */
public class RealSubject extends Subject{

	@Override
	public void request() {
		System.out.println("��ʵ������ɵ�����");
	}

	
}
