package cn.edu.xidian.sse.composite;

/**
 * 
 * @author zhiyong wang
 * Leaf 在组合中表示叶子结点对象，叶子结点没有子结点。
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
