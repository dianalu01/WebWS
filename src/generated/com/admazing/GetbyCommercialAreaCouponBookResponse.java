
package com.admazing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getbyCommercialAreaCouponBookResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getbyCommercialAreaCouponBookResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coupon" type="{http://admazing.com/}promotionModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getbyCommercialAreaCouponBookResponse", propOrder = {
    "coupon"
})
public class GetbyCommercialAreaCouponBookResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PromotionModel> coupon;

    /**
     * Gets the value of the coupon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionModel }
     * 
     * 
     */
    public List<PromotionModel> getCoupon() {
        if (coupon == null) {
            coupon = new ArrayList<PromotionModel>();
        }
        return this.coupon;
    }

}
