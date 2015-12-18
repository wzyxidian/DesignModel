package cn.edu.xidian.sse.stratrgyfactory;

/**
 * 
 * @author zhiyong wang
 * ����Context����Ϲ���ģʽ����������з�����þ�����㷨
 *
 */
public class Context {
	
	private CashStrategy cashStrategy = null;
	
	public Context(String type){
		switch(type){
		case "�����շ�":
			cashStrategy = new CashNomal();
			break;
		case "�����":
			cashStrategy = new CashRebate();
			break;
		case "��300����100":
			cashStrategy = new CashReturn();
			break;
		}
	}
	
	public double getResult(){
		return cashStrategy.aceeptCash();
	}
	
}
