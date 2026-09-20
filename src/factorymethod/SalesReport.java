package factorymethod;

public class SalesReport implements Report {
    @Override
    public String getTitle(){
        return "Monthly Sales Report";
    }
    @Override
    public String generateContent(){
        return "Total sales: $48,500 | Growth:12%";
    }
}
