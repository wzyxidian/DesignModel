package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * 睡眠状态具体实例
 *
 */
public class SleepingState extends State{

	@Override
	public void writeProgram(Context context) {
		System.out.println(context.getHour() + "：这个点了，已经扛不住了，睡觉");
	}

}
