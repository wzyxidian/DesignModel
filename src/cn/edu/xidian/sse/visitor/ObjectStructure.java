package cn.edu.xidian.sse.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zhiyong wang
 * 能枚举他的元素，可以提供一个高层的接口以允许访问者访问它的元素
 *
 */
public class ObjectStructure {
	List<Element> list = new ArrayList<Element>();
	
	public void attach(Element element){
		list.add(element);
	}
	
	public void detach(Element element){
		list.remove(element);
	}
	
	public void accept(Visitor visitor){
		for(int i=0;i<list.size();i++){
			list.get(i).accept(visitor);
		}
	}
}
