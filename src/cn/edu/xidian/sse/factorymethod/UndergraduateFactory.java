package cn.edu.xidian.sse.factorymethod;

/**
 * 
 * @author zhiyong wang
 * ��ѧ�����ӹ�����
 *
 */
public class UndergraduateFactory extends IFactory{

	@Override
	public LeiFeng createOperation() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}
	

}
