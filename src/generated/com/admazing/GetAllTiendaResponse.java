
package com.admazing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAllTiendaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAllTiendaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiendas" type="{http://admazing.com/}TiendaModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllTiendaResponse", propOrder = {
    "tiendas"
})
public class GetAllTiendaResponse {

    protected List<TiendaModel> tiendas;

    /**
     * Gets the value of the tiendas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiendas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiendas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiendaModel }
     * 
     * 
     */
    public List<TiendaModel> getTiendas() {
        if (tiendas == null) {
            tiendas = new ArrayList<TiendaModel>();
        }
        return this.tiendas;
    }

}
