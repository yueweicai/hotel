package com.orilore.model;
import java.util.List;
public class Admin{
	private Integer id;
	private String username;
	private String password;
	private Integer status;
	private List<Power> powers;
	
	public void setId(Integer id){
		this.id=id;	}
	public Integer getId(){
		return this.id;
	}
	public void setUsername(String username){
		this.username=username;
	}	public String getUsername(){
		return this.username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List<Power> getPowers() {
		return powers;
	}
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
}