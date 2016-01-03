package cn.edu.xidian.sse.command;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 * 
 */
public class Client {

	public static void main(String[] args) {
		Receiver r = new Receiver();
		Command cc = new ConcreteCommand(r);
		
		Invoker i = new Invoker();
		i.setCommand(cc);
		i.execute();
		
	}
}
