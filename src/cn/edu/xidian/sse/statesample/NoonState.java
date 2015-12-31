package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * 中午工作具体实例
 *
 */
public class NoonState extends State{

	@Override
	public void writeProgram(Context context) {
		if(context.getHour() < 13){
			System.out.println(context.getHour() + ":饿了，午饭；犯困，休息");
		}else{
			context.setState(new AfternoonState());
			context.writeProgram();
		}
	}

}
