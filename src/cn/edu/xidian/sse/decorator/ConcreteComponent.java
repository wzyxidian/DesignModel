package cn.edu.xidian.sse.decorator;

import java.io.Console;

/**
 * 
 * @author zhiyong wang
 * �������Ķ�������ӵĹ��ܾ��Ǹ�����ӵ�
 *
 */
public class ConcreteComponent implements Component{

	@Override
	public void operation() {
		System.out.println("��������Լ�ӵ�еĲ���");
	}

}
