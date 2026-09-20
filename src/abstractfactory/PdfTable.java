package abstractfactory;

public class PdfTable implements TableSection{
    @Override
    public String render(){
        return "[PDF Table] Fixed-layout report data";
    }
}
