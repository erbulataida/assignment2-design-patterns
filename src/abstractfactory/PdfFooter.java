package abstractfactory;

public class PdfFooter implements Footer{
    @Override
    public String render(){
        return "[PDF Footer] Page 1 of 1";
    }
}
