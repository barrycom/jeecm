package com.jetcms.cms.entity.assist;

import com.jetcms.cms.entity.assist.base.BaseCmsSiteAccessPages;



public class CmsSiteAccessPages extends BaseCmsSiteAccessPages {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsSiteAccessPages () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsSiteAccessPages (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsSiteAccessPages (
		Integer id,
		com.jetcms.core.entity.CmsSite site,
		String accessPage,
		String sessionId,
		java.util.Date accessTime,
		java.util.Date accessDate,
		Integer visitSecond,
		Integer pageIndex) {

		super (
			id,
			site,
			accessPage,
			sessionId,
			accessTime,
			accessDate,
			visitSecond,
			pageIndex);
	}

/*[CONSTRUCTOR MARKER END]*/


}