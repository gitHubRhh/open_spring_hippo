package com.hippopotamus.dao;

import org.springframework.stereotype.Component;

@Component
public class QueryDao {

	public  QueryDao(){
		System.out.println("校验");
	}

	public void query(){
		System.out.println("HIPPOPOTAMUS LEARN SPRING");
	}
}
