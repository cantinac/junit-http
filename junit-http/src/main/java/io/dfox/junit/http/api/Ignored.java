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

/**
 * TestError represents an test which was ignored.
 */
public class Ignored extends BaseResult {
    
    /**
     * @param grouping The group the test belongs to. For JUnit tests, this is the test class name.
     * @param name The name of the test. For JUnit tests, this is the test method name.
     */
    public Ignored(final String grouping, final String name) {
        super(grouping, name);
    }
}