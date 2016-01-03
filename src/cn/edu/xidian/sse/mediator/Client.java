package cn.edu.xidian.sse.mediator;

/**
 * 
 * @author zhiyong wang
 * �ͻ���
 * �ͻ������н��߶���ķ�����Ȼ���н��߽����жϣ�Ȼ���������һ���ͻ��ķ���������ʵ������������֮���ͨ��
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
		ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
		
		mediator.setConcreteColleagueA(colleagueA);
		mediator.setConcreteColleagueB(colleagueB);
		
		colleagueA.send("��Է�����");
		colleagueB.send("û���أ�������");
	}
}
