package com.gpc.demo

import grails.transaction.Transactional
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint(name="Demo2", port="DemoPort")
class DemoService {

    @WebMethod
    @WebResult
    String demoMethod() {
        return "demo"
    }
}
