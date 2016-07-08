
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para commercialAreaModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="commercialAreaModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCommercialArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nameCommercialArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commercialAreaModel", propOrder = {
    "idCommercialArea",
    "nameCommercialArea",
    "longitude",
    "latitude",
    "distance"
})
public class CommercialAreaModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idCommercialArea;
    @XmlElement(required = true)
    protected String nameCommercialArea;
    @XmlElement(required = true)
    protected String longitude;
    @XmlElement(required = true)
    protected String latitude;
    @XmlElement(required = true)
    protected String distance;

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
     * Obtiene el valor de la propiedad nameCommercialArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCommercialArea() {
        return nameCommercialArea;
    }

    /**
     * Define el valor de la propiedad nameCommercialArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCommercialArea(String value) {
        this.nameCommercialArea = value;
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

    /**
     * Obtiene el valor de la propiedad distance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Define el valor de la propiedad distance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

}
