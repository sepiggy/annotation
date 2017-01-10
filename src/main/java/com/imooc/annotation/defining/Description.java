package com.imooc.annotation.defining;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface Description {

	String desc();
	
	String author();
	
	int age() default 18;

}
