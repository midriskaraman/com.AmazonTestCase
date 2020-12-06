package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {


    public String userEmail= "tselenium96@gmail.com";
    public String pass= "123asd!'";
    public String searchText ="msi";
    public String createListText ="Favoriler";

    //locators
    public By cokkies= By.id("sp-cc-accept");
    public By logInbtn =By.id("nav-link-accountList");
    public By email = By.cssSelector("#ap_email");
    public By continueBtn = By.cssSelector("#continue");
    public By passWord = By.id("ap_password");
    public By doLogin = By.id("signInSubmit");
    public By searchBox = By.cssSelector("#searchDropdownBox");
    public By searchtextbox = By.id("twotabsearchtextbox");
    public By searchBtn =By.xpath("//input[@value='Git']");
    public By optionTwo =By.xpath("(//img[@class='s-image'])[2]");
    public By createWishList = By.cssSelector("#add-to-wishlist-button-submit");
    public By shopText = By.cssSelector("#list-name");
    public By createListBtn =By.xpath("//span[text()='Liste Oluştur']");
    public By createFavoriListMassage = By.xpath("//span[text()='1 ürün Favoriler listesine eklendi']");
    public By closeBtn =By.cssSelector(".a-button-close.a-declarative");
    public By accountMenu=By.id("nav-link-accountList");
    public By favorateList= By.linkText("Favoriler");
    public By productionRemove = By.linkText("Ürünü kaldır");
    public By removed =By.xpath("//div[text()='silindi']");
    public By quitBtn = By.xpath("//span[text()='Çıkış Yap']");


    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,40);
        select = new Select(element(searchBox));



    }

    public WebDriver driver;

    public WebElement element(By Locator){
        actions =new Actions(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        return driver.findElement(Locator);
    }

    public void sendKeys(By Locator,String value){
        element(Locator).sendKeys(value);

    }
    public Select select;
    public Actions actions;





}
