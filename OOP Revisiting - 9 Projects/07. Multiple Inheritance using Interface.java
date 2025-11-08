//it23017
interface ISaveable {
    void save();
}

interface IPrintable {
    void print();
}

class Report implements ISaveable, IPrintable {
    
    String content = "This is the annual report content.";

    @Override
    public void save() {
        System.out.println("Saving report to disk...");
        System.out.println(content);
    }

    @Override
    public void print() {
        System.out.println("Sending report to printer...");
        System.out.println(content);
    }
}

public class Office {
    public static void main(String[] args) {
        Report annualReport = new Report();
        annualReport.save();
        annualReport.print();
    }
}
