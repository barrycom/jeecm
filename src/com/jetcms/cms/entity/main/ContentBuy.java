package com.jetcms.cms.entity.main;

import org.apache.commons.lang.StringUtils;

import com.jetcms.cms.entity.main.base.BaseContentBuy;



public class ContentBuy extends BaseContentBuy {
	private static final long serialVersionUID = 1L;
	
	public boolean getUserHasPaid(){
		if(StringUtils.isNotBlank(getOrderNumWeiXin())
				||StringUtils.isNotBlank(getOrderNumAliPay())){
			return true;
		}else{
			return false;
		}
	}

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ContentBuy () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ContentBuy (Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public ContentBuy (
		Long id,
		Content content,
		com.jetcms.core.entity.CmsUser buyUser,
		com.jetcms.core.entity.CmsUser authorUser,
		Double chargeAmount,
		Double authorAmount,
		Double platAmount,
		java.util.Date buyTime,
		boolean hasPaidAuthor) {

		super (
			id,
			content,
			buyUser,
			authorUser,
			chargeAmount,
			authorAmount,
			platAmount,
			buyTime,
			hasPaidAuthor);
	}

/*[CONSTRUCTOR MARKER END]*/


}