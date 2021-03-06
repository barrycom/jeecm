package com.jetcms.cms.entity.assist;

import com.jetcms.cms.entity.assist.base.BaseCmsWebserviceAuth;



public class CmsWebserviceAuth extends BaseCmsWebserviceAuth {
	private static final long serialVersionUID = 1L;


	public boolean getEnable() {
		return super.isEnable();
	}

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsWebserviceAuth () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsWebserviceAuth (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsWebserviceAuth (
		Integer id,
		String username,
		String password,
		String system,
		boolean enable) {

		super (
			id,
			username,
			password,
			system,
			enable);
	}

/*[CONSTRUCTOR MARKER END]*/


}