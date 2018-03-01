//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 12:36:44 PM CET 
//


package io.github.agroportal.ncboproxy.servlet.handlers.omtdsharemeta.xsdmodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classificationSchemeName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="classificationSchemeName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DDC"/>
 *     &lt;enumeration value="UDC"/>
 *     &lt;enumeration value="EuroVoc"/>
 *     &lt;enumeration value="LCSH"/>
 *     &lt;enumeration value="DK-5"/>
 *     &lt;enumeration value="MeSH"/>
 *     &lt;enumeration value="ANC_classification"/>
 *     &lt;enumeration value="BNC_classification"/>
 *     &lt;enumeration value="NLK_classification"/>
 *     &lt;enumeration value="PAROLE_topicClassification"/>
 *     &lt;enumeration value="PAROLE_genreClassification"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "classificationSchemeName")
@XmlEnum
public enum ClassificationSchemeName {


    /**
     * Dewey Decimal Classification system; https://www.oclc.org/dewey.en.html
     * 
     */
    DDC("DDC"),

    /**
     * Universal Decimal Classification system; for the Linked Data version, cf. http://udcdata.info/
     * 
     */
    UDC("UDC"),

    /**
     * EuroVoc, the EU's multilingual thesaurus; various downloadable versions at http://data.europa.eu/euodp/en/data/dataset/eurovoc
     * 
     */
    @XmlEnumValue("EuroVoc")
    EURO_VOC("EuroVoc"),

    /**
     * Library of Congress Subject Headings; cf. http://id.loc.gov/authorities/subjects.html
     * 
     */
    LCSH("LCSH"),

    /**
     * DK-5; Linked Data version at https://opensource.dbc.dk/linked-data/dk5-linked-data
     * 
     */
    @XmlEnumValue("DK-5")
    DK_5("DK-5"),

    /**
     * Medical Subject Headlings; downloadable versions at https://www.nlm.nih.gov/mesh/download_mesh.html
     * 
     */
    @XmlEnumValue("MeSH")
    ME_SH("MeSH"),

    /**
     * American National Corpus controlled vocabulary for text classification; cf. http://www.anc.org/
     * 
     */
    @XmlEnumValue("ANC_classification")
    ANC_CLASSIFICATION("ANC_classification"),

    /**
     * British National Corpus controlled vocabulary for text classification; cf. http://www.natcorp.ox.ac.uk/docs/URG/ subsections on selection and descriptive features
     * 
     */
    @XmlEnumValue("BNC_classification")
    BNC_CLASSIFICATION("BNC_classification"),
    @XmlEnumValue("NLK_classification")
    NLK_CLASSIFICATION("NLK_classification"),

    /**
     * Parole topic classification system; used for the consistent classification of text corpora in the LE-PAROLE project
     * 
     */
    @XmlEnumValue("PAROLE_topicClassification")
    PAROLE_TOPIC_CLASSIFICATION("PAROLE_topicClassification"),

    /**
     * Parole genre classification system; used for the consistent classification of text corpora in the LE-PAROLE project
     * 
     */
    @XmlEnumValue("PAROLE_genreClassification")
    PAROLE_GENRE_CLASSIFICATION("PAROLE_genreClassification"),

    /**
     * Value for classificationSchemeName, to be used when the desired value is not included in the listed values
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ClassificationSchemeName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassificationSchemeName fromValue(String v) {
        for (ClassificationSchemeName c: ClassificationSchemeName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
