package cn.edu.xidian.sse.abstractfactory;

/**
 * 
 * @author zhiyong wang
 * 面向用户初始化入口
 *
 */
public class DataAccess{

	private static String db = ConfigUtils.getInstance().getDatabase();
	private static String packages = ConfigUtils.getInstance().getPackages();
	
	public static IUser createUser(){
		String className = packages + db + "User";
		try {
			return (IUser) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static IDepartment createDepartment(){
		String className = packages + db + "Department";
		System.out.println(className);
		try {
			return (IDepartment) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
