package factorymethod;

public abstract class ReportCreator {
    protected abstract Report createReport();
    public void prepareAndDisplayReport() {
        Report report = createReport();
        System.out.println("Preparing:" + report.getTitle());
        System.out.println(report.generateContent());
        System.out.println("Report is ready");
        System.out.println();
    }
}
