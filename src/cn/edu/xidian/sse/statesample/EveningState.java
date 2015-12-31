package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * ���Ϲ�������ʵ��
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
				System.out.println(context.getHour() + "���Ӱ��۰�");
			}else{
				System.out.println(context.getHour() + ":����21�㣬�Զ�����˯��״̬");
				context.setState(new SleepingState());
				context.writeProgram();
			}
		}
	}

}
