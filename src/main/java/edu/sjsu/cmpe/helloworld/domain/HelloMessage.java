package edu.sjsu.cmpe.helloworld.domain;

import java.util.Date;

public class HelloMessage {
	private String message = "Hello World !! Web Hooks has now been confiigured !!";
	private Date timestamp = new Date();

	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String msg) {
		message = msg;
	}

}
