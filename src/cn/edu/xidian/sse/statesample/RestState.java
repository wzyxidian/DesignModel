package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * 下班休息状态具体实例
 *
 */
public class RestState extends State{

	@Override
	public void writeProgram(Context context) {
		System.out.println(context.getHour() + ":工作完成，打卡下班休息");
	}

}
