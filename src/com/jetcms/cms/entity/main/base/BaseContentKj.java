package com.jetcms.cms.entity.main.base;

import java.io.Serializable;

import com.jetcms.cms.entity.main.ContentKj;


/**
 * This is an object that contains data related to the jc_content table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_content"
 */

public abstract class BaseContentKj  implements Serializable {

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
	public BaseContentKj () {
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseContentKj (
			Integer id,
			String path,
			String pathPass,
			String name,
		    Integer priority
		 ) { 
		this.setId(id);
		this.setPath(path);
		this.setPathPass(pathPass);
		this.setName(name); 
		this.setPriority(priority); 
		initialize();
	}

	protected void initialize () {}


	private Integer id;
	// fields
	private String path;
	private String pathPass;
	private String name;
	private Integer priority;
	private Integer contentId;
	// one to one
	private com.jetcms.cms.entity.main.Content content;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getContentId() {
		return contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}

	public com.jetcms.cms.entity.main.Content getContent() {
		return content;
	}

	public void setContent(com.jetcms.cms.entity.main.Content content) {
		this.content = content;
	} 
	
	@Override  
	public boolean equals(Object obj) {  
		ContentKj s=(ContentKj)obj;   
	return name.equals(s.getName()) && path.equals(s.getPath());   
	}  
	@Override  
	public int hashCode() {  
	String in = path + name;  
	return in.hashCode();  
	}

	public String getPathPass() {
		return pathPass;
	}

	public void setPathPass(String pathPass) {
		this.pathPass = pathPass;
	}  
	
}