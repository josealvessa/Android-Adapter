package com.android.models;

public class Mail {

	private String message;
	private String subject;
	private String destination;
	private String time;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public Mail(String message, String subject, String destination, String time) {
		super();
		this.message = message;
		this.subject = subject;
		this.destination = destination;
		this.time = time;
	}
	
	
	
	
	
}
