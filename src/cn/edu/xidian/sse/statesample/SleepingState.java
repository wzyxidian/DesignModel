package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * ˯��״̬����ʵ��
 *
 */
public class SleepingState extends State{

	@Override
	public void writeProgram(Context context) {
		System.out.println(context.getHour() + "��������ˣ��Ѿ�����ס�ˣ�˯��");
	}

}
