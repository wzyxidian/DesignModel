package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * 上午的具体工作状态
 *
 */
public class ForenoonState extends State{

	@Override
	public void writeProgram(Context context) {
		if(context.getHour() < 12){
			System.out.println(context.getHour() + ": 上午工作，精神倍棒");
		}else{
			context.setState(new NoonState());
			context.writeProgram();
		}
		
	}

}
