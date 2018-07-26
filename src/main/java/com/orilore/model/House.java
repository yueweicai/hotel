package com.orilore.model;
public class House{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private Kind kind;
	private Integer kid;
	private String hname;
	public void setHname(String hname){
		this.hname=hname;
	}
	public String getHname(){
		return this.hname;
	}

	private Integer size;
	public void setSize(Integer size){
		this.size=size;
	}
	public Integer getSize(){
		return this.size;
	}
	private Integer beds;
	public void setBeds(Integer beds){
		this.beds=beds;
	}
	public Integer getBeds(){
		return this.beds;
	}
	private Double price;
	public void setPrice(Double price){
		this.price=price;
	}
	public Double getPrice(){
		return this.price;
	}
	private Double dis;
	public void setDis(Double dis){
		this.dis=dis;
	}
	public Double getDis(){
		return this.dis;
	}
	private String info;
	public void setInfo(String info){
		this.info=info;
	}
	public String getInfo(){
		return this.info;
	}
	private String pica;
	public void setPica(String pica){
		this.pica=pica;
	}
	public String getPica(){
		return this.pica;
	}
	private String picb;
	public void setPicb(String picb){
		this.picb=picb;
	}
	public String getPicb(){
		return this.picb;
	}
	private String picc;
	public void setPicc(String picc){
		this.picc=picc;
	}
	public String getPicc(){
		return this.picc;
	}
	private String picd;
	public void setPicd(String picd){
		this.picd=picd;
	}
	public String getPicd(){
		return this.picd;
	}
	private String pice;
	public void setPice(String pice){
		this.pice=pice;
	}
	public String getPice(){
		return this.pice;
	}
	private String picf;
	public void setPicf(String picf){
		this.picf=picf;
	}
	public String getPicf(){
		return this.picf;
	}
	private Integer status;
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

	public Integer getKid() {
		return kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}
}