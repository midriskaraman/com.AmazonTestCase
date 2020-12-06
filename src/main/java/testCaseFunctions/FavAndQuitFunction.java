package testCaseFunctions;

import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class FavAndQuitFunction extends BasePage {
    public FavAndQuitFunction(WebDriver driver) {
        super(driver);
    }

    public void favAndQuitFunc(){


        actions.moveToElement(element(accountMenu));
        element(favorateList).click();
        element(productionRemove).click();
        element(removed).getText();
        System.out.println("favori listesine eklenen ürün mesajı = "+element(removed).getText());
        actions.moveToElement(element(accountMenu));
        element(quitBtn).click();

    }
}
