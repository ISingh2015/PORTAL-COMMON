package com.inderjit.portal.exception;

public class RecordNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public RecordNotFoundException (String message) {
		super(message);
	}

	public RecordNotFoundException (String message, Throwable throwable) {
		super(message,throwable);
	}

}
