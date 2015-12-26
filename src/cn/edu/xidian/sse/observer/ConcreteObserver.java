package cn.edu.xidian.sse.observer;

/**
 * 
 * @author zhiyong wang 
 * 具体的观察者，可以是 某个公司员工
 *
 */
public class ConcreteObserver extends Observer{

	private String name;
//	private ConcreteSubject concreteSubject;
	
	public ConcreteObserver(String name){
		this.name = name;
//		this.concreteSubject = (ConcreteSubject) concreteSubject;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(name + "不要看NBA了");
	}

}
