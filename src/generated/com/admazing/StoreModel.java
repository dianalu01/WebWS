
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para storeModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="storeModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCommercialArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeModel", propOrder = {
    "idStore",
    "idCommercialArea",
    "nameStore",
    "email",
    "phoneNumber"
})
public class StoreModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idStore;
    @XmlElement(required = true)
    protected String idCommercialArea;
    @XmlElement(required = true)
    protected String nameStore;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String phoneNumber;

    /**
     * Obtiene el valor de la propiedad idStore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdStore() {
        return idStore;
    }

    /**
     * Define el valor de la propiedad idStore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdStore(String value) {
        this.idStore = value;
    }

    /**
     * Obtiene el valor de la propiedad idCommercialArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCommercialArea() {
        return idCommercialArea;
    }

    /**
     * Define el valor de la propiedad idCommercialArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCommercialArea(String value) {
        this.idCommercialArea = value;
    }

    /**
     * Obtiene el valor de la propiedad nameStore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameStore() {
        return nameStore;
    }

    /**
     * Define el valor de la propiedad nameStore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameStore(String value) {
        this.nameStore = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
