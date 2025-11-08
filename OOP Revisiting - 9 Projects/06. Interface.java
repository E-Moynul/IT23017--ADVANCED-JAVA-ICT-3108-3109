//it23017
interface ILoggable {
    void log(String message);
}

class DatabaseLogger implements ILoggable {
    
    @Override
    public void log(String message) {
        System.out.println("LOG to Database: " + message);
    }
}

class FileLogger implements ILoggable {

    @Override
    public void log(String message) {
        System.out.println("LOG to File: " + message);
    }
}

public class App {
    public static void main(String[] args) {
        DatabaseLogger dbLog = new DatabaseLogger();
        dbLog.log("User signed in.");

        FileLogger fileLog = new FileLogger();
        fileLog.log("Cache updated.");
    }
}
