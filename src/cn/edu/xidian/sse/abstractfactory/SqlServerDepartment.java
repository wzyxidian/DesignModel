package cn.edu.xidian.sse.abstractfactory;

/**
 * 
 * @author zhiyong wang
 * SqlServer ��Department��ľ���������̳���IDepartment��
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
