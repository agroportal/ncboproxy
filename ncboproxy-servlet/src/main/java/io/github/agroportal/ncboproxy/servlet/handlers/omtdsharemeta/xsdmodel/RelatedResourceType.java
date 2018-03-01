//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 12:36:44 PM CET 
//


package io.github.agroportal.ncboproxy.servlet.handlers.omtdsharemeta.xsdmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for related resources; sequence of resource names and identifiers
 * 
 * <p>Java class for relatedResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceNames">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}resourceName" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="resourceIdentifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resourceIdentifier" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}resourceIdentifierType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedResourceType", propOrder = {
    "resourceNames",
    "resourceIdentifiers"
})
public class RelatedResourceType {

    @XmlElement(required = true)
    protected RelatedResourceType.ResourceNames resourceNames;
    protected RelatedResourceType.ResourceIdentifiers resourceIdentifiers;

    /**
     * Gets the value of the resourceNames property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedResourceType.ResourceNames }
     *     
     */
    public RelatedResourceType.ResourceNames getResourceNames() {
        return resourceNames;
    }

    /**
     * Sets the value of the resourceNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedResourceType.ResourceNames }
     *     
     */
    public void setResourceNames(RelatedResourceType.ResourceNames value) {
        this.resourceNames = value;
    }

    /**
     * Gets the value of the resourceIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedResourceType.ResourceIdentifiers }
     *     
     */
    public RelatedResourceType.ResourceIdentifiers getResourceIdentifiers() {
        return resourceIdentifiers;
    }

    /**
     * Sets the value of the resourceIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedResourceType.ResourceIdentifiers }
     *     
     */
    public void setResourceIdentifiers(RelatedResourceType.ResourceIdentifiers value) {
        this.resourceIdentifiers = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="resourceIdentifier" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}resourceIdentifierType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resourceIdentifier"
    })
    public static class ResourceIdentifiers {

        @XmlElement(required = true)
        protected List<ResourceIdentifierType> resourceIdentifier;

        /**
         * Gets the value of the resourceIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resourceIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResourceIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResourceIdentifierType }
         * 
         * 
         */
        public List<ResourceIdentifierType> getResourceIdentifier() {
            if (resourceIdentifier == null) {
                resourceIdentifier = new ArrayList<ResourceIdentifierType>();
            }
            return this.resourceIdentifier;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}resourceName" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resourceName"
    })
    public static class ResourceNames {

        @XmlElement(required = true)
        protected List<ResourceName> resourceName;

        /**
         * Gets the value of the resourceName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resourceName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResourceName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResourceName }
         * 
         * 
         */
        public List<ResourceName> getResourceName() {
            if (resourceName == null) {
                resourceName = new ArrayList<ResourceName>();
            }
            return this.resourceName;
        }

    }

}
