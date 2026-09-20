package factorymethod;

public class main {
    public static void main(String[] args){
        ReportCreator[] creators = {
            new SalesReportCreator(),
            new AuditReportCreator(),
            new SummaryReportCreator()
        };
        for (ReportCreator creator : creators) {
            creator.prepareAndDisplayReport();
        }
    }
}
