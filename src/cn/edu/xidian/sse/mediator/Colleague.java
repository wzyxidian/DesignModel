package cn.edu.xidian.sse.mediator;

/**
 * 
 * @author zhiyong wang
 * ͬ�µĳ�����
 *
 */
public abstract class Colleague {

	protected Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
