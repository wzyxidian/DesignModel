package cn.edu.xidian.sse.decorator;

/**
 * 
 * @author zhiyong wang
 * 定义装饰的抽象类，继承了Component类
 * 这就是新添加功能的抽象类
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
			//调用具体对象的操作
			component.operation();
		}
	}
	
}
