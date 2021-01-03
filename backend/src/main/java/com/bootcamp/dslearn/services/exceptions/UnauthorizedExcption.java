package com.bootcamp.dslearn.services.exceptions;

public class UnauthorizedExcption extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UnauthorizedExcption(String msg) {
		super(msg);
	}
	
}
