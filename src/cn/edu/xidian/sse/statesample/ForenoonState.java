package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * ����ľ��幤��״̬
 *
 */
public class ForenoonState extends State{

	@Override
	public void writeProgram(Context context) {
		if(context.getHour() < 12){
			System.out.println(context.getHour() + ": ���繤�������񱶰�");
		}else{
			context.setState(new NoonState());
			context.writeProgram();
		}
		
	}

}
