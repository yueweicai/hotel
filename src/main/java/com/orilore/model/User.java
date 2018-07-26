package com.orilore.model;
public class User{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String phone;
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return this.phone;
	}
	private String password;
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}
	private String nick;
	public void setNick(String nick){
		this.nick=nick;
	}
	public String getNick(){
		return this.nick;
	}
	private Integer gender;
	public void setGender(Integer gender){
		this.gender=gender;
	}
	public Integer getGender(){
		return this.gender;
	}
	private String province;
	public void setProvince(String province){
		this.province=province;
	}
	public String getProvince(){
		return this.province;
	}
	private String city;
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return this.city;
	}
}