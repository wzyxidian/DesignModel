package cn.edu.xidian.sse.observer;

/**
 * 
 * @author zhiyong wang
 * �ͻ���
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver1("xiaowang",s);
		Observer observer = new ConcreteObserver("xiaoli");
		s.attach(observer);
		s.attach(observer1);
		s.setSubjectState("�ϰ�����");
		s.notifys();
	}
	
	
	
}
