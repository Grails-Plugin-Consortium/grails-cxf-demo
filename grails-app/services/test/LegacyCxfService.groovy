package test

import org.grails.cxf.utils.EndpointType

class LegacyCxfService {

    static expose = [EndpointType.JAX_WS]
    static soap12 = true

    String legacyMethod(String param) {
        return "legacy ${param}".toString()
    }
}
