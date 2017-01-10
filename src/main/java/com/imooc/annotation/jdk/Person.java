package com.imooc.annotation.jdk;

public interface Person {
	
	public String name();
	
	public int age();
	
	// 在方法上标注中划线，表示这个方法已经过时了。
	@Deprecated
	public void sing();
}
