
package com.admazing;

import java.sql.Time;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para AccesoModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccesoModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idacceso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idusuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zonacomercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="horaacceso" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccesoModel", propOrder = {
    "idacceso",
    "idusuario",
    "zonacomercial",
    "fecha",
    "horaacceso"
})
public class AccesoModel {

    @XmlElement(required = true)
    protected String idacceso;
    @XmlElement(required = true)
    protected String idusuario;
    @XmlElement(required = true)
    protected String zonacomercial;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected Date fecha;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    @XmlJavaTypeAdapter(TimeAdapter.class)
    protected Time horaacceso;

    /**
     * Obtiene el valor de la propiedad idacceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdacceso() {
        return idacceso;
    }

    /**
     * Define el valor de la propiedad idacceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdacceso(String value) {
        this.idacceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdusuario() {
        return idusuario;
    }

    /**
     * Define el valor de la propiedad idusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdusuario(String value) {
        this.idusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad zonacomercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZonacomercial() {
        return zonacomercial;
    }

    /**
     * Define el valor de la propiedad zonacomercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZonacomercial(String value) {
        this.zonacomercial = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(Date value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad horaacceso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Time getHoraacceso() {
        return horaacceso;
    }

    /**
     * Define el valor de la propiedad horaacceso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraacceso(Time value) {
        this.horaacceso = value;
    }

}
