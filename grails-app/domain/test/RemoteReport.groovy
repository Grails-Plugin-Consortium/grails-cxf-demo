package test

import javax.xml.bind.annotation.*

@XmlRootElement(name='remoteReport')
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = ['errorCode','errorMessage','reportId'])
class RemoteReport {
    @XmlElement
    Long errorCode

    @XmlElement
    String errorMessage

    @XmlElement
    Long reportId

    static constraints = {
    }
}

