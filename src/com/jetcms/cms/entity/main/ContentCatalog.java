package com.jetcms.cms.entity.main;

import com.jetcms.cms.entity.main.base.BaseContentCatalog;

public class ContentCatalog extends BaseContentCatalog {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public ContentCatalog () {
		super();
	}

	/**
	 * Constructor for required fields
	 */
	public ContentCatalog ( Integer id,String pathpass,String livepass,String livepath,
			String path,
			String name,
			String lectureDate,
			 Integer priority,
			 Integer viewCount,
			 String courseCategory,
			 String startTime,
			 String endTime ) {
		super (id,path, name,  lectureDate, priority, viewCount, courseCategory, startTime, endTime,livepath,livepass,pathpass);
	}

	public ContentCatalog ( Integer id,Integer contentId,String pathpass,String livepass,String livepath,
			String path,
			String name,
			String lectureDate,
			 Integer priority,
			 Integer viewCount,
			 String courseCategory,
			 String startTime,
			 String endTime ) {
		super (id,contentId,path, name,  lectureDate, priority, viewCount, courseCategory, startTime, endTime,livepath,livepass,pathpass);
	}
	/* [CONSTRUCTOR MARKER END] */

}