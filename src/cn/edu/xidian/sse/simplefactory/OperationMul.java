package cn.edu.xidian.sse.simplefactory;

/**
 * 
 * @author zhiyong wang
 * 继承了父类的乘子类实现类，
 * 实现了继承，多态的方法，同时将操作封装到具体的类中
 *
 */
public class OperationMul extends Operation{
	public double getResutl(){
		double result = 0.0;
		result = getNumberA() * getNumberB();
		return result;
	}
}