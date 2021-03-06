/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package com.jd.framework.job.event.rdb;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class RdbJobEventIdentityTest {

	@Test
	public void assertGetIdentity() {
		assertThat(new RdbJobEventIdentity().getIdentity(), Is.is("rdb"));
	}

}
