/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.mq.CreateJmsResponseJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.*;
import static com.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.CreateJmsResponse;
import static com.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.CreateJmsResponse_processor;

public class CreateJmsResponseJsonLoaderTest extends JsonLoaderTest {
    public CreateJmsResponseJsonLoaderTest() {
        super(new CreateJmsResponseJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse.json", CreateJmsResponse);
    }

    @Test
    public void testProcessor() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse_processor.json", CreateJmsResponse_processor);
    }

    @Test
    public void testMutipleProcessor() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse_multipleProcessors.json", CreateJmsResponse_multipleProcessors);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/CreateJmsResponse_fullLoad.json");
    }
}
