package cn.edu.xidian.sse.singleton;

/**
 * 
 * @author zhiyong wang
 * �ͻ���
 *
 */
public class Client {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		
		if(singleton == singleton1){
			System.out.println("the same");
		}else{
			System.out.println("different");
		}
			
	}
}
