
package com.admazing;

import java.io.Serializable;
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
 *         &lt;element name="store" type="{http://admazing.com/}storeModel" minOccurs="0"/>
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
    protected StoreModel store;

    /**
     * Obtiene el valor de la propiedad store.
     * 
     * @return
     *     possible object is
     *     {@link StoreModel }
     *     
     */
    public StoreModel getStore() {
        return store;
    }

    /**
     * Define el valor de la propiedad store.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreModel }
     *     
     */
    public void setStore(StoreModel value) {
        this.store = value;
    }

}
