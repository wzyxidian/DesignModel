package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * �°���Ϣ״̬����ʵ��
 *
 */
public class RestState extends State{

	@Override
	public void writeProgram(Context context) {
		System.out.println(context.getHour() + ":������ɣ����°���Ϣ");
	}

}
