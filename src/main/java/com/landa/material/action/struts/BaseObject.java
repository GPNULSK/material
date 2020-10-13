
package com.landa.material.action.struts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dirty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parentEntity" type="{http://struts.action.material.landa.com/}baseObject" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseObject", propOrder = {
    "dirty",
    "parentEntity",
    "version"
})
@XmlSeeAlso({
    AttachmentAbstract.class,
    MaterialAbstract.class
})
public abstract class BaseObject {

    protected boolean dirty;
    protected BaseObject parentEntity;
    protected Integer version;

    /**
     * Gets the value of the dirty property.
     * 
     */
    public boolean isDirty() {
        return dirty;
    }

    /**
     * Sets the value of the dirty property.
     * 
     */
    public void setDirty(boolean value) {
        this.dirty = value;
    }

    /**
     * Gets the value of the parentEntity property.
     * 
     * @return
     *     possible object is
     *     {@link BaseObject }
     *     
     */
    public BaseObject getParentEntity() {
        return parentEntity;
    }

    /**
     * Sets the value of the parentEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseObject }
     *     
     */
    public void setParentEntity(BaseObject value) {
        this.parentEntity = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

}
