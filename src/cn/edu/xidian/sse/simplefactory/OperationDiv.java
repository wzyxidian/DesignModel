package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * @author zhiyong wang
 * �̳��˸���ĳ�����ʵ���࣬
 * ʵ���˼̳У���̬�ķ�����ͬʱ��������װ�����������
 *
 */
public class OperationDiv extends Operation{
	public double getResutl(){
		double result = 0.0;
		if(getNumberB() != 0)
			result = getNumberA() / getNumberB();
		return result;
	}
}
