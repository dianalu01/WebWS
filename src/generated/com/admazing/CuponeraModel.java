
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CuponeraModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CuponeraModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idusuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idcuponera" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promocion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuponeraModel", propOrder = {
    "idusuario",
    "idcuponera",
    "promocion"
})
public class CuponeraModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idusuario;
    @XmlElement(required = true)
    protected String idcuponera;
    @XmlElement(required = true)
    protected String promocion;

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
     * Obtiene el valor de la propiedad idcuponera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcuponera() {
        return idcuponera;
    }

    /**
     * Define el valor de la propiedad idcuponera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcuponera(String value) {
        this.idcuponera = value;
    }

    /**
     * Obtiene el valor de la propiedad promocion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromocion() {
        return promocion;
    }

    /**
     * Define el valor de la propiedad promocion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromocion(String value) {
        this.promocion = value;
    }

}
