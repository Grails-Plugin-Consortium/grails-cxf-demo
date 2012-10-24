package test

import org.grails.cxf.utils.EndpointType

import javax.jws.WebMethod
import javax.jws.WebResult

class RemoteReportService {

    static expose = EndpointType.JAX_WS

    @WebResult(name = 'remoteReport')
    @WebMethod(operationName = 'getMeSomeReports')
    List<RemoteReport> getMeSomeReports() {
        List<RemoteReport> reports = []
        reports << RemoteReport.findOrSaveWhere(reportId: 1, errorCode: 1, errorMessage: 'Binders full of women.')
        reports << RemoteReport.findOrSaveWhere(reportId: 2, errorCode: 1, errorMessage: 'Binder?! I hardly know her!')
        reports
    }
}
