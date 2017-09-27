package com.jetcms.core.entity;

import com.jetcms.core.entity.base.BaseCmsWorkflowRecord;



public class CmsWorkflowRecord extends BaseCmsWorkflowRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsWorkflowRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsWorkflowRecord (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsWorkflowRecord (
		Integer id,
		CmsSite site,
		CmsWorkflowEvent event,
		CmsUser user,
		java.util.Date recordTime,
		Integer type) {

		super (
			id,
			site,
			event,
			user,
			recordTime,
			type);
	}

/*[CONSTRUCTOR MARKER END]*/


}