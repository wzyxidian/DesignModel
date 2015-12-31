package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * 下午工作具体实例
 *
 */
public class AfternoonState extends State{

	@Override
	public void writeProgram(Context context) {
		if(context.getHour() < 17){
			System.out.println(context.getHour() + ":下午状态还不错，继续努力");
		}else{
			context.setState(new EveningState());
			context.writeProgram();
		}
		
	}

}
