package com.jetcms.cms.entity.main;

import com.jetcms.cms.entity.main.base.BaseContentShareCheck;



public class ContentShareCheck extends BaseContentShareCheck {
	private static final long serialVersionUID = 1L;
	/**
	 * 待审核
	 */
	public static final byte CHECKING = 0;
	/**
	 * 审核通过
	 */
	public static final byte CHECKED = 1;
	/**
	 * 推送
	 */
	public static final byte PUSHED = 2;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ContentShareCheck () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ContentShareCheck (Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ContentShareCheck (
		Integer id,
		Content content,
		Channel channel,
		Byte checkStatus,
		Boolean shareValid) {

		super (
			id,
			content,
			channel,
			checkStatus,
			shareValid);
	}
	public void init() {
		byte status=0;
		if(getCheckStatus()==null){
			setCheckStatus(status);
		}
		if(getShareValid()==null){
			setShareValid(true);
		}
	}

/*[CONSTRUCTOR MARKER END]*/


}