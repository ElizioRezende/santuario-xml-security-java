//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.12 at 10:25:38 AM IST 
//


package org.apache.xml.security.configuration;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TransformAlgorithmsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransformAlgorithmsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransformAlgorithm" type="{http://www.xmlsecurity.org/NS/configuration}TransformAlgorithmType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformAlgorithmsType", namespace = "http://www.xmlsecurity.org/NS/configuration", propOrder = {
    "transformAlgorithm"
})
public class TransformAlgorithmsType {

    @XmlElement(name = "TransformAlgorithm", namespace = "http://www.xmlsecurity.org/NS/configuration")
    protected List<TransformAlgorithmType> transformAlgorithm;

    /**
     * Gets the value of the transformAlgorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transformAlgorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransformAlgorithmType }
     * 
     * 
     */
    public List<TransformAlgorithmType> getTransformAlgorithm() {
        if (transformAlgorithm == null) {
            transformAlgorithm = new ArrayList<TransformAlgorithmType>();
        }
        return this.transformAlgorithm;
    }

}
