package test

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlAttribute
import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
@XmlAccessorType(XmlAccessType.NONE)
class Page implements Serializable {
    @XmlAttribute
    Long id
    String name
    Integer number
    static mapping = {
        version true
    }
}