package abstractfactory;

public class DocxFooter implements Footer{
    @Override
    public String render(){
        return "[DOCX Footer] Automatic page number";
    }
}
