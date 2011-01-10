/*
 * Copyright 2009 The Apache Software Foundation.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.xml.security.test;

import org.apache.xml.security.utils.Constants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TestUtils {

        /**
            * Method createDSctx
            *
            * @param doc
            * @param prefix
            * @param namespace
            * @return the element.
            */
           public static Element createDSctx(Document doc, String prefix,
                                             String namespace) {
        
              if ((prefix == null) || (prefix.trim().length() == 0)) {
                 throw new IllegalArgumentException("You must supply a prefix");
              }
        
              Element ctx = doc.createElementNS(null, "namespaceContext");
        
              ctx.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:" + prefix.trim(),
                                 namespace);
        
              return ctx;
           }

}