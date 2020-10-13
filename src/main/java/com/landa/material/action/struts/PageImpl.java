
package com.landa.material.action.struts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pageImpl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pageImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endRowPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isFristPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isLastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxRecords" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startRowPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageImpl", propOrder = {
    "currentPage",
    "endRowPosition",
    "isFristPage",
    "isLastPage",
    "maxRecords",
    "pageSize",
    "startRowPosition",
    "totalPage",
    "totalRecords"
})
@XmlSeeAlso({
    PageInfoView.class
})
public class PageImpl {

    protected int currentPage;
    protected int endRowPosition;
    protected boolean isFristPage;
    protected boolean isLastPage;
    protected int maxRecords;
    protected int pageSize;
    protected int startRowPosition;
    protected int totalPage;
    protected int totalRecords;

    /**
     * Gets the value of the currentPage property.
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Gets the value of the endRowPosition property.
     * 
     */
    public int getEndRowPosition() {
        return endRowPosition;
    }

    /**
     * Sets the value of the endRowPosition property.
     * 
     */
    public void setEndRowPosition(int value) {
        this.endRowPosition = value;
    }

    /**
     * Gets the value of the isFristPage property.
     * 
     */
    public boolean isIsFristPage() {
        return isFristPage;
    }

    /**
     * Sets the value of the isFristPage property.
     * 
     */
    public void setIsFristPage(boolean value) {
        this.isFristPage = value;
    }

    /**
     * Gets the value of the isLastPage property.
     * 
     */
    public boolean isIsLastPage() {
        return isLastPage;
    }

    /**
     * Sets the value of the isLastPage property.
     * 
     */
    public void setIsLastPage(boolean value) {
        this.isLastPage = value;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     */
    public int getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     */
    public void setMaxRecords(int value) {
        this.maxRecords = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the startRowPosition property.
     * 
     */
    public int getStartRowPosition() {
        return startRowPosition;
    }

    /**
     * Sets the value of the startRowPosition property.
     * 
     */
    public void setStartRowPosition(int value) {
        this.startRowPosition = value;
    }

    /**
     * Gets the value of the totalPage property.
     * 
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * Sets the value of the totalPage property.
     * 
     */
    public void setTotalPage(int value) {
        this.totalPage = value;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     */
    public int getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     */
    public void setTotalRecords(int value) {
        this.totalRecords = value;
    }

}
