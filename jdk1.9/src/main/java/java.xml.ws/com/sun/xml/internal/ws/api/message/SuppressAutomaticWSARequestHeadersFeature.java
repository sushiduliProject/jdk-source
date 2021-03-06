/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.xml.internal.ws.api.message;

import javax.xml.ws.WebServiceFeature;

/**
 * Suppresses automatic generation of WS-Addressing headers in request messages.  Use this in cases
 * where required headers will be generated by other means.
 *
 * @since 2.2.6
 */
public class SuppressAutomaticWSARequestHeadersFeature extends
                WebServiceFeature {

        public SuppressAutomaticWSARequestHeadersFeature() {
                enabled = true;
        }

        @Override
        public String getID() {
                return SuppressAutomaticWSARequestHeadersFeature.class.toString();
        }

}
