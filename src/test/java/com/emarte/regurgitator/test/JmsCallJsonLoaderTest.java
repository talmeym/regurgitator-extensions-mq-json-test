/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.mq.JmsCallJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class JmsCallJsonLoaderTest extends JsonLoaderTest {
    public JmsCallJsonLoaderTest() {
        super(new JmsCallJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/JmsCall.json", "com.emarte.regurgitator.extensions.mq.JmsCall:['jms-call-1',com.emarte.regurgitator.test.stuff.TestMqMessagingSystem:[],'queue://something']");
    }

    @Test
    public void testFullLoad() throws RegurgitatorException {
        loadFile("classpath:/JmsCall.json");
    }
}