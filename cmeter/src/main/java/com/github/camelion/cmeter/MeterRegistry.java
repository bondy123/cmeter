/*
 * Copyright 2017 JTS-Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.camelion.cmeter;

/**
 * @author Camelion
 * @since 26.07.17
 */
public class MeterRegistry {

    /**
     * Creates timer that provides api for recording, or measuring execution of some code
     *
     * @param name
     * @param tags
     * @return
     */
    public Timer timer(String name, Tag... tags) {
        return MetricHouse.registerMeter(new CHTimer(name, tags));
    }
}
