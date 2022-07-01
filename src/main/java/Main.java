import com.machinepublishers.jbrowserdriver.JBrowserDriver;
import com.machinepublishers.jbrowserdriver.Settings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
    public static void main (String[] args) {
        String url = "https://visiology.dgk.ru/viewer/public?dashboardGuid=f9582b0421ba48cba9713d5e00bfd506&showNav=false&fit=false&filter=125";
        System.out.println("Hello, world!");

        Parser parser = new Parser(url);
        try {
            parser.parse();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}