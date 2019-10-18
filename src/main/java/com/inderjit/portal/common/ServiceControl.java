package com.inderjit.portal.common;

import java.io.Serializable;

public class ServiceControl implements Serializable{
	
	public static final long serialVersionUID= 1l;
	
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
