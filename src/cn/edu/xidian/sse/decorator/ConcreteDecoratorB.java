package cn.edu.xidian.sse.decorator;

/**
 * 
 * @author zhiyong wang
 * �����ӵľ��幦��
 *
 */
public class ConcreteDecoratorB extends Decorator{

	@Override
	public void operation() {
		//��������ԱComponent��operation()������Ȼ��ִ���Լ����еĹ���
		super.operation();
		System.out.println("B���еĹ���");
	}

	
}