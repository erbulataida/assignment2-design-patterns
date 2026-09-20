package factorymethod;

public class SummaryReport implements Report {
    @Override
    public String getTitle(){
        return "Executive Summary Report";
    }
    @Override
    public String generateContent(){
        return "Sales increased and system risks remain low";
    }
}