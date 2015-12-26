package cn.edu.xidian.sse.observer;

/**
 * 
 * @author zhiyong wang 
 * 具体的观察者，可以是 某个公司员工
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
		System.out.println(name + "不要玩股票了"+ concreteSubject.getSubjectState());
	}

}
