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
		assertExpectation("classpath:/CreateJmsResponse.json", "com.emarte.regurgitator.extensions.mq.CreateJmsResponse:[com.emarte.regurgitator.core.CreateResponse:['create-jsm-response-1',com.emarte.regurgitator.core.ValueSource:[null,'value'],null],'destination','correlation','type']");
	}

	@Test
	public void testFullLoadJson() throws Exception {
		loadFile("classpath:/CreateJmsResponse_fullLoad.json");
	}
}
