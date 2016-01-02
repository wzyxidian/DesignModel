package cn.edu.xidian.sse.adapter;

/**
 * 
 * @author zhiyong wang
 * ¿Í»§¶Ë
 *
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
