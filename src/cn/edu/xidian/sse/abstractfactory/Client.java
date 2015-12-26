package cn.edu.xidian.sse.abstractfactory;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 *
 */
public class Client {

	public static void main(String[] args) {
		IDepartment iDepartment = DataAccess.createDepartment();
		iDepartment.delete();
		iDepartment.insert();
		
		IUser iUser = DataAccess.createUser();
		iUser.delete();
		iUser.insert();
	}
}
