package cn.edu.xidian.sse.chainofresponsibility;

/**
 * 
 * @author zhiyong wang
 *	����һ����������Ľӿ�
 */
public abstract class Handler {

	protected Handler successor;
	protected String name;
	
	public Handler(String name){
		this.name = name;
	}
	
	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	
	public abstract void handleRequest(int request);
}
