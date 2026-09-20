package abstractfactory;

public class HtmlHeader implements Header{
    @Override
    public String render(){
        return "<header><h1>AITU Performance Report</h1></header>";
    }
}
