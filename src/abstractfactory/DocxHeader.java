package abstractfactory;

public class DocxHeader implements Header{
    @Override
    public String render(){
        return "[DOCX Header] AITU Performance Report";
    }
}
