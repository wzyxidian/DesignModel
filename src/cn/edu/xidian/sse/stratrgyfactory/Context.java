package cn.edu.xidian.sse.stratrgyfactory;

/**
 * 
 * @author zhiyong wang
 * 定义Context，结合工厂模式，在这里进行分类调用具体的算法
 *
 */
public class Context {
	
	private CashStrategy cashStrategy = null;
	
	public Context(String type){
		switch(type){
		case "正常收费":
			cashStrategy = new CashNomal();
			break;
		case "打八折":
			cashStrategy = new CashRebate();
			break;
		case "满300，减100":
			cashStrategy = new CashReturn();
			break;
		}
	}
	
	public double getResult(){
		return cashStrategy.aceeptCash();
	}
	
}
