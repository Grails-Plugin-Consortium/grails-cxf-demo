package test

import javax.jws.WebMethod
import javax.jws.WebResult
import org.grails.cxf.utils.EndpointType

class PageService {

    static expose = [EndpointType.JAX_WS]
    static soap12 = true

    @WebResult(name = 'page')
    @WebMethod(operationName = 'getMeSomePages')
    List<Long> getMeSomePages() {
        List<Page> pages = []
        pages << new Page(name: "test1", number: 2, version: 1).save()
        pages << new Page(name: "hihi", number: 8, version: 1).save()
        pages << new Page(name: "hoho", number: 32, version: 1).save()
        pages.collect{ it.id }
    }
}
