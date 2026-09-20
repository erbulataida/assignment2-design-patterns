package factorymethod;

public class SummaryReportCreator extends ReportCreator{
    @Override
    protected Report createReport(){
        return new SummaryReport();
    }
}
