package cn.edu.xidian.sse.factorymethod;

/**
 * 
 * @author zhiyong wang
 * 志愿者的子工厂类
 *
 */
public class VolunteerFactory extends IFactory{

	@Override
	public LeiFeng createOperation() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}
	

}
