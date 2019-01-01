/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package com.jp.insurance.entities;

import com.jp.insurance.entities.States;
import java.util.ArrayList;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Cities.
 * 
 * @author Administrator
 */
public class Cities {
	/**
	 * Description of the property id.
	 */
	private Integer id = Integer.valueOf(0);

	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property state.
	 */
	private States state = null;

	// Start of user code (user defined attributes for Cities)

	// End of user code

	/**
	 * The constructor.
	 */
	public Cities() {
		// Start of user code constructor for Cities)
		super();
		// End of user code
	}

	/**
	 * Description of the method getId.
	 * @return 
	 */
	public Integer getId() {
		// Start of user code for method getId
		Integer getId = Integer.valueOf(0);
		return getId;
		// End of user code
	}

	/**
	 * Description of the method setId.
	 * @param id 
	 */
	public void setId(Integer id) {
		// Start of user code for method setId
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
	 * Description of the method getState.
	 * @return 
	 */
	public States getState() {
		// Start of user code for method getState
		States getState = null;
		return getState;
		// End of user code
	}

	/**
	 * Description of the method setState.
	 * @param state 
	 */
	public void setState(States state) {
		// Start of user code for method setState
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

	// Start of user code (user defined methods for Cities)

	// End of user code
	/**
	 * Returns id.
	 * @return id 
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Sets a value to attribute id. 
	 * @param newId 
	 */
	public void setId(Integer newId) {
		if (this.id != null) {
			this.id.set(null);
		}
		this.id.set(this);
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
	 * Returns state.
	 * @return state 
	 */
	public States getState() {
		return this.state;
	}

	/**
	 * Sets a value to attribute state. 
	 * @param newState 
	 */
	public void setState(States newState) {
		if (this.state != null) {
			this.state.set(null);
		}
		this.state.set(this);
	}

}
