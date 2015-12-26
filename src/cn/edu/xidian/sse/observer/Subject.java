package cn.edu.xidian.sse.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zhiyong wang
 * ����ĳ����࣬������֪ͨ�ŵĳ�����
 *
 */
public abstract class Subject {

	List<Observer> observers = new ArrayList<Observer>();
	//���ӹ۲���
	public void attach(Observer observer){
		observers.add(observer);
	}
	//�Ƴ��۲���
	public void detach(Observer observer){
		observers.remove(observer);
	}
	//֪ͨ
	public void notifys(){
		for(Observer observer:observers){
			observer.update();
		}
	}
}
