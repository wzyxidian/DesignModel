package cn.edu.xidian.sse.prototype;

/**
 * 
 * @author zhiyong wang
 * 定义的原对象
 *
 */
public class Prototype implements Cloneable{

	public Prototype clone(){
		Prototype prototype = null;
		try{
			prototype = (Prototype) super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}
		return prototype;
	}
}
