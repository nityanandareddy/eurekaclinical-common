package org.eurekaclinical.common.comm.clients;

/*-
 * #%L
 * Eureka! Clinical Common
 * %%
 * Copyright (C) 2016 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 *
 * @author Andrew Post
 */
public class RouterTableLoadException extends Exception {

    private static final long serialVersionUID = 1L;

    public RouterTableLoadException() {
    }

    public RouterTableLoadException(String message) {
        super(message);
    }

    public RouterTableLoadException(String message, Throwable cause) {
        super(message, cause);
    }

    public RouterTableLoadException(Throwable cause) {
        super(cause);
    }
    
}
