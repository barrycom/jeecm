package com.jetcms.cms.entity.assist;

import com.jetcms.cms.entity.assist.base.BaseCmsScoreRecord;



public class CmsScoreRecord extends BaseCmsScoreRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsScoreRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsScoreRecord (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsScoreRecord (
		Integer id,
		CmsScoreItem item,
		com.jetcms.cms.entity.main.Content content,
		Integer count) {

		super (
			id,
			item,
			content,
			count);
	}

/*[CONSTRUCTOR MARKER END]*/


}