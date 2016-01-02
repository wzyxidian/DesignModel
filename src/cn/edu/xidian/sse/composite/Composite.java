package cn.edu.xidian.sse.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zhiyong wang
 * 定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关操作，如增加(add)和删除
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
