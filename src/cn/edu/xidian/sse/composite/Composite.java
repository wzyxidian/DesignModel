package cn.edu.xidian.sse.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zhiyong wang
 * ������֦�ڵ���Ϊ�������洢�Ӳ�������Component�ӿ���ʵ�����Ӳ����йز�����������(add)��ɾ��
 *
 */
public class Composite extends Component{

	List<Component> list = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		list.remove(component);
	}

	@Override
	public void display() {
		System.out.println(this.name);
		for(Component com:list){
			com.display();
		}
		
		
	}

}
