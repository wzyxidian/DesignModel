package cn.edu.xidian.sse.observer;

/**
 * 
 * @author zhiyong wang
 * ��������⣬����˵�����֪ͨ��Ա�����������飬�������ϰ壩
 *
 */
public class ConcreteSubject extends Subject{
	
	private String subjectState;
	
	public String getSubjectState(){
		return this.subjectState;
	}
	public void setSubjectState(String subjectState){
		this.subjectState = subjectState;
	}
}
