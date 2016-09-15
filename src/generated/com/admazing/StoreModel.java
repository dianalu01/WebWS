
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
 *         &lt;element name="imageStore" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "phoneNumber",
    "imageStore",
    "level",
    "longitude",
    "latitude"
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
    @XmlElement(required = true)
    protected byte[] imageStore;
    @XmlElement(required = true)
    protected String level;
    @XmlElement(required = true)
    protected String longitude;
    @XmlElement(required = true)
    protected String latitude;

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

    /**
     * Obtiene el valor de la propiedad imageStore.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageStore() {
        return imageStore;
    }

    /**
     * Define el valor de la propiedad imageStore.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageStore(byte[] value) {
        this.imageStore = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

}
