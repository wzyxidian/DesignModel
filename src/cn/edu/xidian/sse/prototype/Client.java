package cn.edu.xidian.sse.prototype;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 * 
 */
public class Client {

	public static void main(String[] args) {
		ConcretePrototype concretePrototype = new ConcretePrototype();
		for(int i=0;i<3;i++){
			ConcretePrototype clonecp = (ConcretePrototype) concretePrototype.clone();
			clonecp.show();
		}
	}
}
