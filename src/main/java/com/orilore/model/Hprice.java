package com.orilore.model;
public class Hprice{
	
	private Integer id;
	private Integer kid;
	private String sdate;
	private String edate;
	private Double price;
	private Double dis;
	private Integer status;
	private Kind kind;
	
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	
	public void setKid(Integer kid){
		this.kid=kid;
	}
	public Integer getKid(){
		return this.kid;
	}
	
	public void setSdate(String sdate){
		this.sdate=sdate;
	}
	public String getSdate(){
		return this.sdate;
	}
	
	public void setEdate(String edate){
		this.edate=edate;
	}
	public String getEdate(){
		return this.edate;
	}
	
	public void setPrice(Double price){
		this.price=price;
	}
	public Double getPrice(){
		return this.price;
	}
	
	public void setDis(Double dis){
		this.dis=dis;
	}
	public Double getDis(){
		return this.dis;
	}
	
	public void setStatus(Integer status){
		this.status=status;
	}
	public Integer getStatus(){
		return this.status;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
}