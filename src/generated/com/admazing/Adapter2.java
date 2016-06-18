
package com.admazing;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (com.admazing.core.models.DateAdapter.unmarshal(value));
    }

    public String marshal(Date value) {
        return (com.admazing.core.models.DateAdapter.marshal(value));
    }

}
