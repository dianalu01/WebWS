
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
 *         &lt;element name="couponDetailed" type="{http://admazing.com/}promotionDetailedModel" maxOccurs="unbounded" minOccurs="0"/>
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
    "couponDetailed"
})
public class GetbyCommercialAreaCouponBookResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PromotionDetailedModel> couponDetailed;

    /**
     * Gets the value of the couponDetailed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponDetailed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponDetailed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionDetailedModel }
     * 
     * 
     */
    public List<PromotionDetailedModel> getCouponDetailed() {
        if (couponDetailed == null) {
            couponDetailed = new ArrayList<PromotionDetailedModel>();
        }
        return this.couponDetailed;
    }

}
