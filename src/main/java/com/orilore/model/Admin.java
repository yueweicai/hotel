package com.orilore.model;
public class Admin{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String username;
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return this.username;
	}
	private String password;
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}
}