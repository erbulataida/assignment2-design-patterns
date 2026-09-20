package abstractfactory;

public interface ExportFactory {
    Header createHeader();
    TableSection createTable();
    Footer createFooter();
}
