/**
 * Copyright (C) 2012-2018 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.sos.ogc.sos;

import javax.xml.namespace.QName;

public interface RelatedOfferingConstants {
    String NS_RO = "http://www.opengis.net/sosro/1.0";

    String NS_RO_PREFIX = "ro";

    String ROLE = "sub-offering";

    String RELATED_OFFERINGS = "relatedOfferings";

    String EN_RO_RELATED_OFFERINGS = "RelatedOfferings";
    
    String EN_RO_OFFERING_CONTEXT = "OfferingContext";
    
    String EN_RO_ROLE = "role";
    
    String EN_RO_RELATED_OFFERING = "relatedOffering";

    QName QN_RO_RELATED_OFFERINGS = new QName(NS_RO, EN_RO_RELATED_OFFERINGS, NS_RO_PREFIX);
    
    QName QN_RO_OFFERING_CONTEXT = new QName(NS_RO, EN_RO_OFFERING_CONTEXT, NS_RO_PREFIX);
    
    QName QN_RO_ROLE = new QName(NS_RO, EN_RO_ROLE, NS_RO_PREFIX);
    
    QName QN_RO_RELATED_OFFERING = new QName(NS_RO, EN_RO_RELATED_OFFERING, NS_RO_PREFIX);
}
