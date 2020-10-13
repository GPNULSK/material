
package com.landa.material.action.struts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hiOrgPageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hiOrgPageInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://struts.action.material.landa.com/}pageInfoView">
 *       &lt;sequence>
 *         &lt;element name="f_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_address_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_deleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_deleted_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_description_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_id_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_orgName_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_orgNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_orgNum_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager" type="{http://struts.action.material.landa.com/}hiUserPageInfo" minOccurs="0"/>
 *         &lt;element name="parentOrg" type="{http://struts.action.material.landa.com/}hiOrgPageInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hiOrgPageInfo", propOrder = {
    "fAddress",
    "fAddressOp",
    "fDeleted",
    "fDeletedOp",
    "fDescription",
    "fDescriptionOp",
    "fId",
    "fIdOp",
    "fOrgName",
    "fOrgNameOp",
    "fOrgNum",
    "fOrgNumOp",
    "manager",
    "parentOrg"
})
public class HiOrgPageInfo
    extends PageInfoView
{

    @XmlElement(name = "f_address")
    protected String fAddress;
    @XmlElement(name = "f_address_op")
    protected String fAddressOp;
    @XmlElement(name = "f_deleted")
    protected Integer fDeleted;
    @XmlElement(name = "f_deleted_op")
    protected String fDeletedOp;
    @XmlElement(name = "f_description")
    protected String fDescription;
    @XmlElement(name = "f_description_op")
    protected String fDescriptionOp;
    @XmlElement(name = "f_id")
    protected Integer fId;
    @XmlElement(name = "f_id_op")
    protected String fIdOp;
    @XmlElement(name = "f_orgName")
    protected String fOrgName;
    @XmlElement(name = "f_orgName_op")
    protected String fOrgNameOp;
    @XmlElement(name = "f_orgNum")
    protected String fOrgNum;
    @XmlElement(name = "f_orgNum_op")
    protected String fOrgNumOp;
    protected HiUserPageInfo manager;
    protected HiOrgPageInfo parentOrg;

    /**
     * Gets the value of the fAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAddress() {
        return fAddress;
    }

    /**
     * Sets the value of the fAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAddress(String value) {
        this.fAddress = value;
    }

    /**
     * Gets the value of the fAddressOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAddressOp() {
        return fAddressOp;
    }

    /**
     * Sets the value of the fAddressOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAddressOp(String value) {
        this.fAddressOp = value;
    }

    /**
     * Gets the value of the fDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFDeleted() {
        return fDeleted;
    }

    /**
     * Sets the value of the fDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFDeleted(Integer value) {
        this.fDeleted = value;
    }

    /**
     * Gets the value of the fDeletedOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDeletedOp() {
        return fDeletedOp;
    }

    /**
     * Sets the value of the fDeletedOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDeletedOp(String value) {
        this.fDeletedOp = value;
    }

    /**
     * Gets the value of the fDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDescription() {
        return fDescription;
    }

    /**
     * Sets the value of the fDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDescription(String value) {
        this.fDescription = value;
    }

    /**
     * Gets the value of the fDescriptionOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDescriptionOp() {
        return fDescriptionOp;
    }

    /**
     * Sets the value of the fDescriptionOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDescriptionOp(String value) {
        this.fDescriptionOp = value;
    }

    /**
     * Gets the value of the fId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFId() {
        return fId;
    }

    /**
     * Sets the value of the fId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFId(Integer value) {
        this.fId = value;
    }

    /**
     * Gets the value of the fIdOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIdOp() {
        return fIdOp;
    }

    /**
     * Sets the value of the fIdOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIdOp(String value) {
        this.fIdOp = value;
    }

    /**
     * Gets the value of the fOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOrgName() {
        return fOrgName;
    }

    /**
     * Sets the value of the fOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOrgName(String value) {
        this.fOrgName = value;
    }

    /**
     * Gets the value of the fOrgNameOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOrgNameOp() {
        return fOrgNameOp;
    }

    /**
     * Sets the value of the fOrgNameOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOrgNameOp(String value) {
        this.fOrgNameOp = value;
    }

    /**
     * Gets the value of the fOrgNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOrgNum() {
        return fOrgNum;
    }

    /**
     * Sets the value of the fOrgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOrgNum(String value) {
        this.fOrgNum = value;
    }

    /**
     * Gets the value of the fOrgNumOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOrgNumOp() {
        return fOrgNumOp;
    }

    /**
     * Sets the value of the fOrgNumOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOrgNumOp(String value) {
        this.fOrgNumOp = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link HiUserPageInfo }
     *     
     */
    public HiUserPageInfo getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link HiUserPageInfo }
     *     
     */
    public void setManager(HiUserPageInfo value) {
        this.manager = value;
    }

    /**
     * Gets the value of the parentOrg property.
     * 
     * @return
     *     possible object is
     *     {@link HiOrgPageInfo }
     *     
     */
    public HiOrgPageInfo getParentOrg() {
        return parentOrg;
    }

    /**
     * Sets the value of the parentOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link HiOrgPageInfo }
     *     
     */
    public void setParentOrg(HiOrgPageInfo value) {
        this.parentOrg = value;
    }

}
