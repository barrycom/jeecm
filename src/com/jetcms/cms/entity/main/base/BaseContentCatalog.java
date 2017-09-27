package com.jetcms.cms.entity.main.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_content table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_content"
 */

public abstract class BaseContentCatalog  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String REF = "ContentCatalog";
	public static String PROP_PATH = "path";
	public static String PROP_FILENAME = "filename";
	public static String PROP_NAME = "name";
	public static String PROP_COUNT = "count";


	// constructors
	public BaseContentCatalog () {
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentCatalog (
			Integer id,
		String path,
		String name,
		String lectureDate,
		 Integer priority,
		 Integer viewCount,
		 String courseCategory,
		 String startTime,
		 String endTime,String livepath,String livepass,String pathpass) {
		this.setId(id);
		this.setPath(path);
		this.setName(name);
		this.setLectureDate(lectureDate);
		this.setPriority(priority);
		this.setViewCount(viewCount);
		this.setCourseCategory(courseCategory);
		this.setStartTime(startTime) ;
		this.setEndTime(endTime);
		this.setLivepath(livepath);
		this.setLivepass(livepass);
		this.setPathpass(pathpass); 
		initialize();
	}
	
	public BaseContentCatalog (
			Integer id,Integer contentId,
		String path,
		String name,
		String lectureDate,
		 Integer priority,
		 Integer viewCount,
		 String courseCategory,
		 String startTime,
		 String endTime,String livepath,String livepass,String pathpass) {
		this.setId(id);
		this.setContentId(contentId);
		this.setPath(path);
		this.setName(name);
		this.setLectureDate(lectureDate);
		this.setPriority(priority);
		this.setViewCount(viewCount);
		this.setCourseCategory(courseCategory);
		this.setStartTime(startTime) ;
		this.setEndTime(endTime);
		this.setLivepath(livepath);
		this.setLivepass(livepass);
		this.setPathpass(pathpass); 
		initialize();
	}

	protected void initialize () {}


	private Integer id;
	// fields
	private String path;
	private String pathpass;
	private String livepass;
	private String livepath;
	private String name;
	private String lectureDate;
	private Integer priority;
	private Integer viewCount;
	private Integer haveCount;
	private String courseCategory;
	private String startTime;
	private String endTime;
	private Integer showType;//1:录播，2：直播，3：未开始
	private Integer shownum;
	private Integer contentId;
	// one to one
	private com.jetcms.cms.entity.main.Content content;
	
	
	
	public String getPathpass() {
		return pathpass;
	}

	public void setPathpass(String pathpass) {
		this.pathpass = pathpass;
	}

	public String getLivepass() {
		return livepass;
	}

	public void setLivepass(String livepass) {
		this.livepass = livepass;
	}

	public com.jetcms.cms.entity.main.Content getContent() {
		return content;
	}

	public void setContent(com.jetcms.cms.entity.main.Content content) {
		this.content = content;
	}

	public Integer getShownum() {
		return shownum;
	}

	public void setShownum(Integer shownum) {
		this.shownum = shownum;
	}

	public Integer getShowType() {
		return showType;
	}

	public void setShowType(Integer showType) {
		this.showType = showType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Return the value associated with the column: attachment_path
	 */
	public String getPath () {
		return path;
	}

	/**
	 * Set the value related to the column: attachment_path
	 * @param path the attachment_path value
	 */
	public void setPath (String path) {
		this.path = path;
	}


	/**
	 * Return the value associated with the column: attachment_name
	 */
	public String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: attachment_name
	 * @param name the attachment_name value
	 */
	public void setName (String name) {
		this.name = name;
	}

 





	public String getLectureDate() {
		return lectureDate;
	}

	public void setLectureDate(String lectureDate) {
		this.lectureDate = lectureDate;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String toString () {
		return super.toString();
	}

	public Integer getHaveCount() {
		return haveCount;
	}

	public void setHaveCount(Integer haveCount) {
		this.haveCount = haveCount;
	}

	public String getLivepath() {
		return livepath;
	}

	public void setLivepath(String livepath) {
		this.livepath = livepath;
	}

	public Integer getContentId() {
		return contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}


}