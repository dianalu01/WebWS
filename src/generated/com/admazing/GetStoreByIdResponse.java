
package com.admazing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStoreByIdResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getStoreByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="store" type="{http://admazing.com/}storeModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStoreByIdResponse", propOrder = {
    "store"
})
public class GetStoreByIdResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<StoreModel> store;

    /**
     * Gets the value of the store property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the store property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreModel }
     * 
     * 
     */
    public List<StoreModel> getStore() {
        if (store == null) {
            store = new ArrayList<StoreModel>();
        }
        return this.store;
    }

}
