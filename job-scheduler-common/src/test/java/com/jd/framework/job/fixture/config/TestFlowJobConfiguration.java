/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package com.jd.framework.job.fixture.config;

import lombok.RequiredArgsConstructor;

import com.jd.framework.job.config.JobRootConfiguration;
import com.jd.framework.job.config.JobTypeConfiguration;
import com.jd.framework.job.config.core.JobCoreConfiguration;
import com.jd.framework.job.config.type.FlowJobConfiguration;
import com.jd.framework.job.executor.handler.JobProperties;
import com.jd.framework.job.fixture.SegmentContextsBuilder;
import com.jd.framework.job.fixture.handler.IgnoreExceptionHandler;
import com.jd.framework.job.fixture.job.TestFlowJob;

@RequiredArgsConstructor
public final class TestFlowJobConfiguration implements JobRootConfiguration {

	private final boolean streamingProcess;

	@Override
	public JobTypeConfiguration getTypeConfig() {
		return new FlowJobConfiguration(JobCoreConfiguration
				.newBuilder(SegmentContextsBuilder.JOB_NAME, "0/1 * * * * ?", 3)
				.jobProperties(JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER.getKey(),
						IgnoreExceptionHandler.class.getCanonicalName()).build(), TestFlowJob.class.getCanonicalName(),
				streamingProcess);
	}
}
