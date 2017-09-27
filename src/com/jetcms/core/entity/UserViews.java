package com.jetcms.core.entity;
 
import com.jetcms.core.entity.base.BaseUserViews;

public class UserViews extends BaseUserViews {
	private static final long serialVersionUID = 1L;

	public void init() {
		if (getCount() == null) {
			setCount(1);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public UserViews () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public UserViews (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public UserViews (
		Integer id,
		Integer count) {

		super (
			id, 
			count);
	}

	/* [CONSTRUCTOR MARKER END] */

}