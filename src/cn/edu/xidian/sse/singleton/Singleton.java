package cn.edu.xidian.sse.singleton;

/**
 * 
 * @author zhiyong wang
 * ����������ʽ��˫�ؼ������
 *
 */
public class Singleton {

	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized (Singleton.class) {
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
}
