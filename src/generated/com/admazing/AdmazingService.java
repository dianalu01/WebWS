package com.admazing;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2016-09-15T13:38:52.162-05:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "AdmazingService", 
                  wsdlLocation = "file:/C:/Users/Mi%20Pc/git/WebWS/src/main/webapp/WEB-INF/wsdl/Admazing.wsdl",
                  targetNamespace = "http://admazing.com/") 
public class AdmazingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://admazing.com/", "AdmazingService");
    public final static QName AdmazingPort = new QName("http://admazing.com/", "AdmazingPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Mi%20Pc/git/WebWS/src/main/webapp/WEB-INF/wsdl/Admazing.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AdmazingService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Mi%20Pc/git/WebWS/src/main/webapp/WEB-INF/wsdl/Admazing.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AdmazingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AdmazingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdmazingService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AdmazingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AdmazingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AdmazingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns AdmazingPortType
     */
    @WebEndpoint(name = "AdmazingPort")
    public AdmazingPortType getAdmazingPort() {
        return super.getPort(AdmazingPort, AdmazingPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdmazingPortType
     */
    @WebEndpoint(name = "AdmazingPort")
    public AdmazingPortType getAdmazingPort(WebServiceFeature... features) {
        return super.getPort(AdmazingPort, AdmazingPortType.class, features);
    }

}
