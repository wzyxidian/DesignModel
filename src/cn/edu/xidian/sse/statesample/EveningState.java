package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * 晚上工作具体实例
 *
 */
public class EveningState extends State{

	@Override
	public void writeProgram(Context context) {
		if(context.isFinish()){
			context.setState(new RestState());
			context.writeProgram();
		}else{
			if(context.getHour() < 21){
				System.out.println(context.getHour() + "：加班累啊");
			}else{
				System.out.println(context.getHour() + ":超过21点，自动进入睡眠状态");
				context.setState(new SleepingState());
				context.writeProgram();
			}
		}
	}

}
