package abstractfactory;

public class ExportApplication {
    private final Header header;
    private final TableSection table;
    private final Footer footer;

    public ExportApplication(ExportFactory factory) {
        this.header = factory.createHeader();
        this.table = factory.createTable();
        this.footer = factory.createFooter();
    }
    public void exportReport(){
        System.out.println(header.render());
        System.out.println(table.render());
        System.out.println(footer.render());
    }

}
