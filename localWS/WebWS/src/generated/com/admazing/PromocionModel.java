
package com.admazing;

import java.awt.Image;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para PromocionModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromocionModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idpromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipopromocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tienda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="fechainicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fechafin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="imagenpromo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromocionModel", propOrder = {
    "idpromocion",
    "categoria",
    "tipopromocion",
    "tienda",
    "descripcion",
    "fechainicio",
    "fechafin",
    "imagenpromo"
})
public class PromocionModel {

    @XmlElement(required = true)
    protected String idpromocion;
    @XmlElement(required = true)
    protected String categoria;
    @XmlElement(required = true)
    protected String tipopromocion;
    @XmlElement(required = true)
    protected String tienda;
    @XmlElement(required = true)
    protected BigInteger descripcion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechainicio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechafin;
    @XmlMimeType("image/jpeg")
    protected List<Image> imagenpromo;

    /**
     * Obtiene el valor de la propiedad idpromocion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdpromocion() {
        return idpromocion;
    }

    /**
     * Define el valor de la propiedad idpromocion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdpromocion(String value) {
        this.idpromocion = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopromocion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipopromocion() {
        return tipopromocion;
    }

    /**
     * Define el valor de la propiedad tipopromocion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipopromocion(String value) {
        this.tipopromocion = value;
    }

    /**
     * Obtiene el valor de la propiedad tienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTienda() {
        return tienda;
    }

    /**
     * Define el valor de la propiedad tienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTienda(String value) {
        this.tienda = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDescripcion(BigInteger value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechainicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechainicio() {
        return fechainicio;
    }

    /**
     * Define el valor de la propiedad fechainicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechainicio(XMLGregorianCalendar value) {
        this.fechainicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechafin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechafin() {
        return fechafin;
    }

    /**
     * Define el valor de la propiedad fechafin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechafin(XMLGregorianCalendar value) {
        this.fechafin = value;
    }

    /**
     * Gets the value of the imagenpromo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagenpromo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagenpromo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Image }
     * 
     * 
     */
    public List<Image> getImagenpromo() {
        if (imagenpromo == null) {
            imagenpromo = new ArrayList<Image>();
        }
        return this.imagenpromo;
    }

}
