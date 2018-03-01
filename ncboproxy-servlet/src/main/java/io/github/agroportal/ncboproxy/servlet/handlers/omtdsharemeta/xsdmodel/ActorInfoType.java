//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 12:36:44 PM CET 
//


package io.github.agroportal.ncboproxy.servlet.handlers.omtdsharemeta.xsdmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for actors/agents; choice between person and organization
 * 
 * <p>Java class for actorInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actorType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="person"/>
 *               &lt;enumeration value="group"/>
 *               &lt;enumeration value="organization"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="relatedPerson" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}personInfoType" minOccurs="0"/>
 *         &lt;element name="relatedGroup" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}groupInfoType" minOccurs="0"/>
 *         &lt;element name="relatedOrganization" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}organizationInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actorInfoType", propOrder = {
    "actorType",
    "relatedPerson",
    "relatedGroup",
    "relatedOrganization"
})
public class ActorInfoType {

    @XmlElement(required = true)
    protected String actorType;
    protected PersonInfoType relatedPerson;
    protected GroupInfoType relatedGroup;
    protected OrganizationInfoType relatedOrganization;

    /**
     * Gets the value of the actorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActorType() {
        return actorType;
    }

    /**
     * Sets the value of the actorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActorType(String value) {
        this.actorType = value;
    }

    /**
     * Gets the value of the relatedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoType }
     *     
     */
    public PersonInfoType getRelatedPerson() {
        return relatedPerson;
    }

    /**
     * Sets the value of the relatedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoType }
     *     
     */
    public void setRelatedPerson(PersonInfoType value) {
        this.relatedPerson = value;
    }

    /**
     * Gets the value of the relatedGroup property.
     * 
     * @return
     *     possible object is
     *     {@link GroupInfoType }
     *     
     */
    public GroupInfoType getRelatedGroup() {
        return relatedGroup;
    }

    /**
     * Sets the value of the relatedGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupInfoType }
     *     
     */
    public void setRelatedGroup(GroupInfoType value) {
        this.relatedGroup = value;
    }

    /**
     * Gets the value of the relatedOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInfoType }
     *     
     */
    public OrganizationInfoType getRelatedOrganization() {
        return relatedOrganization;
    }

    /**
     * Sets the value of the relatedOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInfoType }
     *     
     */
    public void setRelatedOrganization(OrganizationInfoType value) {
        this.relatedOrganization = value;
    }

}
