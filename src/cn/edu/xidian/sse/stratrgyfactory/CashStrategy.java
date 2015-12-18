package cn.edu.xidian.sse.stratrgyfactory;

/**
 * 
 * @author zhiyong wang
 * 建立一个策略的一个抽象类，定义各种不同策略的方法接口
 *
 */
public abstract class CashStrategy {

	//定义了不同收银策略的方法接口
	public abstract double aceeptCash();
	
}
