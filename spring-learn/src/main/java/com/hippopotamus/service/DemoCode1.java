package com.hippopotamus.service;


import org.springframework.stereotype.Component;

@Component
public class DemoCode1 {

	public DemoCode1(){
		System.out.println("DemoCode1无参构造方法");
	}

	public void print(){
		System.out.println("测试DemoCode2");
	}
}
