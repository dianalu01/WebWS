
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promotionDetailedModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotionDetailedModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promotion" type="{http://admazing.com/}promotionModel"/>
 *         &lt;element name="product" type="{http://admazing.com/}productModel"/>
 *         &lt;element name="promotionType" type="{http://admazing.com/}promotionTypeModel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotionDetailedModel", propOrder = {
    "promotion",
    "product",
    "promotionType"
})
public class PromotionDetailedModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PromotionModel promotion;
    @XmlElement(required = true)
    protected ProductModel product;
    @XmlElement(required = true)
    protected PromotionTypeModel promotionType;

    /**
     * Obtiene el valor de la propiedad promotion.
     * 
     * @return
     *     possible object is
     *     {@link PromotionModel }
     *     
     */
    public PromotionModel getPromotion() {
        return promotion;
    }

    /**
     * Define el valor de la propiedad promotion.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionModel }
     *     
     */
    public void setPromotion(PromotionModel value) {
        this.promotion = value;
    }

    /**
     * Obtiene el valor de la propiedad product.
     * 
     * @return
     *     possible object is
     *     {@link ProductModel }
     *     
     */
    public ProductModel getProduct() {
        return product;
    }

    /**
     * Define el valor de la propiedad product.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductModel }
     *     
     */
    public void setProduct(ProductModel value) {
        this.product = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionType.
     * 
     * @return
     *     possible object is
     *     {@link PromotionTypeModel }
     *     
     */
    public PromotionTypeModel getPromotionType() {
        return promotionType;
    }

    /**
     * Define el valor de la propiedad promotionType.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionTypeModel }
     *     
     */
    public void setPromotionType(PromotionTypeModel value) {
        this.promotionType = value;
    }

}
