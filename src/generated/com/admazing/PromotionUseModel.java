
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
 *         &lt;element name="idPromotionUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idPromotionUse",
    "idUser",
    "idPromotion"
})
public class PromotionUseModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idPromotionUse;
    @XmlElement(required = true)
    protected String idUser;
    @XmlElement(required = true)
    protected String idPromotion;

    /**
     * Obtiene el valor de la propiedad idPromotionUse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPromotionUse() {
        return idPromotionUse;
    }

    /**
     * Define el valor de la propiedad idPromotionUse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPromotionUse(String value) {
        this.idPromotionUse = value;
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
