package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

        logger.info("google açıldı");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Başarılı");
       logger.info("başarılı");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Başarısız");
        logger.error("fail");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test Atladı");
        logger.warn("skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.setProperty("webdriver.chrome.driver","C:/Users/lenovo/Desktop/selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String ExpectedTitle = "Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectedTitle);
        System.out.println("anasayfa açıldı kontrol edildi");
        logger.info("browser açıldı");
    }

    public void onFinish(ITestContext iTestContext) {
         driver.quit();
        logger.info("browser kapatıldı");
    }
}
