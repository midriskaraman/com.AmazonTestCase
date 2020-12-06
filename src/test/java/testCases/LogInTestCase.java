package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunctions.LogInFunction;
import utils.BaseTest;


@Listeners({Listener.class})
public class LogInTestCase extends BaseTest {


    @Test(priority = 1)
    public void logInTest(){

        LogInFunction logIn = new LogInFunction(driver);
        logIn.login();


    }


}
