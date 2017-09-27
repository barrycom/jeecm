package com.jetcms.cms.entity.main;

import com.jetcms.cms.entity.main.base.BaseContentKj;

public class ContentKj extends BaseContentKj {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public ContentKj () {
		super();
	}

	/**
	 * Constructor for required fields
	 */
	public ContentKj ( Integer id,
			String path,
			String pathPass,
			String name,
			Integer priority
			 ) { 
		super (id,path,pathPass, name,priority);
	}

	/* [CONSTRUCTOR MARKER END] */

}