package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import setup.SetupTestNoLogin;

public class LogoutSteps extends SetupTestNoLogin {

    @Before
    public void setup(){
        setChromeDriver();
    }

    @After
    public void tearDown(){
        quitChromeDriver();
    }

}