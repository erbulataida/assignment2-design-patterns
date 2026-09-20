package abstractfactory;

import java.lang.annotation.Inherited;

public class PdfExportFactory implements ExportFactory{
    @Override
    public Header createHeader(){
        return new PdfHeader();
    }
    @Override
    public TableSection createTable(){
        return new PdfTable();
    }
    @Override
    public Footer createFooter(){
        return new PdfFooter();
    }

}
