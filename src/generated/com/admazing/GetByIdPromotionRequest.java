
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getByIdPromotionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getByIdPromotionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByIdPromotionRequest", propOrder = {
    "idStore",
    "idCategory"
})
public class GetByIdPromotionRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idStore;
    @XmlElement(required = true)
    protected String idCategory;

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
     * Obtiene el valor de la propiedad idCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCategory() {
        return idCategory;
    }

    /**
     * Define el valor de la propiedad idCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCategory(String value) {
        this.idCategory = value;
    }

}
