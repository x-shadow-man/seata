/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.config.processor;

/**
 * The enum Config Data type.
 *
 * @author zhixing
 */
public enum ConfigDataType {
    /**
     * data type yaml
     */
    yaml,
    /**
     * data type properties
     */
    properties;
    /**
     * Gets type.
     *
     * @param name the name
     * @return the type
     */
    public static ConfigDataType getType(String name) {
        for (ConfigDataType configDataType : values()) {
            if (configDataType.name().equalsIgnoreCase(name)) {
                return configDataType;
            }
        }
        throw new IllegalArgumentException("not support config data type type: " + name);
    }
}
