package io.github.agroportal.ncboproxy.model;


import javax.servlet.http.HttpServletRequest;
import java.util.Properties;

public interface APIContext {
    String APIKEY_CONFIGURATION_KEY = "apikey";
    String SERVER_ENCODING = "server.encoding";
    String ONTOLOGIES_API_URI = "ontologiesApiURI";

    String getApiKey();
    String getServerEncoding();
    String getRestAPIURL();
    String getMethod();

    static APIContext create(final Properties proxyProperties, final HttpServletRequest servletRequest){
        return new APIContextImpl(proxyProperties,servletRequest);
    }
}
