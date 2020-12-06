package testCases;

import org.testng.annotations.Test;
import testCaseFunctions.FavAndQuitFunction;
import utils.BaseTest;

public class FanAndQuitTestCase extends BaseTest {

    @Test(priority = 3)
    public void favAndQuitTest(){

        FavAndQuitFunction favAndQuit = new FavAndQuitFunction(driver);
        favAndQuit.favAndQuitFunc();
    }
}
