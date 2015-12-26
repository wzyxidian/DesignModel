package cn.edu.xidian.sse.observer;

/**
 * 
 * @author zhiyong wang 
 * ����Ĺ۲��ߣ������� ĳ����˾Ա��
 *
 */
public class ConcreteObserver1 extends Observer{

	private String name;
	private ConcreteSubject concreteSubject;
	
	public ConcreteObserver1(String name, Subject concreteSubject){
		this.name = name;
		this.concreteSubject = (ConcreteSubject) concreteSubject;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(name + "��Ҫ���Ʊ��"+ concreteSubject.getSubjectState());
	}

}