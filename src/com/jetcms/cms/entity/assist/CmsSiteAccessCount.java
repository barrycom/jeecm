package com.jetcms.cms.entity.assist;

import com.jetcms.cms.entity.assist.base.BaseCmsSiteAccessCount;



public class CmsSiteAccessCount extends BaseCmsSiteAccessCount {
	private static final long serialVersionUID = 1L;
	

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsSiteAccessCount () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsSiteAccessCount (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsSiteAccessCount (
		Integer id,
		com.jetcms.core.entity.CmsSite site,
		Integer pageCount,
		Integer visitors,
		java.util.Date statisticDate) {

		super (
			id,
			site,
			pageCount,
			visitors,
			statisticDate);
	}

/*[CONSTRUCTOR MARKER END]*/


}