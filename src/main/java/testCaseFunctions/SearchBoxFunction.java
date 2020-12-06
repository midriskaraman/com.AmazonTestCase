package testCaseFunctions;

import org.openqa.selenium.WebDriver;
import utils.BasePage;


public class SearchBoxFunction extends BasePage {
    public SearchBoxFunction(WebDriver driver) {
        super(driver);
    }


    public void searchBoxCatogories ()  {
        element(searchBox).click();
        select.selectByValue("search-alias=computers");
        sendKeys(searchtextbox,searchText);
        element(searchBtn).click();
        element(optionTwo).click();
        element(createWishList).click();
        element(shopText).clear();
        sendKeys(shopText,createListText);
        element(createListBtn).click();
        element(createFavoriListMassage).getText();
        System.out.println("favori liste oluşturma mesaşı = "+element(createFavoriListMassage).getText());
        element(closeBtn).click();




    }
}
