
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promotionUseModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotionUseModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idAccess" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idPromotion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotionUseModel", propOrder = {
    "idUse",
    "idAccess",
    "idPromotion"
})
public class PromotionUseModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idUse;
    @XmlElement(required = true)
    protected String idAccess;
    @XmlElement(required = true)
    protected String idPromotion;

    /**
     * Obtiene el valor de la propiedad idUse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUse() {
        return idUse;
    }

    /**
     * Define el valor de la propiedad idUse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUse(String value) {
        this.idUse = value;
    }

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
     * Obtiene el valor de la propiedad idPromotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPromotion() {
        return idPromotion;
    }

    /**
     * Define el valor de la propiedad idPromotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPromotion(String value) {
        this.idPromotion = value;
    }

}
