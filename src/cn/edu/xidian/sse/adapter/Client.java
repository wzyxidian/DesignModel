package cn.edu.xidian.sse.adapter;

/**
 * 
 * @author zhiyong wang
 * �ͻ���
 *
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
