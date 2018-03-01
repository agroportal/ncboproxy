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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for annotationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="annotationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotationTypes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}annotationTypeInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}typesystem" minOccurs="0"/>
 *         &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}annotationSchema" minOccurs="0"/>
 *         &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}annotationResource" minOccurs="0"/>
 *         &lt;element name="guidelinesDocumentedIn" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}relatedDocumentInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="annotationMode" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}processMode" minOccurs="0"/>
 *         &lt;element name="annotationModeDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAnnotatedBy" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}relatedResourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="annotationDate" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}dateCombinationType" minOccurs="0"/>
 *         &lt;element name="interannotatorAgreement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="intraannotatorAgreement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="annotators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="annotator" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}actorInfoType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "annotationInfoType", propOrder = {
    "annotationTypes",
    "typesystem",
    "annotationSchema",
    "annotationResource",
    "guidelinesDocumentedIn",
    "annotationMode",
    "annotationModeDetails",
    "isAnnotatedBy",
    "annotationDate",
    "interannotatorAgreement",
    "intraannotatorAgreement",
    "annotators"
})
public class AnnotationInfoType {

    @XmlElement(required = true)
    protected AnnotationInfoType.AnnotationTypes annotationTypes;
    protected RelatedResourceType typesystem;
    protected RelatedResourceType annotationSchema;
    protected RelatedResourceType annotationResource;
    protected List<RelatedDocumentInfoType> guidelinesDocumentedIn;
    @XmlSchemaType(name = "string")
    protected ProcessMode annotationMode;
    protected String annotationModeDetails;
    protected List<RelatedResourceType> isAnnotatedBy;
    protected DateCombinationType annotationDate;
    protected String interannotatorAgreement;
    protected String intraannotatorAgreement;
    protected AnnotationInfoType.Annotators annotators;

    /**
     * Gets the value of the annotationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationInfoType.AnnotationTypes }
     *     
     */
    public AnnotationInfoType.AnnotationTypes getAnnotationTypes() {
        return annotationTypes;
    }

    /**
     * Sets the value of the annotationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationInfoType.AnnotationTypes }
     *     
     */
    public void setAnnotationTypes(AnnotationInfoType.AnnotationTypes value) {
        this.annotationTypes = value;
    }

    /**
     * Gets the value of the typesystem property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedResourceType }
     *     
     */
    public RelatedResourceType getTypesystem() {
        return typesystem;
    }

    /**
     * Sets the value of the typesystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedResourceType }
     *     
     */
    public void setTypesystem(RelatedResourceType value) {
        this.typesystem = value;
    }

    /**
     * Gets the value of the annotationSchema property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedResourceType }
     *     
     */
    public RelatedResourceType getAnnotationSchema() {
        return annotationSchema;
    }

    /**
     * Sets the value of the annotationSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedResourceType }
     *     
     */
    public void setAnnotationSchema(RelatedResourceType value) {
        this.annotationSchema = value;
    }

    /**
     * Gets the value of the annotationResource property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedResourceType }
     *     
     */
    public RelatedResourceType getAnnotationResource() {
        return annotationResource;
    }

    /**
     * Sets the value of the annotationResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedResourceType }
     *     
     */
    public void setAnnotationResource(RelatedResourceType value) {
        this.annotationResource = value;
    }

    /**
     * Gets the value of the guidelinesDocumentedIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guidelinesDocumentedIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuidelinesDocumentedIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedDocumentInfoType }
     * 
     * 
     */
    public List<RelatedDocumentInfoType> getGuidelinesDocumentedIn() {
        if (guidelinesDocumentedIn == null) {
            guidelinesDocumentedIn = new ArrayList<RelatedDocumentInfoType>();
        }
        return this.guidelinesDocumentedIn;
    }

    /**
     * Gets the value of the annotationMode property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessMode }
     *     
     */
    public ProcessMode getAnnotationMode() {
        return annotationMode;
    }

    /**
     * Sets the value of the annotationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessMode }
     *     
     */
    public void setAnnotationMode(ProcessMode value) {
        this.annotationMode = value;
    }

    /**
     * Gets the value of the annotationModeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationModeDetails() {
        return annotationModeDetails;
    }

    /**
     * Sets the value of the annotationModeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationModeDetails(String value) {
        this.annotationModeDetails = value;
    }

    /**
     * Gets the value of the isAnnotatedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isAnnotatedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsAnnotatedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedResourceType }
     * 
     * 
     */
    public List<RelatedResourceType> getIsAnnotatedBy() {
        if (isAnnotatedBy == null) {
            isAnnotatedBy = new ArrayList<RelatedResourceType>();
        }
        return this.isAnnotatedBy;
    }

    /**
     * Gets the value of the annotationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateCombinationType }
     *     
     */
    public DateCombinationType getAnnotationDate() {
        return annotationDate;
    }

    /**
     * Sets the value of the annotationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCombinationType }
     *     
     */
    public void setAnnotationDate(DateCombinationType value) {
        this.annotationDate = value;
    }

    /**
     * Gets the value of the interannotatorAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterannotatorAgreement() {
        return interannotatorAgreement;
    }

    /**
     * Sets the value of the interannotatorAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterannotatorAgreement(String value) {
        this.interannotatorAgreement = value;
    }

    /**
     * Gets the value of the intraannotatorAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraannotatorAgreement() {
        return intraannotatorAgreement;
    }

    /**
     * Sets the value of the intraannotatorAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraannotatorAgreement(String value) {
        this.intraannotatorAgreement = value;
    }

    /**
     * Gets the value of the annotators property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationInfoType.Annotators }
     *     
     */
    public AnnotationInfoType.Annotators getAnnotators() {
        return annotators;
    }

    /**
     * Sets the value of the annotators property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationInfoType.Annotators }
     *     
     */
    public void setAnnotators(AnnotationInfoType.Annotators value) {
        this.annotators = value;
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
     *         &lt;element ref="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}annotationTypeInfo" maxOccurs="unbounded"/>
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
        "annotationTypeInfo"
    })
    public static class AnnotationTypes {

        @XmlElement(required = true)
        protected List<AnnotationTypeInfo> annotationTypeInfo;

        /**
         * Gets the value of the annotationTypeInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotationTypeInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnotationTypeInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnnotationTypeInfo }
         * 
         * 
         */
        public List<AnnotationTypeInfo> getAnnotationTypeInfo() {
            if (annotationTypeInfo == null) {
                annotationTypeInfo = new ArrayList<AnnotationTypeInfo>();
            }
            return this.annotationTypeInfo;
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
     *         &lt;element name="annotator" type="{http://www.meta-share.org/OMTD-SHARE_XMLSchema}actorInfoType" maxOccurs="unbounded" minOccurs="0"/>
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
        "annotator"
    })
    public static class Annotators {

        protected List<ActorInfoType> annotator;

        /**
         * Gets the value of the annotator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnotator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActorInfoType }
         * 
         * 
         */
        public List<ActorInfoType> getAnnotator() {
            if (annotator == null) {
                annotator = new ArrayList<ActorInfoType>();
            }
            return this.annotator;
        }

    }

}
