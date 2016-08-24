package org.rohit.helloworld.entities;

import javax.persistence.Entity;

@Entity
public class SaveHelloEntity {

	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
