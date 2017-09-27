package com.jetcms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_content_doc table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_content_doc"
 */

public abstract class BaseContentDoc  implements Serializable {

	public static String REF = "ContentDoc";
	public static String PROP_FILE_SUFFIX = "fileSuffix";
	public static String PROP_IS_OPEN = "isOpen";
	public static String PROP_AVG_SCORE = "avgScore";
	public static String PROP_DOWN_NEED = "downNeed";
	public static String PROP_GRAIN = "grain";
	public static String PROP_ID = "id";
	public static String PROP_CONTENT = "content";
	public static String PROP_SWF_PATH = "swfPath";
	public static String PROP_PATH = "path";


	// constructors
	public BaseContentDoc () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseContentDoc (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentDoc (
		Integer id,
		String path,
		Integer grain,
		Integer downNeed,
		Boolean isOpen,
		String fileSuffix,
		Float avgScore) {

		this.setId(id);
		this.setDocPath(path);
		this.setGrain(grain);
		this.setDownNeed(downNeed);
		this.setIsOpen(isOpen);
		this.setFileSuffix(fileSuffix);
		this.setAvgScore(avgScore);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields
	private String docPath;
	private String swfPath;
	private String pdfPath;
	private Integer grain;
	private Integer downNeed;
	private Boolean isOpen;
	private String fileSuffix;
	private Float avgScore;
	private Integer swfNum;

	// one to one
	private com.jetcms.cms.entity.main.Content content;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="foreign"
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
	 * Return the value associated with the column: path
	 */
	public String getDocPath () {
		return docPath;
	}

	/**
	 * Set the value related to the column: path
	 * @param path the path value
	 */
	public void setDocPath (String docPath) {
		this.docPath = docPath;
	}


	/**
	 * Return the value associated with the column: swf_path
	 */
	public String getSwfPath () {
		return swfPath;
	}

	/**
	 * Set the value related to the column: swf_path
	 * @param swfPath the swf_path value
	 */
	public void setSwfPath (String swfPath) {
		this.swfPath = swfPath;
	}

	public String getPdfPath() {
		return pdfPath;
	}

	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}

	/**
	 * Return the value associated with the column: grain
	 */
	public Integer getGrain () {
		return grain;
	}

	/**
	 * Set the value related to the column: grain
	 * @param grain the grain value
	 */
	public void setGrain (Integer grain) {
		this.grain = grain;
	}


	/**
	 * Return the value associated with the column: down_need
	 */
	public Integer getDownNeed () {
		return downNeed;
	}

	/**
	 * Set the value related to the column: down_need
	 * @param downNeed the down_need value
	 */
	public void setDownNeed (Integer downNeed) {
		this.downNeed = downNeed;
	}


	/**
	 * Return the value associated with the column: is_open
	 */
	public Boolean getIsOpen () {
		return isOpen;
	}

	/**
	 * Set the value related to the column: is_open
	 * @param isOpen the is_open value
	 */
	public void setIsOpen (Boolean isOpen) {
		this.isOpen = isOpen;
	}


	/**
	 * Return the value associated with the column: file_suffix
	 */
	public String getFileSuffix () {
		return fileSuffix;
	}

	/**
	 * Set the value related to the column: file_suffix
	 * @param fileSuffix the file_suffix value
	 */
	public void setFileSuffix (String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}


	/**
	 * Return the value associated with the column: avg_score
	 */
	public Float getAvgScore () {
		return avgScore;
	}

	/**
	 * Set the value related to the column: avg_score
	 * @param avgScore the avg_score value
	 */
	public void setAvgScore (Float avgScore) {
		this.avgScore = avgScore;
	}
	
	public Integer getSwfNum() {
		return swfNum;
	}

	public void setSwfNum(Integer swfNum) {
		this.swfNum = swfNum;
	}

	/**
	 * Return the value associated with the column: content
	 */
	public com.jetcms.cms.entity.main.Content getContent () {
		return content;
	}

	/**
	 * Set the value related to the column: content
	 * @param content the content value
	 */
	public void setContent (com.jetcms.cms.entity.main.Content content) {
		this.content = content;
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jetcms.cms.entity.main.ContentDoc)) return false;
		else {
			com.jetcms.cms.entity.main.ContentDoc contentDoc = (com.jetcms.cms.entity.main.ContentDoc) obj;
			if (null == this.getId() || null == contentDoc.getId()) return false;
			else return (this.getId().equals(contentDoc.getId()));
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