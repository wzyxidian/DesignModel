package cn.edu.xidian.sse.bridge;

/**
 * 
 * @author zhiyong wang
 * ≥ÈœÛ¿‡
 *
 */
public abstract class Abstract {

	protected Implementor implementor;

	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void operation(){
		implementor.operation();
	}
	
}
