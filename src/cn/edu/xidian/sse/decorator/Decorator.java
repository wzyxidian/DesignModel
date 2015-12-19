package cn.edu.xidian.sse.decorator;

/**
 * 
 * @author zhiyong wang
 * ����װ�εĳ����࣬�̳���Component��
 * ���������ӹ��ܵĳ�����
 *
 */
public abstract class Decorator implements Component{
	protected Component component;
	
	public void setComponent(Component component){
		this.component = component;
	}

	@Override
	public void operation() {
		if(component != null){
			//���þ������Ĳ���
			component.operation();
		}
	}
	
}
