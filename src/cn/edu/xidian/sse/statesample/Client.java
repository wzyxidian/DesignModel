package cn.edu.xidian.sse.statesample;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 *
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setHour(9.0);
		context.writeProgram();
		
		context.setHour(12.4);
		context.writeProgram();
		
		context.setHour(14.5);
		context.writeProgram();
		
		context.setFinish(true);
		context.setHour(20.0);
		context.writeProgram();
		
	}
}
