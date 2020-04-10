package com.example.springdatarest;

public class TestPojo {

	private String singer;
	private String title;
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "TestPojo [singer=" + singer + ", title=" + title + "]";
	}
	
	
	
}
