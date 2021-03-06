package org.eurekaclinical.common.comm.clients;

/*
 * #%L
 * Eureka Common
 * %%
 * Copyright (C) 2012 - 2013 Emory University
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
import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author Andrew Post
 */
class DefaultWebResourceWrapper extends AbstractWebResourceWrapper {

    DefaultWebResourceWrapper(WebResource inWebResource) {
        super(inWebResource);
    }

    @Override
    public WebResource rewritten(String path, String method, MultivaluedMap<String, String> queryParams) throws ClientException {
        WebResource webResource = getWebResource();
        if (queryParams != null) {
            webResource = webResource.queryParams(queryParams);
        }
        return webResource.path(path);
    }
}
