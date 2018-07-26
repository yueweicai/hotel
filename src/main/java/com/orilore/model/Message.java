package com.orilore.model;
public class Message{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String kind;
	public void setKind(String kind){
		this.kind=kind;
	}
	public String getKind(){
		return this.kind;
	}
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	private String phone;
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return this.phone;
	}
	private String sdate;
	public void setSdate(String sdate){
		this.sdate=sdate;
	}
	public String getSdate(){
		return this.sdate;
	}
	private String content;
	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return this.content;
	}
}