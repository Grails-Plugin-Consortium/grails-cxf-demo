package test

import org.grails.cxf.utils.EndpointType

//this SHOULD get wired up as a service as it has the expose static property
class CarService {

    static expose = [EndpointType.SIMPLE]
    static excludes = ['dontHonk']
    static soap12 = true

    String honkHorn() {
        'HONK'
    }

    String dontHonk(){
        'BEEP'
    }

    String stop(){
        'BRAKES'
    }

    String start(){
        'GAS'
    }
}
