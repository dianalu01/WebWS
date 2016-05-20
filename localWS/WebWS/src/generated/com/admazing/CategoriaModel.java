
package com.admazing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CategoriaModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CategoriaModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcategoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoriaModel", propOrder = {
    "idcategoria",
    "nombre"
})
public class CategoriaModel {

    @XmlElement(required = true)
    protected String idcategoria;
    @XmlElement(required = true)
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad idcategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcategoria() {
        return idcategoria;
    }

    /**
     * Define el valor de la propiedad idcategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcategoria(String value) {
        this.idcategoria = value;
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

}
