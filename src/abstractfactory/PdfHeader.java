package abstractfactory;

public class PdfHeader implements Header{
    @Override
    public String render(){
        return "[PDF Header] AITU Performance REport"
    }
}
