package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * ���繤������ʵ��
 *
 */
public class NoonState extends State{

	@Override
	public void writeProgram(Context context) {
		if(context.getHour() < 13){
			System.out.println(context.getHour() + ":���ˣ��緹����������Ϣ");
		}else{
			context.setState(new AfternoonState());
			context.writeProgram();
		}
	}

}
