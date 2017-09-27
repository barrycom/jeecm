package com.jetcms.cms.entity.main;

import com.jetcms.cms.entity.main.base.BaseChannelCatalog;

public class ChannelCatalog extends BaseChannelCatalog {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public ChannelCatalog () {
		super();
	}

	/**
	 * Constructor for required fields
	 */
	public ChannelCatalog (  
			String path,
			String name,
			String lectureDate,
			 Integer priority,
			 Integer viewCount,
			 String courseCategory,
			 String startTime,
			 String endTime,Integer isFixed) {
		super (path, name,  lectureDate, priority, viewCount, courseCategory, startTime, endTime,isFixed);
	}

	/* [CONSTRUCTOR MARKER END] */

}