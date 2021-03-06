/*
 * Copyright 2016 David Fox. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.dfox.junit.http.api;

import org.apache.commons.lang.Validate;

/**
 * Base class for test results.
 */
public abstract class BaseResult implements Result {

    private final String grouping;
    private final String name;
    
    /**
     * @param grouping The group the test belongs to. For JUnit tests, this is the test class name.
     * @param name The name of the test. For JUnit tests, this is the test method name.
     */
    public BaseResult(final String grouping, final String name) {
        Validate.notEmpty(grouping, "grouping cannot be empty");
        Validate.notEmpty(name, "name cannot be empty");

        this.grouping = grouping;
        this.name = name;
    }
    
    @Override
    public String getType() {
        return getClass().getSimpleName().toLowerCase();
    }

    @Override
    public String getGrouping() {
        return grouping;
    }

    @Override
    public String getName() {
        return name;
    }
}
