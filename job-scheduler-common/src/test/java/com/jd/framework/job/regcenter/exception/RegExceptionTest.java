/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */     
package com.jd.framework.job.regcenter.exception;    

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;
    
public class RegExceptionTest {
	@Test
	public void assertGetMessage() {
		assertThat(new RegException("message is: '%s'", "test").getMessage(), is("message is: 'test'"));
	}

	@Test
	public void assertGetCause() {
		assertThat(new RegException(new RuntimeException()).getCause(), instanceOf(RuntimeException.class));
	}

}
  