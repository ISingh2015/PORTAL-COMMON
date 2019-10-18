package com.inderjit.portal.common;

import java.io.Serializable;

public class ResponseMetaData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Pagination pagination;

	/**
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return pagination;
	}

	/**
	 * @param pagination the pagination to set
	 */
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

}
