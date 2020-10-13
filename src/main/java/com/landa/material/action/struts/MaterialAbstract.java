
package com.landa.material.action.struts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for materialAbstract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialAbstract">
 *   &lt;complexContent>
 *     &lt;extension base="{http://struts.action.material.landa.com/}baseObject">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="image" type="{http://struts.action.material.landa.com/}attachment" minOccurs="0"/>
 *         &lt;element name="lyxx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="syntime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taxcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuhao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wlgroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wlgroupcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wltype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wltypecn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialAbstract", propOrder = {
    "code",
    "id",
    "image",
    "lyxx",
    "signal",
    "signalcode",
    "syntime",
    "taxcode",
    "tuhao",
    "unitcn",
    "unitcode",
    "wlgroup",
    "wlgroupcode",
    "wlname",
    "wltype",
    "wltypecn"
})
@XmlSeeAlso({
    Material.class
})
public abstract class MaterialAbstract
    extends BaseObject
{

    protected String code;
    protected Integer id;
    protected Attachment image;
    protected String lyxx;
    protected String signal;
    protected String signalcode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar syntime;
    protected String taxcode;
    protected String tuhao;
    protected String unitcn;
    protected String unitcode;
    protected String wlgroup;
    protected String wlgroupcode;
    protected String wlname;
    protected String wltype;
    protected String wltypecn;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setImage(Attachment value) {
        this.image = value;
    }

    /**
     * Gets the value of the lyxx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLyxx() {
        return lyxx;
    }

    /**
     * Sets the value of the lyxx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLyxx(String value) {
        this.lyxx = value;
    }

    /**
     * Gets the value of the signal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignal() {
        return signal;
    }

    /**
     * Sets the value of the signal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignal(String value) {
        this.signal = value;
    }

    /**
     * Gets the value of the signalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalcode() {
        return signalcode;
    }

    /**
     * Sets the value of the signalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalcode(String value) {
        this.signalcode = value;
    }

    /**
     * Gets the value of the syntime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSyntime() {
        return syntime;
    }

    /**
     * Sets the value of the syntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSyntime(XMLGregorianCalendar value) {
        this.syntime = value;
    }

    /**
     * Gets the value of the taxcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxcode() {
        return taxcode;
    }

    /**
     * Sets the value of the taxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxcode(String value) {
        this.taxcode = value;
    }

    /**
     * Gets the value of the tuhao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuhao() {
        return tuhao;
    }

    /**
     * Sets the value of the tuhao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuhao(String value) {
        this.tuhao = value;
    }

    /**
     * Gets the value of the unitcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitcn() {
        return unitcn;
    }

    /**
     * Sets the value of the unitcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitcn(String value) {
        this.unitcn = value;
    }

    /**
     * Gets the value of the unitcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitcode() {
        return unitcode;
    }

    /**
     * Sets the value of the unitcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitcode(String value) {
        this.unitcode = value;
    }

    /**
     * Gets the value of the wlgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlgroup() {
        return wlgroup;
    }

    /**
     * Sets the value of the wlgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlgroup(String value) {
        this.wlgroup = value;
    }

    /**
     * Gets the value of the wlgroupcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlgroupcode() {
        return wlgroupcode;
    }

    /**
     * Sets the value of the wlgroupcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlgroupcode(String value) {
        this.wlgroupcode = value;
    }

    /**
     * Gets the value of the wlname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlname() {
        return wlname;
    }

    /**
     * Sets the value of the wlname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlname(String value) {
        this.wlname = value;
    }

    /**
     * Gets the value of the wltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWltype() {
        return wltype;
    }

    /**
     * Sets the value of the wltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWltype(String value) {
        this.wltype = value;
    }

    /**
     * Gets the value of the wltypecn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWltypecn() {
        return wltypecn;
    }

    /**
     * Sets the value of the wltypecn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWltypecn(String value) {
        this.wltypecn = value;
    }

}
