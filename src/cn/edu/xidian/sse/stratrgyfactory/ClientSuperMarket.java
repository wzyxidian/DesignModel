package cn.edu.xidian.sse.stratrgyfactory;

public class ClientSuperMarket {
	public static double result = 0.0;
	
	public static void main(String[] args) {
		Context ct = new Context("¥Ú∞À’€");
		result = ct.getResult();
	}
}
