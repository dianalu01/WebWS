
package com.admazing;

import java.sql.Time;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Time>
{


    public Time unmarshal(String value) {
        return (com.admazing.core.models.TimeAdapter.unmarshal(value));
    }

    public String marshal(Time value) {
        return (com.admazing.core.models.TimeAdapter.marshal(value));
    }

}
