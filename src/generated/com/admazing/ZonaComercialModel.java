
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ZonaComercialModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ZonaComercialModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idzonacomercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZonaComercialModel", propOrder = {
    "idzonacomercial",
    "nombre",
    "longitud",
    "latitud",
    "distancia"
})
public class ZonaComercialModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idzonacomercial;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String longitud;
    @XmlElement(required = true)
    protected String latitud;
    @XmlElement(required = true)
    protected String distancia;

    /**
     * Obtiene el valor de la propiedad idzonacomercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdzonacomercial() {
        return idzonacomercial;
    }

    /**
     * Define el valor de la propiedad idzonacomercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdzonacomercial(String value) {
        this.idzonacomercial = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitud(String value) {
        this.longitud = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitud(String value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad distancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistancia() {
        return distancia;
    }

    /**
     * Define el valor de la propiedad distancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistancia(String value) {
        this.distancia = value;
    }

}
