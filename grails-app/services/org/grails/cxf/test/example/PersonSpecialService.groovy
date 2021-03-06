package org.grails.cxf.test.example

import grails.transaction.Transactional
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint(address='/special/person')
class PersonSpecialService {

	@WebMethod
	@WebResult(name = "Person", targetNamespace = "")
	Person createPerson(@WebParam(name = 'name') String name) {
		Person.findOrSaveWhere(name: name)
	}
}
