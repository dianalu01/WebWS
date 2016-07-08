
package com.admazing;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para accessModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="accessModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAccess" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCommercialArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessModel", propOrder = {
    "idAccess",
    "idUser",
    "idCommercialArea",
    "date",
    "time"
})
public class AccessModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idAccess;
    @XmlElement(required = true)
    protected String idUser;
    @XmlElement(required = true)
    protected String idCommercialArea;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date date;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "time")
    protected Time time;

    /**
     * Obtiene el valor de la propiedad idAccess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAccess() {
        return idAccess;
    }

    /**
     * Define el valor de la propiedad idAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAccess(String value) {
        this.idAccess = value;
    }

    /**
     * Obtiene el valor de la propiedad idUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * Define el valor de la propiedad idUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUser(String value) {
        this.idUser = value;
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
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

}
