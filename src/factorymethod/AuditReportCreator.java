package factorymethod;

public class AuditReportCreator extends ReportCreator{
    @Override
    protected Report createReport(){
        return new AuditReport();
    }
}
