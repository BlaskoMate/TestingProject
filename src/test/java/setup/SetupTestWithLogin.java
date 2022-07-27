package setup;

import util.Util;
import util.WebDriverManager;

import java.io.IOException;
import java.util.List;

public class SetupTestWithLogin extends SetupTestNoLogin{



    protected void login(){
        openPage("login");
        List<String> loginCredentials = getLoginCredentials("valid");
        indexPage.successfulLogin(loginCredentials);
    }

    protected List<String> getLoginCredentials(String key){
        try {
            return Util.getTestData(key,LOGIN_TEST_DATA_PATH);
        }catch (IOException e){
            WebDriverManager.quitWebDriver(driver);
            return null;
        }
    }

    protected void logout(){
        System.out.println("logout");
    }
}
