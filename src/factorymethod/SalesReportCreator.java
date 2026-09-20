package factorymethod;

public class SalesReportCreator extends ReportCreator{
    @Override
    protected Report createReport(){
        return new SalesReport();
    }
}
