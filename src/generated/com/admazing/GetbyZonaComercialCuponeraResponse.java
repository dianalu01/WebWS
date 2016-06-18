
package com.admazing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getbyZonaComercialCuponeraResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getbyZonaComercialCuponeraResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cupones" type="{http://admazing.com/}PromocionModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getbyZonaComercialCuponeraResponse", propOrder = {
    "cupones"
})
public class GetbyZonaComercialCuponeraResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<PromocionModel> cupones;

    /**
     * Gets the value of the cupones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cupones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCupones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromocionModel }
     * 
     * 
     */
    public List<PromocionModel> getCupones() {
        if (cupones == null) {
            cupones = new ArrayList<PromocionModel>();
        }
        return this.cupones;
    }

}
