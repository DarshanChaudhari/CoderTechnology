/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package com.jp.insurance.entities;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Role.
 * 
 * @author Administrator
 */
public class Role {
	/**
	 * Description of the property roleId.
	 */
	private Integer roleId = Integer.valueOf(0);

	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property description.
	 */
	private String description = "";

	// Start of user code (user defined attributes for Role)

	// End of user code

	/**
	 * The constructor.
	 */
	public Role() {
		// Start of user code constructor for Role)
		super();
		// End of user code
	}

	/**
	 * Description of the method getRoleId.
	 * @return 
	 */
	public Integer getRoleId() {
		// Start of user code for method getRoleId
		Integer getRoleId = Integer.valueOf(0);
		return getRoleId;
		// End of user code
	}

	/**
	 * Description of the method setRoleId.
	 * @param roleId 
	 */
	public void setRoleId(Integer roleId) {
		// Start of user code for method setRoleId
		// End of user code
	}

	/**
	 * Description of the method getName.
	 * @return 
	 */
	public String getName() {
		// Start of user code for method getName
		String getName = "";
		return getName;
		// End of user code
	}

	/**
	 * Description of the method setName.
	 * @param name 
	 */
	public void setName(String name) {
		// Start of user code for method setName
		// End of user code
	}

	/**
	 * Description of the method getDescription.
	 * @return 
	 */
	public String getDescription() {
		// Start of user code for method getDescription
		String getDescription = "";
		return getDescription;
		// End of user code
	}

	/**
	 * Description of the method setDescription.
	 * @param description 
	 */
	public void setDescription(String description) {
		// Start of user code for method setDescription
		// End of user code
	}

	/**
	 * Description of the method toString.
	 * @return 
	 */
	public String toString() {
		// Start of user code for method toString
		String toString = "";
		return toString;
		// End of user code
	}

	// Start of user code (user defined methods for Role)

	// End of user code
	/**
	 * Returns roleId.
	 * @return roleId 
	 */
	public Integer getRoleId() {
		return this.roleId;
	}

	/**
	 * Sets a value to attribute roleId. 
	 * @param newRoleId 
	 */
	public void setRoleId(Integer newRoleId) {
		if (this.roleId != null) {
			this.roleId.set(null);
		}
		this.roleId.set(this);
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(String newName) {
		if (this.name != null) {
			this.name.set(null);
		}
		this.name.set(this);
	}

	/**
	 * Returns description.
	 * @return description 
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets a value to attribute description. 
	 * @param newDescription 
	 */
	public void setDescription(String newDescription) {
		if (this.description != null) {
			this.description.set(null);
		}
		this.description.set(this);
	}

}
