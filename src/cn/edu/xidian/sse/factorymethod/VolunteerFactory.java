package cn.edu.xidian.sse.factorymethod;

/**
 * 
 * @author zhiyong wang
 * ־Ը�ߵ��ӹ�����
 *
 */
public class VolunteerFactory extends IFactory{

	@Override
	public LeiFeng createOperation() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}
	

}
