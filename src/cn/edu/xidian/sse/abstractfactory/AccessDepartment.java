package cn.edu.xidian.sse.abstractfactory;

/**
 * 
 * @author zhiyong wang
 * Access数据库对Department表的具体操作，继承了IDepartment
 *
 */
public class AccessDepartment extends IDepartment{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("Access Department Insert");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Access Department delete");
	}

	
}
