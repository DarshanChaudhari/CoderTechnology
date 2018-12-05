/**
 * 
 */
package com.jp.otm.test;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import com.jp.otm.util.JPAUtil;

/**
 * @author Administrator
 *
 */
public class JPAUtilTest {
	
	@Test
	public void testEntityManager(){
		EntityManager em =JPAUtil.getEntityManager();
		Assert.assertNull("Entity Manager is Null ", em);
	}

}
