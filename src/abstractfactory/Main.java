package abstractfactory;

public class Main {
    public static void main(String[] args){
        String format = args.length == 0
                ? "pdf"
                : args[0].toLowerCase();
        ExportFactory factory = switch (format){
            case "pdf" -> new PdfExportFactory();
            case "docx" -> new DocxExportFactory();
            case "html" -> new HtmlExportFactory();
            default -> throw new IllegalArgumentException("Unknwon format: " + format);
        };
        ExportApplication application = new ExportApplication(factory);
        application.exportReport();
    }
}
