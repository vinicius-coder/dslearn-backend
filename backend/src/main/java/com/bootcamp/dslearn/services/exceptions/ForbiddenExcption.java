package com.bootcamp.dslearn.services.exceptions;

public class ForbiddenExcption extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ForbiddenExcption(String msg) {
		super(msg);
	}
	
}
