package cn.edu.xidian.sse.composite;

/**
 * 
 * @author zhiyong wang
 * Leaf ������б�ʾҶ�ӽ�����Ҷ�ӽ��û���ӽ�㡣
 *
 */
public class Leaf extends Component{

	public Leaf(String name){
		super(name);
	}
	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
	}

}
