package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * @author zhiyong wang
 * �̳��˸���ļ�����ʵ���࣬
 * ʵ���˼̳У���̬�ķ�����ͬʱ��������װ�����������
 *
 */
public class OperationAdd extends Operation{
	public double getResutl(){
		double result = 0.0;
		result = getNumberA() + getNumberB();
		return result;
	}
}
