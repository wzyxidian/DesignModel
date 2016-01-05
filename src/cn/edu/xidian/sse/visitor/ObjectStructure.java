package cn.edu.xidian.sse.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zhiyong wang
 * ��ö������Ԫ�أ������ṩһ���߲�Ľӿ�����������߷�������Ԫ��
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
