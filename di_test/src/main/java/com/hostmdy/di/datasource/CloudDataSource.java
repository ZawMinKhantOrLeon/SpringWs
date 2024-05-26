package com.hostmdy.di.datasource;

public final class CloudDataSource {
	
	private final String user;
	private final String key;
	private final String auth;
	private final String address;
	public CloudDataSource(String user, String key, String auth, String address) {
		super();
		this.user = user;
		this.key = key;
		this.auth = auth;
		this.address = address;
	}
	public String getUser() {
		return user;
	}
	public String getKey() {
		return key;
	}
	public String getAuth() {
		return auth;
	}
	public String getAddress() {
		return address;
	}
	
	
}
