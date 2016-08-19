
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promotionTypeModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotionTypeModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPromotionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="namePromotionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotionTypeModel", propOrder = {
    "idPromotionType",
    "namePromotionType"
})
public class PromotionTypeModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idPromotionType;
    @XmlElement(required = true)
    protected String namePromotionType;

    /**
     * Obtiene el valor de la propiedad idPromotionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPromotionType() {
        return idPromotionType;
    }

    /**
     * Define el valor de la propiedad idPromotionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPromotionType(String value) {
        this.idPromotionType = value;
    }

    /**
     * Obtiene el valor de la propiedad namePromotionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePromotionType() {
        return namePromotionType;
    }

    /**
     * Define el valor de la propiedad namePromotionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePromotionType(String value) {
        this.namePromotionType = value;
    }

}
