package com.jetcms.cms.entity.assist;

import com.jetcms.cms.entity.assist.base.BaseCmsAccountPay;



public class CmsAccountPay extends BaseCmsAccountPay {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsAccountPay () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsAccountPay (Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsAccountPay (
		Long id,
		com.jetcms.core.entity.CmsUser payUser,
		com.jetcms.core.entity.CmsUser drawUser,
		String drawNum,
		String payAccount,
		String drawAccount,
		java.util.Date payTime) {

		super (
			id,
			payUser,
			drawUser,
			drawNum,
			payAccount,
			drawAccount,
			payTime);
	}

/*[CONSTRUCTOR MARKER END]*/


}