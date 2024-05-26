package com.hostmdy.di.datasource;

public class FakeDataSource {
	
	private final String username;
	private final String password;
	private final String url;
	private final String engine;
	
	public FakeDataSource(String username, String password, String url, String engine) {
		super();
		this.username = username;
		this.password = password;
		this.url = url;
		this.engine = engine;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getUrl() {
		return url;
	}
	public String getEngine() {
		return engine;
	}
	
	
}
