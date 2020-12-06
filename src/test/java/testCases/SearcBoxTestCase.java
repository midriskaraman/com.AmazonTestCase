package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunctions.SearchBoxFunction;
import utils.BaseTest;


@Listeners({Listener.class})
public class SearcBoxTestCase extends BaseTest {

    @Test(priority = 2)
    public void searcBoxTest(){
        SearchBoxFunction seachBoxCat =new SearchBoxFunction(driver);
        seachBoxCat.searchBoxCatogories();


    }



}
