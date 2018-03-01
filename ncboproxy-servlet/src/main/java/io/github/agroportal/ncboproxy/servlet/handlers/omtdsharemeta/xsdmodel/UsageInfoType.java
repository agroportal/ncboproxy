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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="intendedApplications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="intendedApplication" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}applicationType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}applicationOther" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="actualUseInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}actualUseInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "usageInfoType", propOrder = {
    "intendedApplications",
    "actualUseInfos"
})
public class UsageInfoType {

    protected UsageInfoType.IntendedApplications intendedApplications;
    protected UsageInfoType.ActualUseInfos actualUseInfos;

    /**
     * Gets the value of the intendedApplications property.
     * 
     * @return
     *     possible object is
     *     {@link UsageInfoType.IntendedApplications }
     *     
     */
    public UsageInfoType.IntendedApplications getIntendedApplications() {
        return intendedApplications;
    }

    /**
     * Sets the value of the intendedApplications property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageInfoType.IntendedApplications }
     *     
     */
    public void setIntendedApplications(UsageInfoType.IntendedApplications value) {
        this.intendedApplications = value;
    }

    /**
     * Gets the value of the actualUseInfos property.
     * 
     * @return
     *     possible object is
     *     {@link UsageInfoType.ActualUseInfos }
     *     
     */
    public UsageInfoType.ActualUseInfos getActualUseInfos() {
        return actualUseInfos;
    }

    /**
     * Sets the value of the actualUseInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageInfoType.ActualUseInfos }
     *     
     */
    public void setActualUseInfos(UsageInfoType.ActualUseInfos value) {
        this.actualUseInfos = value;
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
     *         &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}actualUseInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "actualUseInfo"
    })
    public static class ActualUseInfos {

        protected List<ActualUseInfoType> actualUseInfo;

        /**
         * Gets the value of the actualUseInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actualUseInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActualUseInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActualUseInfoType }
         * 
         * 
         */
        public List<ActualUseInfoType> getActualUseInfo() {
            if (actualUseInfo == null) {
                actualUseInfo = new ArrayList<ActualUseInfoType>();
            }
            return this.actualUseInfo;
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
     *         &lt;element name="intendedApplication" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}applicationType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}applicationOther" minOccurs="0"/>
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
        "intendedApplication",
        "applicationOther"
    })
    public static class IntendedApplications {

        @XmlSchemaType(name = "anyURI")
        protected List<String> intendedApplication;
        protected String applicationOther;

        /**
         * Gets the value of the intendedApplication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intendedApplication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntendedApplication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIntendedApplication() {
            if (intendedApplication == null) {
                intendedApplication = new ArrayList<String>();
            }
            return this.intendedApplication;
        }

        /**
         * Gets the value of the applicationOther property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationOther() {
            return applicationOther;
        }

        /**
         * Sets the value of the applicationOther property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicationOther(String value) {
            this.applicationOther = value;
        }

    }

}
