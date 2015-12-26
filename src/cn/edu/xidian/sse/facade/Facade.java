package cn.edu.xidian.sse.facade;

/**
 * 
 * @author zhiyong wang
 * ���������
 *
 */
public class Facade {

	private SubSystemOne so;
	private SubSystemTwo st;
	private SubSystemThree sth;
	private SubSystemFour sf;
	
	public Facade(){
		so = new SubSystemOne();
		st = new SubSystemTwo();
		sth = new SubSystemThree();
		sf = new SubSystemFour();
	}
	public void methodA(){
		so.methodOne();
		st.methodTwo();	
	}
	public void methodB(){
		sth.methodThree();
		so.methodOne();
		sf.methodFour();
	}
}
