
package com.landa.material.action.struts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for materialPageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materialPageInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://struts.action.material.landa.com/}pageInfoView">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{http://struts.action.material.landa.com/}hiUserPageInfo" minOccurs="0"/>
 *         &lt;element name="f_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_code_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_id_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_lyxx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_lyxx_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_signal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_signal_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_signalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_signalcode_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_syntime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="f_syntime01" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="f_syntime01_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_syntime_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_taxcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_taxcode_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_tuhao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_tuhao_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_unitcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_unitcn_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_unitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_unitcode_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_wlgroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_wlgroup_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_wlgroupcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_wlgroupcode_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_wlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_wlname_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_wltype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_wltype_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_wltypecn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_wltypecn_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materialPageInfo", propOrder = {
    "creator",
    "fCode",
    "fCodeOp",
    "fId",
    "fIdOp",
    "fLyxx",
    "fLyxxOp",
    "fSignal",
    "fSignalOp",
    "fSignalcode",
    "fSignalcodeOp",
    "fSyntime",
    "fSyntime01",
    "fSyntime01Op",
    "fSyntimeOp",
    "fTaxcode",
    "fTaxcodeOp",
    "fTuhao",
    "fTuhaoOp",
    "fUnitcn",
    "fUnitcnOp",
    "fUnitcode",
    "fUnitcodeOp",
    "fWlgroup",
    "fWlgroupOp",
    "fWlgroupcode",
    "fWlgroupcodeOp",
    "fWlname",
    "fWlnameOp",
    "fWltype",
    "fWltypeOp",
    "fWltypecn",
    "fWltypecnOp"
})
public class MaterialPageInfo
    extends PageInfoView
{

    protected HiUserPageInfo creator;
    @XmlElement(name = "f_code")
    protected String fCode;
    @XmlElement(name = "f_code_op")
    protected String fCodeOp;
    @XmlElement(name = "f_id")
    protected Integer fId;
    @XmlElement(name = "f_id_op")
    protected String fIdOp;
    @XmlElement(name = "f_lyxx")
    protected String fLyxx;
    @XmlElement(name = "f_lyxx_op")
    protected String fLyxxOp;
    @XmlElement(name = "f_signal")
    protected String fSignal;
    @XmlElement(name = "f_signal_op")
    protected String fSignalOp;
    @XmlElement(name = "f_signalcode")
    protected String fSignalcode;
    @XmlElement(name = "f_signalcode_op")
    protected String fSignalcodeOp;
    @XmlElement(name = "f_syntime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fSyntime;
    @XmlElement(name = "f_syntime01")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fSyntime01;
    @XmlElement(name = "f_syntime01_op")
    protected String fSyntime01Op;
    @XmlElement(name = "f_syntime_op")
    protected String fSyntimeOp;
    @XmlElement(name = "f_taxcode")
    protected String fTaxcode;
    @XmlElement(name = "f_taxcode_op")
    protected String fTaxcodeOp;
    @XmlElement(name = "f_tuhao")
    protected String fTuhao;
    @XmlElement(name = "f_tuhao_op")
    protected String fTuhaoOp;
    @XmlElement(name = "f_unitcn")
    protected String fUnitcn;
    @XmlElement(name = "f_unitcn_op")
    protected String fUnitcnOp;
    @XmlElement(name = "f_unitcode")
    protected String fUnitcode;
    @XmlElement(name = "f_unitcode_op")
    protected String fUnitcodeOp;
    @XmlElement(name = "f_wlgroup")
    protected String fWlgroup;
    @XmlElement(name = "f_wlgroup_op")
    protected String fWlgroupOp;
    @XmlElement(name = "f_wlgroupcode")
    protected Integer fWlgroupcode;
    @XmlElement(name = "f_wlgroupcode_op")
    protected String fWlgroupcodeOp;
    @XmlElement(name = "f_wlname")
    protected String fWlname;
    @XmlElement(name = "f_wlname_op")
    protected String fWlnameOp;
    @XmlElement(name = "f_wltype")
    protected String fWltype;
    @XmlElement(name = "f_wltype_op")
    protected String fWltypeOp;
    @XmlElement(name = "f_wltypecn")
    protected String fWltypecn;
    @XmlElement(name = "f_wltypecn_op")
    protected String fWltypecnOp;

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link HiUserPageInfo }
     *     
     */
    public HiUserPageInfo getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link HiUserPageInfo }
     *     
     */
    public void setCreator(HiUserPageInfo value) {
        this.creator = value;
    }

    /**
     * Gets the value of the fCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCode() {
        return fCode;
    }

    /**
     * Sets the value of the fCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCode(String value) {
        this.fCode = value;
    }

    /**
     * Gets the value of the fCodeOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCodeOp() {
        return fCodeOp;
    }

    /**
     * Sets the value of the fCodeOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCodeOp(String value) {
        this.fCodeOp = value;
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
     * Gets the value of the fLyxx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLyxx() {
        return fLyxx;
    }

    /**
     * Sets the value of the fLyxx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLyxx(String value) {
        this.fLyxx = value;
    }

    /**
     * Gets the value of the fLyxxOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLyxxOp() {
        return fLyxxOp;
    }

    /**
     * Sets the value of the fLyxxOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLyxxOp(String value) {
        this.fLyxxOp = value;
    }

    /**
     * Gets the value of the fSignal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSignal() {
        return fSignal;
    }

    /**
     * Sets the value of the fSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSignal(String value) {
        this.fSignal = value;
    }

    /**
     * Gets the value of the fSignalOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSignalOp() {
        return fSignalOp;
    }

    /**
     * Sets the value of the fSignalOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSignalOp(String value) {
        this.fSignalOp = value;
    }

    /**
     * Gets the value of the fSignalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSignalcode() {
        return fSignalcode;
    }

    /**
     * Sets the value of the fSignalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSignalcode(String value) {
        this.fSignalcode = value;
    }

    /**
     * Gets the value of the fSignalcodeOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSignalcodeOp() {
        return fSignalcodeOp;
    }

    /**
     * Sets the value of the fSignalcodeOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSignalcodeOp(String value) {
        this.fSignalcodeOp = value;
    }

    /**
     * Gets the value of the fSyntime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFSyntime() {
        return fSyntime;
    }

    /**
     * Sets the value of the fSyntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFSyntime(XMLGregorianCalendar value) {
        this.fSyntime = value;
    }

    /**
     * Gets the value of the fSyntime01 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFSyntime01() {
        return fSyntime01;
    }

    /**
     * Sets the value of the fSyntime01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFSyntime01(XMLGregorianCalendar value) {
        this.fSyntime01 = value;
    }

    /**
     * Gets the value of the fSyntime01Op property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSyntime01Op() {
        return fSyntime01Op;
    }

    /**
     * Sets the value of the fSyntime01Op property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSyntime01Op(String value) {
        this.fSyntime01Op = value;
    }

    /**
     * Gets the value of the fSyntimeOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSyntimeOp() {
        return fSyntimeOp;
    }

    /**
     * Sets the value of the fSyntimeOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSyntimeOp(String value) {
        this.fSyntimeOp = value;
    }

    /**
     * Gets the value of the fTaxcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTaxcode() {
        return fTaxcode;
    }

    /**
     * Sets the value of the fTaxcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTaxcode(String value) {
        this.fTaxcode = value;
    }

    /**
     * Gets the value of the fTaxcodeOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTaxcodeOp() {
        return fTaxcodeOp;
    }

    /**
     * Sets the value of the fTaxcodeOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTaxcodeOp(String value) {
        this.fTaxcodeOp = value;
    }

    /**
     * Gets the value of the fTuhao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTuhao() {
        return fTuhao;
    }

    /**
     * Sets the value of the fTuhao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTuhao(String value) {
        this.fTuhao = value;
    }

    /**
     * Gets the value of the fTuhaoOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTuhaoOp() {
        return fTuhaoOp;
    }

    /**
     * Sets the value of the fTuhaoOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTuhaoOp(String value) {
        this.fTuhaoOp = value;
    }

    /**
     * Gets the value of the fUnitcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUnitcn() {
        return fUnitcn;
    }

    /**
     * Sets the value of the fUnitcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUnitcn(String value) {
        this.fUnitcn = value;
    }

    /**
     * Gets the value of the fUnitcnOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUnitcnOp() {
        return fUnitcnOp;
    }

    /**
     * Sets the value of the fUnitcnOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUnitcnOp(String value) {
        this.fUnitcnOp = value;
    }

    /**
     * Gets the value of the fUnitcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUnitcode() {
        return fUnitcode;
    }

    /**
     * Sets the value of the fUnitcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUnitcode(String value) {
        this.fUnitcode = value;
    }

    /**
     * Gets the value of the fUnitcodeOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUnitcodeOp() {
        return fUnitcodeOp;
    }

    /**
     * Sets the value of the fUnitcodeOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUnitcodeOp(String value) {
        this.fUnitcodeOp = value;
    }

    /**
     * Gets the value of the fWlgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWlgroup() {
        return fWlgroup;
    }

    /**
     * Sets the value of the fWlgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWlgroup(String value) {
        this.fWlgroup = value;
    }

    /**
     * Gets the value of the fWlgroupOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWlgroupOp() {
        return fWlgroupOp;
    }

    /**
     * Sets the value of the fWlgroupOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWlgroupOp(String value) {
        this.fWlgroupOp = value;
    }

    /**
     * Gets the value of the fWlgroupcode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFWlgroupcode() {
        return fWlgroupcode;
    }

    /**
     * Sets the value of the fWlgroupcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFWlgroupcode(Integer value) {
        this.fWlgroupcode = value;
    }

    /**
     * Gets the value of the fWlgroupcodeOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWlgroupcodeOp() {
        return fWlgroupcodeOp;
    }

    /**
     * Sets the value of the fWlgroupcodeOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWlgroupcodeOp(String value) {
        this.fWlgroupcodeOp = value;
    }

    /**
     * Gets the value of the fWlname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWlname() {
        return fWlname;
    }

    /**
     * Sets the value of the fWlname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWlname(String value) {
        this.fWlname = value;
    }

    /**
     * Gets the value of the fWlnameOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWlnameOp() {
        return fWlnameOp;
    }

    /**
     * Sets the value of the fWlnameOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWlnameOp(String value) {
        this.fWlnameOp = value;
    }

    /**
     * Gets the value of the fWltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWltype() {
        return fWltype;
    }

    /**
     * Sets the value of the fWltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWltype(String value) {
        this.fWltype = value;
    }

    /**
     * Gets the value of the fWltypeOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWltypeOp() {
        return fWltypeOp;
    }

    /**
     * Sets the value of the fWltypeOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWltypeOp(String value) {
        this.fWltypeOp = value;
    }

    /**
     * Gets the value of the fWltypecn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWltypecn() {
        return fWltypecn;
    }

    /**
     * Sets the value of the fWltypecn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWltypecn(String value) {
        this.fWltypecn = value;
    }

    /**
     * Gets the value of the fWltypecnOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWltypecnOp() {
        return fWltypecnOp;
    }

    /**
     * Sets the value of the fWltypecnOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWltypecnOp(String value) {
        this.fWltypecnOp = value;
    }

}
