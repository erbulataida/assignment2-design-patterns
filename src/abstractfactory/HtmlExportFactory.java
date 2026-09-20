package abstractfactory;

public class HtmlExportFactory implements ExportFactory{
    @Override
    public Header createHeader(){
        return new HtmlHeader();
    }
    @Override
    public TableSection createTable(){
        return new HtmlTable();
    }
    @Override
    public Footer createFooter(){
        return new HtmlFooter();
    }
}
