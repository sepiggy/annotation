package com.imooc.annotation.jdk;

public class DeprecatedTest {

	// 强制忽略警告注解
	@SuppressWarnings("deprecation")
	public void sing() {
		Person person = new Child();
		person.sing();
	}
}
