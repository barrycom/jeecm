package com.jetcms.core.entity;

import com.jetcms.core.entity.base.BaseCmsUserResume;



public class CmsUserResume extends BaseCmsUserResume {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsUserResume () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsUserResume (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsUserResume (
		Integer id,
		String resumeName) {

		super (
			id,
			resumeName);
	}

/*[CONSTRUCTOR MARKER END]*/


}