package cn.edu.xidian.sse.abstractfactory;

/**
 * 
 * @author zhiyong wang
 * SqlServer��User��ľ������
 *
 */
public class SqlServerUser extends IUser{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("SqlServer User insert");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("SqlServer User delete");
	}

}
