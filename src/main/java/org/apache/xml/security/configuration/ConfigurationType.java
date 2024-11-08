//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.12 at 10:25:38 AM IST 
//


package org.apache.xml.security.configuration;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for ConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Properties" type="{http://www.xmlsecurity.org/NS/configuration}PropertiesType"/&gt;
 *         &lt;element name="SecurityHeaderHandlers" type="{http://www.xmlsecurity.org/NS/configuration}SecurityHeaderHandlersType"/&gt;
 *         &lt;element name="TransformAlgorithms" type="{http://www.xmlsecurity.org/NS/configuration}TransformAlgorithmsType"/&gt;
 *         &lt;element name="JCEAlgorithmMappings" type="{http://www.xmlsecurity.org/NS/configuration}JCEAlgorithmMappingsType"/&gt;
 *         &lt;element name="ResourceResolvers" type="{http://www.xmlsecurity.org/NS/configuration}ResourceResolversType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationType", namespace = "http://www.xmlsecurity.org/NS/configuration", propOrder = {
    "properties",
    "securityHeaderHandlers",
    "transformAlgorithms",
    "jceAlgorithmMappings",
    "resourceResolvers"
})
public class ConfigurationType {

    @XmlElement(name = "Properties", namespace = "http://www.xmlsecurity.org/NS/configuration", required = true)
    protected PropertiesType properties;
    @XmlElement(name = "SecurityHeaderHandlers", namespace = "http://www.xmlsecurity.org/NS/configuration", required = true)
    protected SecurityHeaderHandlersType securityHeaderHandlers;
    @XmlElement(name = "TransformAlgorithms", namespace = "http://www.xmlsecurity.org/NS/configuration", required = true)
    protected TransformAlgorithmsType transformAlgorithms;
    @XmlElement(name = "JCEAlgorithmMappings", namespace = "http://www.xmlsecurity.org/NS/configuration", required = true)
    protected JCEAlgorithmMappingsType jceAlgorithmMappings;
    @XmlElement(name = "ResourceResolvers", namespace = "http://www.xmlsecurity.org/NS/configuration", required = true)
    protected ResourceResolversType resourceResolvers;
    @XmlAttribute(name = "target")
    protected String target;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setProperties(PropertiesType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the securityHeaderHandlers property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityHeaderHandlersType }
     *     
     */
    public SecurityHeaderHandlersType getSecurityHeaderHandlers() {
        return securityHeaderHandlers;
    }

    /**
     * Sets the value of the securityHeaderHandlers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityHeaderHandlersType }
     *     
     */
    public void setSecurityHeaderHandlers(SecurityHeaderHandlersType value) {
        this.securityHeaderHandlers = value;
    }

    /**
     * Gets the value of the transformAlgorithms property.
     * 
     * @return
     *     possible object is
     *     {@link TransformAlgorithmsType }
     *     
     */
    public TransformAlgorithmsType getTransformAlgorithms() {
        return transformAlgorithms;
    }

    /**
     * Sets the value of the transformAlgorithms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformAlgorithmsType }
     *     
     */
    public void setTransformAlgorithms(TransformAlgorithmsType value) {
        this.transformAlgorithms = value;
    }

    /**
     * Gets the value of the jceAlgorithmMappings property.
     * 
     * @return
     *     possible object is
     *     {@link JCEAlgorithmMappingsType }
     *     
     */
    public JCEAlgorithmMappingsType getJCEAlgorithmMappings() {
        return jceAlgorithmMappings;
    }

    /**
     * Sets the value of the jceAlgorithmMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JCEAlgorithmMappingsType }
     *     
     */
    public void setJCEAlgorithmMappings(JCEAlgorithmMappingsType value) {
        this.jceAlgorithmMappings = value;
    }

    /**
     * Gets the value of the resourceResolvers property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceResolversType }
     *     
     */
    public ResourceResolversType getResourceResolvers() {
        return resourceResolvers;
    }

    /**
     * Sets the value of the resourceResolvers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceResolversType }
     *     
     */
    public void setResourceResolvers(ResourceResolversType value) {
        this.resourceResolvers = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

}