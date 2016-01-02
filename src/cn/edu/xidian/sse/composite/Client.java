package cn.edu.xidian.sse.composite;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 *
 */
public class Client {

	public static void main(String[] args) {
		Composite composite1 = new Composite("root");
		composite1.add(new Leaf("leafA"));
		composite1.add(new Leaf("leafB"));
		
		Composite composite2 = new Composite("comA");
		composite2.add(new Leaf("LeafC"));
		composite2.add(new Leaf("LeafD"));
		
		composite1.add(composite2);
		
		composite1.display();
		
		
	}
}
