package abstractfactory;

public class DocxExportFactory implements ExportFactory{
    @Override
    public Header createHeader(){
        return new DocxHeader();
    }
    @Override
    public TableSection createTable(){
        return new DocxTable();
    }
    @Override
    public Footer createFooter(){
        return new DocxFooter();
    }
}
