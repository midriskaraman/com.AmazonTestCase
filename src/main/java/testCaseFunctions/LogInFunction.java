package testCaseFunctions;

import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class LogInFunction extends BasePage {


    public LogInFunction(WebDriver driver) {
        super(driver);
    }

    public void login(){

        element(cokkies).click();
        element(logInbtn).click();
        sendKeys(email,userEmail);
        element(continueBtn).click();
        sendKeys(passWord,pass);
        element(doLogin).click();
        
    }

}
