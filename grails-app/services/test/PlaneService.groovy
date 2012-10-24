package test

import javax.jws.WebMethod
import javax.jws.WebService

@WebService
class PlaneService {

    //todo: This will not work unless expose is defined as the default is to not ignore anything... not sure why
    static excludes = ['ignoreMe']
    static soap12 = true

    @WebMethod Boolean canFly(){
        true
    }

    @WebMethod Boolean canFloat(){
        false
    }

    String ignoreMe(Boolean bool){
        bool.toString()
    }
}
