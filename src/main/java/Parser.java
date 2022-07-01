import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Parser {

    String url = "";

    public Parser(String url) {
        this.url = url;
    }

    public void parse() throws InterruptedException {
        System.setProperty("webdriver.ie.driver", "C:\\Users\\vasilev_av\\IdeaProjects\\visiologyParser\\seleniumDriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(url);
        Thread.sleep(10000);
        System.out.println(driver.getTitle());
        WebElement day = driver.findElement(By.cssSelector("#eacb736728394a28873921ca7c630f8c > div"));
        WebElement dayOfYear = driver.findElement(By.cssSelector("#\\38 4f7e0a959204a8392357ba2f1567346 > div"));
        WebElement maxDay = driver.findElement(By.cssSelector("#\\30 8443f2711744d62adabb4136001d9db > div"));


        System.out.println("Дней без травмотизма: "+day.getText());
        System.out.println("Несчастных случаев в этом году: "+dayOfYear.getText());
        System.out.println("Максимальное количество дней без травматизма: "+maxDay.getText());
        driver.quit();
    }
}
