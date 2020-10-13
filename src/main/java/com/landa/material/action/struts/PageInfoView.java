
package com.landa.material.action.struts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pageInfoView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pageInfoView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://struts.action.material.landa.com/}pageImpl">
 *       &lt;sequence>
 *         &lt;element name="sorterDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sorterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageInfoView", propOrder = {
    "sorterDirection",
    "sorterName"
})
@XmlSeeAlso({
    HiUserPageInfo.class,
    HiOrgPageInfo.class,
    MaterialPageInfo.class
})
public class PageInfoView
    extends PageImpl
{

    protected String sorterDirection;
    protected String sorterName;

    /**
     * Gets the value of the sorterDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorterDirection() {
        return sorterDirection;
    }

    /**
     * Sets the value of the sorterDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorterDirection(String value) {
        this.sorterDirection = value;
    }

    /**
     * Gets the value of the sorterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorterName() {
        return sorterName;
    }

    /**
     * Sets the value of the sorterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorterName(String value) {
        this.sorterName = value;
    }

}
