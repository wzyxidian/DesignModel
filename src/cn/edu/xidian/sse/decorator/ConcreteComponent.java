package cn.edu.xidian.sse.decorator;

import java.io.Console;

/**
 * 
 * @author zhiyong wang
 * 定义具体的对象，新添加的功能就是给他添加的
 *
 */
public class ConcreteComponent implements Component{

	@Override
	public void operation() {
		System.out.println("具体对象自己拥有的操作");
	}

}
