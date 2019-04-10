/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.mq.CreateJmsResponseJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.CreateJmsResponse;

public class CreateJmsResponseJsonLoaderTest extends JsonLoaderTest {

    public CreateJmsResponseJsonLoaderTest() {
        super(new CreateJmsResponseJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/CreateJmsResponse.json", CreateJmsResponse);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/CreateJmsResponse_fullLoad.json");
    }
}
