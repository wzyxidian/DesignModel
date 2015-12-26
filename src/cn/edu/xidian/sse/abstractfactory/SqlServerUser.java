package cn.edu.xidian.sse.abstractfactory;

/**
 * 
 * @author zhiyong wang
 * SqlServer对User表的具体操作
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
