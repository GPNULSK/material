
package com.landa.material.action.struts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for hiUserPageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hiUserPageInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://struts.action.material.landa.com/}pageInfoView">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{http://struts.action.material.landa.com/}hiUserPageInfo" minOccurs="0"/>
 *         &lt;element name="f_accountEnabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_accountEnabled_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_accountLocked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_accountLocked_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_address_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_country" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_country_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_credentialsExpired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_credentialsExpired_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_deleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_deleted_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_description_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_expiredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="f_expiredDate01" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="f_expiredDate01_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_expiredDate_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_fullName_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_gender" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_gender_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_id_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_mail_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_mobile_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_notifyMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_notifyMode_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_password_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_phone_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_sSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_sSN_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_timeZone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_timeZone_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_userMgrType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="f_userMgrType_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_userName_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f_zip_op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://struts.action.material.landa.com/}hiOrgPageInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hiUserPageInfo", propOrder = {
    "creator",
    "fAccountEnabled",
    "fAccountEnabledOp",
    "fAccountLocked",
    "fAccountLockedOp",
    "fAddress",
    "fAddressOp",
    "fCountry",
    "fCountryOp",
    "fCredentialsExpired",
    "fCredentialsExpiredOp",
    "fDeleted",
    "fDeletedOp",
    "fDescription",
    "fDescriptionOp",
    "fExpiredDate",
    "fExpiredDate01",
    "fExpiredDate01Op",
    "fExpiredDateOp",
    "fFullName",
    "fFullNameOp",
    "fGender",
    "fGenderOp",
    "fId",
    "fIdOp",
    "fMail",
    "fMailOp",
    "fMobile",
    "fMobileOp",
    "fNotifyMode",
    "fNotifyModeOp",
    "fPassword",
    "fPasswordOp",
    "fPhone",
    "fPhoneOp",
    "fssn",
    "fssnOp",
    "fTimeZone",
    "fTimeZoneOp",
    "fUserMgrType",
    "fUserMgrTypeOp",
    "fUserName",
    "fUserNameOp",
    "fZip",
    "fZipOp",
    "org"
})
public class HiUserPageInfo
    extends PageInfoView
{

    protected HiUserPageInfo creator;
    @XmlElement(name = "f_accountEnabled")
    protected Integer fAccountEnabled;
    @XmlElement(name = "f_accountEnabled_op")
    protected String fAccountEnabledOp;
    @XmlElement(name = "f_accountLocked")
    protected Integer fAccountLocked;
    @XmlElement(name = "f_accountLocked_op")
    protected String fAccountLockedOp;
    @XmlElement(name = "f_address")
    protected String fAddress;
    @XmlElement(name = "f_address_op")
    protected String fAddressOp;
    @XmlElement(name = "f_country")
    protected Integer fCountry;
    @XmlElement(name = "f_country_op")
    protected String fCountryOp;
    @XmlElement(name = "f_credentialsExpired")
    protected Integer fCredentialsExpired;
    @XmlElement(name = "f_credentialsExpired_op")
    protected String fCredentialsExpiredOp;
    @XmlElement(name = "f_deleted")
    protected Integer fDeleted;
    @XmlElement(name = "f_deleted_op")
    protected String fDeletedOp;
    @XmlElement(name = "f_description")
    protected String fDescription;
    @XmlElement(name = "f_description_op")
    protected String fDescriptionOp;
    @XmlElement(name = "f_expiredDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fExpiredDate;
    @XmlElement(name = "f_expiredDate01")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fExpiredDate01;
    @XmlElement(name = "f_expiredDate01_op")
    protected String fExpiredDate01Op;
    @XmlElement(name = "f_expiredDate_op")
    protected String fExpiredDateOp;
    @XmlElement(name = "f_fullName")
    protected String fFullName;
    @XmlElement(name = "f_fullName_op")
    protected String fFullNameOp;
    @XmlElement(name = "f_gender")
    protected Integer fGender;
    @XmlElement(name = "f_gender_op")
    protected String fGenderOp;
    @XmlElement(name = "f_id")
    protected Integer fId;
    @XmlElement(name = "f_id_op")
    protected String fIdOp;
    @XmlElement(name = "f_mail")
    protected String fMail;
    @XmlElement(name = "f_mail_op")
    protected String fMailOp;
    @XmlElement(name = "f_mobile")
    protected String fMobile;
    @XmlElement(name = "f_mobile_op")
    protected String fMobileOp;
    @XmlElement(name = "f_notifyMode")
    protected String fNotifyMode;
    @XmlElement(name = "f_notifyMode_op")
    protected String fNotifyModeOp;
    @XmlElement(name = "f_password")
    protected String fPassword;
    @XmlElement(name = "f_password_op")
    protected String fPasswordOp;
    @XmlElement(name = "f_phone")
    protected String fPhone;
    @XmlElement(name = "f_phone_op")
    protected String fPhoneOp;
    @XmlElement(name = "f_sSN")
    protected String fssn;
    @XmlElement(name = "f_sSN_op")
    protected String fssnOp;
    @XmlElement(name = "f_timeZone")
    protected Integer fTimeZone;
    @XmlElement(name = "f_timeZone_op")
    protected String fTimeZoneOp;
    @XmlElement(name = "f_userMgrType")
    protected Integer fUserMgrType;
    @XmlElement(name = "f_userMgrType_op")
    protected String fUserMgrTypeOp;
    @XmlElement(name = "f_userName")
    protected String fUserName;
    @XmlElement(name = "f_userName_op")
    protected String fUserNameOp;
    @XmlElement(name = "f_zip")
    protected String fZip;
    @XmlElement(name = "f_zip_op")
    protected String fZipOp;
    protected HiOrgPageInfo org;

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
     * Gets the value of the fAccountEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFAccountEnabled() {
        return fAccountEnabled;
    }

    /**
     * Sets the value of the fAccountEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFAccountEnabled(Integer value) {
        this.fAccountEnabled = value;
    }

    /**
     * Gets the value of the fAccountEnabledOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAccountEnabledOp() {
        return fAccountEnabledOp;
    }

    /**
     * Sets the value of the fAccountEnabledOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAccountEnabledOp(String value) {
        this.fAccountEnabledOp = value;
    }

    /**
     * Gets the value of the fAccountLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFAccountLocked() {
        return fAccountLocked;
    }

    /**
     * Sets the value of the fAccountLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFAccountLocked(Integer value) {
        this.fAccountLocked = value;
    }

    /**
     * Gets the value of the fAccountLockedOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAccountLockedOp() {
        return fAccountLockedOp;
    }

    /**
     * Sets the value of the fAccountLockedOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAccountLockedOp(String value) {
        this.fAccountLockedOp = value;
    }

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
     * Gets the value of the fCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFCountry() {
        return fCountry;
    }

    /**
     * Sets the value of the fCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFCountry(Integer value) {
        this.fCountry = value;
    }

    /**
     * Gets the value of the fCountryOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCountryOp() {
        return fCountryOp;
    }

    /**
     * Sets the value of the fCountryOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCountryOp(String value) {
        this.fCountryOp = value;
    }

    /**
     * Gets the value of the fCredentialsExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFCredentialsExpired() {
        return fCredentialsExpired;
    }

    /**
     * Sets the value of the fCredentialsExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFCredentialsExpired(Integer value) {
        this.fCredentialsExpired = value;
    }

    /**
     * Gets the value of the fCredentialsExpiredOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCredentialsExpiredOp() {
        return fCredentialsExpiredOp;
    }

    /**
     * Sets the value of the fCredentialsExpiredOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCredentialsExpiredOp(String value) {
        this.fCredentialsExpiredOp = value;
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
     * Gets the value of the fExpiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFExpiredDate() {
        return fExpiredDate;
    }

    /**
     * Sets the value of the fExpiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFExpiredDate(XMLGregorianCalendar value) {
        this.fExpiredDate = value;
    }

    /**
     * Gets the value of the fExpiredDate01 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFExpiredDate01() {
        return fExpiredDate01;
    }

    /**
     * Sets the value of the fExpiredDate01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFExpiredDate01(XMLGregorianCalendar value) {
        this.fExpiredDate01 = value;
    }

    /**
     * Gets the value of the fExpiredDate01Op property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFExpiredDate01Op() {
        return fExpiredDate01Op;
    }

    /**
     * Sets the value of the fExpiredDate01Op property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFExpiredDate01Op(String value) {
        this.fExpiredDate01Op = value;
    }

    /**
     * Gets the value of the fExpiredDateOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFExpiredDateOp() {
        return fExpiredDateOp;
    }

    /**
     * Sets the value of the fExpiredDateOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFExpiredDateOp(String value) {
        this.fExpiredDateOp = value;
    }

    /**
     * Gets the value of the fFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFullName() {
        return fFullName;
    }

    /**
     * Sets the value of the fFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFullName(String value) {
        this.fFullName = value;
    }

    /**
     * Gets the value of the fFullNameOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFFullNameOp() {
        return fFullNameOp;
    }

    /**
     * Sets the value of the fFullNameOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFFullNameOp(String value) {
        this.fFullNameOp = value;
    }

    /**
     * Gets the value of the fGender property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFGender() {
        return fGender;
    }

    /**
     * Sets the value of the fGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFGender(Integer value) {
        this.fGender = value;
    }

    /**
     * Gets the value of the fGenderOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFGenderOp() {
        return fGenderOp;
    }

    /**
     * Sets the value of the fGenderOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFGenderOp(String value) {
        this.fGenderOp = value;
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
     * Gets the value of the fMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFMail() {
        return fMail;
    }

    /**
     * Sets the value of the fMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFMail(String value) {
        this.fMail = value;
    }

    /**
     * Gets the value of the fMailOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFMailOp() {
        return fMailOp;
    }

    /**
     * Sets the value of the fMailOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFMailOp(String value) {
        this.fMailOp = value;
    }

    /**
     * Gets the value of the fMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFMobile() {
        return fMobile;
    }

    /**
     * Sets the value of the fMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFMobile(String value) {
        this.fMobile = value;
    }

    /**
     * Gets the value of the fMobileOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFMobileOp() {
        return fMobileOp;
    }

    /**
     * Sets the value of the fMobileOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFMobileOp(String value) {
        this.fMobileOp = value;
    }

    /**
     * Gets the value of the fNotifyMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNotifyMode() {
        return fNotifyMode;
    }

    /**
     * Sets the value of the fNotifyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNotifyMode(String value) {
        this.fNotifyMode = value;
    }

    /**
     * Gets the value of the fNotifyModeOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFNotifyModeOp() {
        return fNotifyModeOp;
    }

    /**
     * Sets the value of the fNotifyModeOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFNotifyModeOp(String value) {
        this.fNotifyModeOp = value;
    }

    /**
     * Gets the value of the fPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPassword() {
        return fPassword;
    }

    /**
     * Sets the value of the fPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPassword(String value) {
        this.fPassword = value;
    }

    /**
     * Gets the value of the fPasswordOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPasswordOp() {
        return fPasswordOp;
    }

    /**
     * Sets the value of the fPasswordOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPasswordOp(String value) {
        this.fPasswordOp = value;
    }

    /**
     * Gets the value of the fPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPhone() {
        return fPhone;
    }

    /**
     * Sets the value of the fPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPhone(String value) {
        this.fPhone = value;
    }

    /**
     * Gets the value of the fPhoneOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPhoneOp() {
        return fPhoneOp;
    }

    /**
     * Sets the value of the fPhoneOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPhoneOp(String value) {
        this.fPhoneOp = value;
    }

    /**
     * Gets the value of the fssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSSN() {
        return fssn;
    }

    /**
     * Sets the value of the fssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSSN(String value) {
        this.fssn = value;
    }

    /**
     * Gets the value of the fssnOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSSNOp() {
        return fssnOp;
    }

    /**
     * Sets the value of the fssnOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSSNOp(String value) {
        this.fssnOp = value;
    }

    /**
     * Gets the value of the fTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFTimeZone() {
        return fTimeZone;
    }

    /**
     * Sets the value of the fTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFTimeZone(Integer value) {
        this.fTimeZone = value;
    }

    /**
     * Gets the value of the fTimeZoneOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTimeZoneOp() {
        return fTimeZoneOp;
    }

    /**
     * Sets the value of the fTimeZoneOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTimeZoneOp(String value) {
        this.fTimeZoneOp = value;
    }

    /**
     * Gets the value of the fUserMgrType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFUserMgrType() {
        return fUserMgrType;
    }

    /**
     * Sets the value of the fUserMgrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFUserMgrType(Integer value) {
        this.fUserMgrType = value;
    }

    /**
     * Gets the value of the fUserMgrTypeOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUserMgrTypeOp() {
        return fUserMgrTypeOp;
    }

    /**
     * Sets the value of the fUserMgrTypeOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUserMgrTypeOp(String value) {
        this.fUserMgrTypeOp = value;
    }

    /**
     * Gets the value of the fUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUserName() {
        return fUserName;
    }

    /**
     * Sets the value of the fUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUserName(String value) {
        this.fUserName = value;
    }

    /**
     * Gets the value of the fUserNameOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUserNameOp() {
        return fUserNameOp;
    }

    /**
     * Sets the value of the fUserNameOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUserNameOp(String value) {
        this.fUserNameOp = value;
    }

    /**
     * Gets the value of the fZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFZip() {
        return fZip;
    }

    /**
     * Sets the value of the fZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFZip(String value) {
        this.fZip = value;
    }

    /**
     * Gets the value of the fZipOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFZipOp() {
        return fZipOp;
    }

    /**
     * Sets the value of the fZipOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFZipOp(String value) {
        this.fZipOp = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link HiOrgPageInfo }
     *     
     */
    public HiOrgPageInfo getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link HiOrgPageInfo }
     *     
     */
    public void setOrg(HiOrgPageInfo value) {
        this.org = value;
    }

}
