package cn.edu.xidian.sse.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zhiyong wang
 * Product��������Ҫ���ɵĲ�Ʒ
 *
 */
public class Product {
	List<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		for(String part:parts){
			System.out.println("show everyPart: " + part);
		}
	}
}
