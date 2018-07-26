package com.orilore.model;
public class Photo{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private Integer hid;
	public void setHid(Integer hid){
		this.hid=hid;
	}
	public Integer getHid(){
		return this.hid;
	}
	private String src;
	public void setSrc(String src){
		this.src=src;
	}
	public String getSrc(){
		return this.src;
	}
}