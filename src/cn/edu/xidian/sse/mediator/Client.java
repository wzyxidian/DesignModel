package cn.edu.xidian.sse.mediator;

/**
 * 
 * @author zhiyong wang
 * 客户端
 * 客户调用中介者对象的方法，然后中介者进行判断，然后调用另外一个客户的方法，这样实现了两个对象之间的通信
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
		ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
		
		mediator.setConcreteColleagueA(colleagueA);
		mediator.setConcreteColleagueB(colleagueB);
		
		colleagueA.send("你吃饭了吗");
		colleagueB.send("没有呢，等你呢");
	}
}
