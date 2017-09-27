package com.jetcms.core.entity;

import com.jetcms.core.entity.base.BaseCmsUserAccount;



public class CmsUserAccount extends BaseCmsUserAccount {
	private static final long serialVersionUID = 1L;
	
	public static final byte DRAW_WEIXIN=0;
	
	public static final byte DRAW_ALIPY=1;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsUserAccount () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsUserAccount (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsUserAccount (
		Integer id,
		Double contentYearAmount,
		Double contentMonthAmount,
		Double contentDayAmount,
		java.util.Date lastPaidTime) {

		super (
			id,
			contentYearAmount,
			contentMonthAmount,
			contentDayAmount,
			lastPaidTime);
	}

/*[CONSTRUCTOR MARKER END]*/


}