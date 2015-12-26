package cn.edu.xidian.sse.observer;

/**
 * 
 * @author zhiyong wang
 * 具体的主题，或者说具体的通知人员（可以是秘书，可以是老板）
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
