package cn.edu.xidian.sse.mediator;

/**
 * 
 * @author zhiyong wang
 * 同事的抽象类
 *
 */
public abstract class Colleague {

	protected Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
