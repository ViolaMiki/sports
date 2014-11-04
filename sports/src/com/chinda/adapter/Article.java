package com.chinda.adapter;

import java.io.Serializable;

public class Article implements Serializable{
	private static final long serialVersionUID = 1L;
	//ID
	private String ID;
	//title
	private String title;
	//<pubDate>Mon, 12 May 2014 07:43:00 +0000</pubDate>
	private String pubDate;
	//img
	private String picUrl;
	//description
	private String dec;
	//content:encoded
	private String data;
	//dc:creator
	private String creator;
	//slash:comments
	private String comments;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getDec() {
		return dec;
	}
	public void setDec(String dec) {
		this.dec = dec;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}