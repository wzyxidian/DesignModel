package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * @author zhiyong wang
 * �������࣬�����࣬�����ֶ������ԣ����ֶ���˽�еģ�����ʱ���еģ�
 * ��д���ڶ�̬�Ĺ�������
 */
public abstract class Operation{
	private double numberA;
	private double numberB;
	
	public double getNumberA(){
		 return this.numberA;
	}
	
	public void setNumberA(double numberA){
		this.numberA = numberA;
	}
	
	public double getNumberB(){
		return this.numberB;
	}
	
	public void setNumberB(double numberB){
		this.numberB = numberB;
	}
	
	public double getResult(){
		double result = 0.0;
		return result;
	}
}