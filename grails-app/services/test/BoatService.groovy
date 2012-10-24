package test

import javax.jws.WebMethod
import javax.jws.WebResult

class BoatService {

    //jsx_ws requires @WebMethod for exposure of service methods
    static expose = ['cxfjax']
    static soap12 = true

    def truckService

    @WebResult(name = 'sound')
    @WebMethod(operationName = 'waterOnFreeway')
    String waterOnFreeway() {
        return truckService.crushCars()
    }

    @WebMethod
    String waterski() {
        'SKI'
    }

    String fish() {
        'FISH'
    }
}
