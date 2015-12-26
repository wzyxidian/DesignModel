package cn.edu.xidian.sse.abstractfactory;

/**
 * 
 * @author zhiyong wang
 * Access数据库对User表的具体操作，继承了IUser
 *
 */
public class AccessUser extends IUser{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Access User insert");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Access User delete");
	}

}
