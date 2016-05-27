
package com.admazing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getByIdPromocionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getByIdPromocionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTienda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCategoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByIdPromocionRequest", propOrder = {
    "idTienda",
    "idCategoria"
})
public class GetByIdPromocionRequest {

    @XmlElement(required = true)
    protected String idTienda;
    @XmlElement(required = true)
    protected String idCategoria;

    /**
     * Obtiene el valor de la propiedad idTienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTienda() {
        return idTienda;
    }

    /**
     * Define el valor de la propiedad idTienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTienda(String value) {
        this.idTienda = value;
    }

    /**
     * Obtiene el valor de la propiedad idCategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCategoria() {
        return idCategoria;
    }

    /**
     * Define el valor de la propiedad idCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCategoria(String value) {
        this.idCategoria = value;
    }

}
