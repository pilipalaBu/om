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

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.om2m.commons.constants.Constants;
import org.eclipse.om2m.commons.constants.ShortName;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseStatusCode" type="{http://www.onem2m.org/xml/protocols}responseStatusCode"/>
 *         &lt;element name="requestIdentifier" type="{http://www.onem2m.org/xml/protocols}requestID"/>
 *         &lt;element name="content" type="{http://www.onem2m.org/xml/protocols}primitiveContent" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="from" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="originatingTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="resultExpirationTimestamp" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="eventCategory" type="{http://www.onem2m.org/xml/protocols}eventCat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = ShortName.RESPONSE_PRIMITIVE)
public class ResponsePrimitive {

	@XmlElement(required = true, name = ShortName.RESPONSE_STATUS_CODE)
	protected BigInteger responseStatusCode;
	@XmlElement(required = true, name = ShortName.REQUEST_IDENTIFIER)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String requestIdentifier;
	@XmlTransient
	protected Object objContent;
	@XmlElement(name = ShortName.PRIMITIVE_CONTENT)
	protected PrimitiveContent content;
	@XmlElement(name = ShortName.TO)
	protected String to;
	@XmlElement(name = ShortName.FROM)
	protected String from;
	@XmlElement(name = ShortName.ORIGINATING_TIMESTAMP)
	protected String originatingTimestamp;
	@XmlElement(name = ShortName.RESULT_EXPIRATION_TIMESTAMP)
	protected String resultExpirationTimestamp;
	@XmlElement(name = ShortName.EVENT_CATEGORY)
	protected String eventCategory;
	@XmlTransient
	protected String location;
	@XmlTransient
	protected String errorMessage;

	public ResponsePrimitive() {
		this.from = "/" + Constants.CSE_ID;
	}

	public ResponsePrimitive(RequestPrimitive request) {
		this.from = "/" + Constants.CSE_ID;
		this.setTo(request.getFrom());
		this.setRequestIdentifier(request.getRequestIdentifier());
	}

	/**
	 * Gets the value of the responseStatusCode property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getResponseStatusCode() {
		return responseStatusCode;
	}

	/**
	 * Sets the value of the responseStatusCode property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setResponseStatusCode(BigInteger value) {
		this.responseStatusCode = value;
	}

	/**
	 * Gets the value of the requestIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestIdentifier() {
		return requestIdentifier;
	}

	/**
	 * Sets the value of the requestIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestIdentifier(String value) {
		this.requestIdentifier = value;
	}

	/**
	 * Gets the value of the content property.
	 * 
	 * @return possible object is {@link PrimitiveContent }
	 * 
	 */
	public Object getContent() {
		return objContent;
	}

	/**
	 * Sets the value of the content property.
	 * 
	 * @param value
	 *            allowed object is {@link PrimitiveContent }
	 * 
	 */
	public void setContent(Object value) {
		this.objContent = value;
	}

	/**
	 * Gets the value of the to property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTo() {
		return to;
	}

	/**
	 * Sets the value of the to property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTo(String value) {
		this.to = value;
	}

	/**
	 * Gets the value of the from property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Sets the value of the from property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFrom(String value) {
		this.from = value;
	}

	/**
	 * Gets the value of the originatingTimestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginatingTimestamp() {
		return originatingTimestamp;
	}

	/**
	 * Sets the value of the originatingTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginatingTimestamp(String value) {
		this.originatingTimestamp = value;
	}

	/**
	 * Gets the value of the resultExpirationTimestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResultExpirationTimestamp() {
		return resultExpirationTimestamp;
	}

	/**
	 * Sets the value of the resultExpirationTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResultExpirationTimestamp(String value) {
		this.resultExpirationTimestamp = value;
	}

	/**
	 * Gets the value of the eventCategory property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEventCategory() {
		return eventCategory;
	}

	/**
	 * Sets the value of the eventCategory property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEventCategory(String value) {
		this.eventCategory = value;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponsePrimitive ["
				+ (responseStatusCode != null ? "responseStatusCode="
						+ responseStatusCode + ",\n " : "")
				+ (requestIdentifier != null ? "requestIdentifier="
						+ requestIdentifier + ",\n " : "")
				+ (objContent != null ? "content=" + objContent + ",\n " : "")
				+ (to != null ? "to=" + to + ",\n " : "")
				+ (from != null ? "from=" + from + ",\n " : "")
				+ (originatingTimestamp != null ? "originatingTimestamp="
						+ originatingTimestamp + ",\n " : "")
				+ (resultExpirationTimestamp != null ? "resultExpirationTimestamp="
						+ resultExpirationTimestamp + ",\n "
						: "")
				+ (eventCategory != null ? "eventCategory=" + eventCategory
						+ ",\n " : "")
				+ (location != null ? "location=" + location + ",\n " : "")
				+ (errorMessage != null ? "errorMessage=" + errorMessage : "")
				+ "]";
	}

	public void setPrimitiveContent(PrimitiveContent content){
		this.content = content;
	}
	
	public PrimitiveContent getPritimitiveContent(){
		return content;
	}
	
}
