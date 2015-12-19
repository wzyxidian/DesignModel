package cn.edu.xidian.sse.factorymethod;

/**
 * 
 * @author zhiyong wang
 * 大学生的子工厂类
 *
 */
public class UndergraduateFactory extends IFactory{

	@Override
	public LeiFeng createOperation() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}
	

}
