package abstractfactory;

public class DocxTable implements TableSection {
    @Override
    public String render(){
        return "[DOCX Table] Editable Word report data";
    }
}
