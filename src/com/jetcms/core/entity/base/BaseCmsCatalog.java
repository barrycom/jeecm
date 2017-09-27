package com.jetcms.core.entity.base;

import java.io.Serializable;

import com.jetcms.core.entity.CmsUser;


/**
 * This is an object that contains data related to the jc_role table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class 
 */

public abstract class BaseCmsCatalog  implements Serializable {

	public static String REF = "CmsCatalog";  
	public static String PROP_PRIORITY = "priority"; 
	public static String PROP_ID = "id";


	// constructors
	public BaseCmsCatalog () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsCatalog (Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsCatalog (
		Integer id,
		Integer catalogId,
		Integer viewnum,
		Integer priority ) {
		this.setId(id);
		this.setViewnum(viewnum);
		this.setCatalogId(catalogId); 
		this.setPriority(priority); 
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private Integer id;

	// fields 
	private Integer catalogId;
	private Integer viewnum;
	private Integer priority;
	
	 
	private CmsUser user ;


	public Integer getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="role_id"
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
 
 

	public Integer getViewnum() {
		return viewnum;
	}

	public void setViewnum(Integer viewnum) {
		this.viewnum = viewnum;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

 

	public CmsUser getUser() {
		return user;
	}

	public void setUser(CmsUser user) {
		this.user = user;
	}

	public String toString () {
		return super.toString();
	}


}