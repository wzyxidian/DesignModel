package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * 定义一个接口以封装使用上下文环境的的一个特定状态相关的行为。
 */
public abstract class State {

	public abstract void writeProgram(Context context);
}
