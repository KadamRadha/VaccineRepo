package com.vaccination.demo.controller;

@Data
public class Response<T>{
	public static Object ERROR;
	private T data;
	private String status="SUCCESS";

}
