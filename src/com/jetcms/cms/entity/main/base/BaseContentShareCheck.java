package com.jetcms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_content_share_check table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_content_share_check"
 */

public abstract class BaseContentShareCheck  implements Serializable {

	public static String REF = "ContentShareCheck";
	public static String PROP_CHECK_OPINION = "checkOpinion";
	public static String PROP_CHECK_STATUS = "checkStatus";
	public static String PROP_CHANNEL = "channel";
	public static String PROP_SHARE_VALID = "shareValid";
	public static String PROP_ID = "id";
	public static String PROP_CONTENT = "content";


	// constructors
	public BaseContentShareCheck () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseContentShareCheck (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentShareCheck (
		Integer id,
		com.jetcms.cms.entity.main.Content content,
		com.jetcms.cms.entity.main.Channel channel,
		Byte checkStatus,
		Boolean shareValid) {

		this.setId(id);
		this.setContent(content);
		this.setChannel(channel);
		this.setCheckStatus(checkStatus);
		this.setShareValid(shareValid);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private Byte checkStatus;
	private String checkOpinion;
	private Boolean shareValid;

	// many to one
	private com.jetcms.cms.entity.main.Content content;
	private com.jetcms.cms.entity.main.Channel channel;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="content_id"
     */
	public Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: check_status
	 */
	public Byte getCheckStatus () {
		return checkStatus;
	}

	/**
	 * Set the value related to the column: check_status
	 * @param checkStatus the check_status value
	 */
	public void setCheckStatus (Byte checkStatus) {
		this.checkStatus = checkStatus;
	}


	/**
	 * Return the value associated with the column: check_opinion
	 */
	public String getCheckOpinion () {
		return checkOpinion;
	}

	/**
	 * Set the value related to the column: check_opinion
	 * @param checkOpinion the check_opinion value
	 */
	public void setCheckOpinion (String checkOpinion) {
		this.checkOpinion = checkOpinion;
	}


	/**
	 * Return the value associated with the column: share_valid
	 */
	public Boolean getShareValid () {
		return shareValid;
	}

	/**
	 * Set the value related to the column: share_valid
	 * @param shareValid the share_valid value
	 */
	public void setShareValid (Boolean shareValid) {
		this.shareValid = shareValid;
	}


	/**
	 * Return the value associated with the column: content_id
	 */
	public com.jetcms.cms.entity.main.Content getContent () {
		return content;
	}

	/**
	 * Set the value related to the column: content_id
	 * @param content the content_id value
	 */
	public void setContent (com.jetcms.cms.entity.main.Content content) {
		this.content = content;
	}


	/**
	 * Return the value associated with the column: channel_id
	 */
	public com.jetcms.cms.entity.main.Channel getChannel () {
		return channel;
	}

	/**
	 * Set the value related to the column: channel_id
	 * @param channel the channel_id value
	 */
	public void setChannel (com.jetcms.cms.entity.main.Channel channel) {
		this.channel = channel;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jetcms.cms.entity.main.ContentShareCheck)) return false;
		else {
			com.jetcms.cms.entity.main.ContentShareCheck contentShareCheck = (com.jetcms.cms.entity.main.ContentShareCheck) obj;
			if (null == this.getId() || null == contentShareCheck.getId()) return false;
			else return (this.getChannel().equals(contentShareCheck.getChannel())&&this.getContent().equals(contentShareCheck.getContent()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}