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
 * <p>Java class for ResourceResolversType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceResolversType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Resolver" type="{http://www.xmlsecurity.org/NS/configuration}ResolverType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceResolversType", namespace = "http://www.xmlsecurity.org/NS/configuration", propOrder = {
    "resolver"
})
public class ResourceResolversType {

    @XmlElement(name = "Resolver", namespace = "http://www.xmlsecurity.org/NS/configuration")
    protected List<ResolverType> resolver;

    /**
     * Gets the value of the resolver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resolver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResolverType }
     * 
     * 
     */
    public List<ResolverType> getResolver() {
        if (resolver == null) {
            resolver = new ArrayList<ResolverType>();
        }
        return this.resolver;
    }

}