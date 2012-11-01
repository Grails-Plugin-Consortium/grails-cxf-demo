package test

import org.grails.cxf.utils.EndpointType

import javax.jws.WebMethod
import javax.jws.WebResult
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter
import org.grails.cxf.adapter.GrailsCxfMapAdapter

class RemoteReportService {

    static expose = EndpointType.JAX_WS

    @WebResult(name = 'remoteReport')
    @WebMethod(operationName = 'getMeSomeReports')
    List<RemoteReport> getMeSomeReports() {
        List<RemoteReport> reports = []
        reports << RemoteReport.findOrSaveWhere(reportId: 1L, errorCode: 1L, errorMessage: 'Binders full of women.')
        reports << RemoteReport.findOrSaveWhere(reportId: 2L, errorCode: 1L, errorMessage: 'Binder?! I hardly know her!')
        reports
    }

    @XmlJavaTypeAdapter(GrailsCxfMapAdapter.class)
    @WebResult(name='entires')
    @WebMethod(operationName = 'getMaps')
    Map<String, String> getMeMaps() {
        return ['Colombia': 'Yummy', 'Ethiopia': 'Drink']
    }
}
