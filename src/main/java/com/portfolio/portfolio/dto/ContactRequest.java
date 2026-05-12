package com.portfolio.portfolio.dto;

public class ContactRequest {
	
	private String name;
	private String email;
	private String subject;
	private String message ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public ContactRequest() {
		super();
	}
	public ContactRequest(String name, String email, String subject, String message) {
		super();
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactRequest [name=" + name + ", email=" + email + ", subject=" + subject + ", message=" + message
				+ "]";
	}
	
	
}
