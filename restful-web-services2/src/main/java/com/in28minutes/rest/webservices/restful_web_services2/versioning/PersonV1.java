package com.in28minutes.rest.webservices.restful_web_services2.versioning;

public class PersonV1 {
	private String name;

	public PersonV1() {
		super();
	}
	
	public PersonV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}