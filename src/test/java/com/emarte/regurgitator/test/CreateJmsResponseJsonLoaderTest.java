/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.mq.CreateJmsResponseJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class CreateJmsResponseJsonLoaderTest extends JsonLoaderTest {

	public CreateJmsResponseJsonLoaderTest() {
		super(new CreateJmsResponseJsonLoader());
	}

	@Test
	public void testThis() throws Exception {
		assertExpectation("classpath:/CreateJmsResponse.json", "com.emarte.regurgitator.extensions.mq.CreateJmsResponse:[com.emarte.regurgitator.core.CreateResponse:['create-jsm-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],null],'message-id','type','destination','correlation','4','expiration','priority','true','reply-to','123456789']");
	}

	@Test
	public void testFullLoadJson() throws Exception {
		loadFile("classpath:/CreateJmsResponse_fullLoad.json");
	}
}
