package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * ���繤������ʵ��
 *
 */
public class AfternoonState extends State{

	@Override
	public void writeProgram(Context context) {
		if(context.getHour() < 17){
			System.out.println(context.getHour() + ":����״̬����������Ŭ��");
		}else{
			context.setState(new EveningState());
			context.writeProgram();
		}
		
	}

}
