package factorymethod;

public class AuditReport implements Report{
    @Override
    public String getTitle(){
        return "System Audit Report";
    }
    @Override
    public String generateContent(){
        return "Checks completedd: 24 | Passed: 22 | Warning: 2";
    }
}
