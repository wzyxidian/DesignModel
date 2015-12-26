package cn.edu.xidian.sse.abstractfactory;

/**
 * 
 * @author zhiyong wang
 * SqlServer 对Department表的具体操作，继承了IDepartment表
 *
 */
public class SqlServerDepartment extends IDepartment{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("SqlServer Department insert");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("SqlServer Department delete");
	}

}
