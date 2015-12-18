package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * @author zhiyong wang
 * 构建父类，操作类，定义字段与属性，（字段是私有的，属性时共有的）
 * 编写用于多态的公共方法
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