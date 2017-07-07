package com.ls.spring.spring_core;

public class WSClient {
	
	private String url;
	private String userName;
	private String passWord;
	public WSClient(String url, String userName, String passWord) {
		
		this.url = url;
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "WSClient [url=" + url + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	

}
