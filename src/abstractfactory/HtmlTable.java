package abstractfactory;

public class HtmlTable implements TableSection{
    @Override
    public String render(){
        return "<table><tr><td>Interactive web report data</td></tr></table>";
    }
}
