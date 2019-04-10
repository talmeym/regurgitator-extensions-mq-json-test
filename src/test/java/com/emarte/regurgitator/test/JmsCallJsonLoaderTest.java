/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.mq.JmsCallJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.MqExtensionsLoaderTestExpectations.JmsCall;

public class JmsCallJsonLoaderTest extends JsonLoaderTest {
    public JmsCallJsonLoaderTest() {
        super(new JmsCallJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/JmsCall.json", JmsCall);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/JmsCall.json");
    }
}