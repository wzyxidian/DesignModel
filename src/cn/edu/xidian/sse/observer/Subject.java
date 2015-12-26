package cn.edu.xidian.sse.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zhiyong wang
 * 主题的抽象类，或者是通知着的抽象类
 *
 */
public abstract class Subject {

	List<Observer> observers = new ArrayList<Observer>();
	//增加观察者
	public void attach(Observer observer){
		observers.add(observer);
	}
	//移除观察者
	public void detach(Observer observer){
		observers.remove(observer);
	}
	//通知
	public void notifys(){
		for(Observer observer:observers){
			observer.update();
		}
	}
}
