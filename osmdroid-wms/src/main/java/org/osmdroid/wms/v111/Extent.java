//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.05 at 10:00:55 PM EST 
//


package org.osmdroid.wms.v111;

////import javax.xml.bind.annotation.XmlAccessType;
////import javax.xml.bind.annotation.XmlAccessorType;
////import javax.xml.bind.annotation.XmlAttribute;
////import javax.xml.bind.annotation.XmlRootElement;
////import javax.xml.bind.annotation.XmlType;
////import javax.xml.bind.annotation.XmlValue;
////import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
////import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
////import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
////@XmlAccessorType(XmlAccessType.FIELD)
////@XmlType(name = "", propOrder = {
//    "value"
//})
////@XmlRootElement(name = "Extent")
public class Extent {

//    //@XmlAttribute(name = "name", required = true)
//    //@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String name;
//    //@XmlAttribute(name = "default")
//    //@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String _default;
//    //@XmlAttribute(name = "nearestValue")
//    //@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nearestValue;
//    //@XmlAttribute(name = "multipleValues")
//    //@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String multipleValues;
//    //@XmlAttribute(name = "current")
//    //@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String current;
//    //@XmlValue
    protected String value;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the nearestValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearestValue() {
        if (nearestValue == null) {
            return "0";
        } else {
            return nearestValue;
        }
    }

    /**
     * Sets the value of the nearestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearestValue(String value) {
        this.nearestValue = value;
    }

    /**
     * Gets the value of the multipleValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleValues() {
        if (multipleValues == null) {
            return "0";
        } else {
            return multipleValues;
        }
    }

    /**
     * Sets the value of the multipleValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleValues(String value) {
        this.multipleValues = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrent() {
        if (current == null) {
            return "0";
        } else {
            return current;
        }
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrent(String value) {
        this.current = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getvalue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setvalue(String value) {
        this.value = value;
    }

}