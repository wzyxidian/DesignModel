package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * @author zhiyong wang
 * �̳��˸���ĳ�����ʵ���࣬
 * ʵ���˼̳У���̬�ķ�����ͬʱ��������װ�����������
 *
 */
public class OperationMul extends Operation{
	public double getResutl(){
		double result = 0.0;
		result = getNumberA() * getNumberB();
		return result;
	}
}