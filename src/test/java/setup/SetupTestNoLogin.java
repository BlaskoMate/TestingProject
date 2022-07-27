package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.IndexPage;

public class SetupTestNoLogin {
    protected static WebDriver driver;
    IndexPage indexPage = new IndexPage(driver);
    protected static final String LOGIN_TEST_DATA_PATH = "src/test/resources/data/login.csv";


    protected void setChromeDriver() {
        if (System.getProperty("os.name").equals("Linux")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    protected void quitChromeDriver(){
        System.out.println("quit");
        driver.quit();
    }

//    public static void setChromeDriver() throws MalformedURLException {
//        ChromeOptions chromeOptions = new ChromeOptions();
////        chromeOptions.setCapability("browseVersion", "94");
//        chromeOptions.setCapability("platformName", "WINDOWS");
//        driver = new RemoteWebDriver(new URL("http://{url}:4444/wd/hub/"), chromeOptions);
//        driver.manage().window().maximize();

//    }

    protected void openPage(String url){
        System.out.println(url);
    }

    protected void refreshPage(){
        driver.navigate().refresh();
    }
}
