/*******************************************************************************
 * Copyright (c) 2013-2016 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial Contributors:
 *     Thierry Monteil : Project manager, technical co-manager
 *     Mahdi Ben Alaya : Technical co-manager
 *     Samir Medjiah : Technical co-manager
 *     Khalil Drira : Strategy expert
 *     Guillaume Garzone : Developer
 *     François Aïssaoui : Developer
 *
 * New contributors :
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 03:56:27 PM CEST 
//

package org.eclipse.om2m.commons.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.constants.ShortName;

/**
 * <p>
 * Java class for regularResource complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="regularResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}resource">
 *       &lt;sequence>
 *         &lt;element name="accessControlPolicyIDs" type="{http://www.onem2m.org/xml/protocols}acpType" minOccurs="0"/>
 *         &lt;element name="dynamicAuthorizationConsultationIDs" type="{http://www.onem2m.org/xml/protocols}listOfURIs" minOccurs="0"/>
 *         &lt;element name="expirationTime" type="{http://www.onem2m.org/xml/protocols}timestamp"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regularResource")
@XmlSeeAlso({ ServiceSubscribedAppRule.class, StatsCollect.class,
		StatsConfig.class, Delivery.class, ExecInstance.class, MgmtCmd.class,
		Request.class, ServiceSubscribedNode.class,
		M2MServiceSubscriptionProfile.class, EventConfig.class,
		PollingChannel.class, Subscription.class, AnnounceableResource.class, DynamicAuthorizationConsultation.class })
public class RegularResource extends Resource {

	@XmlList
	@XmlElement(name=ShortName.ACP_IDS)
	protected List<String> accessControlPolicyIDs;
	@XmlList
	@XmlElement(name=ShortName.DAC_IDS, required=true)
	protected List<String> dynamicAuthorizationConsultationIDs;
	@XmlElement(name=ShortName.EXPIRATION_TIME, required = true)
	protected String expirationTime;

	/**
	 * Gets the value of the accessControlPolicyIDs property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the accessControlPolicyIDs property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAccessControlPolicyIDs().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getAccessControlPolicyIDs() {
		if (accessControlPolicyIDs == null) {
			accessControlPolicyIDs = new ArrayList<String>();
		}
		return this.accessControlPolicyIDs;
	}
	
	/**
	 * Gets the value of the dynamicAuthorizationConsultationIDs property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dynamicAuthorizationConsultationIDs property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDynamicAuthorizationConsultationIDs().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getDynamicAuthorizationConsultationIDs() {
		if (dynamicAuthorizationConsultationIDs == null) {
			dynamicAuthorizationConsultationIDs = new ArrayList<String>();
		}
		return this.dynamicAuthorizationConsultationIDs;
	}

	/**
	 * Gets the value of the expirationTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpirationTime() {
		return expirationTime;
	}

	/**
	 * Sets the value of the expirationTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpirationTime(String value) {
		this.expirationTime = value;
	}

}
