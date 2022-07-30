package bonilla.mariela.testcases;

import static org.junit.Assert.assertTrue;

import bonilla.mariela.pagesCases.HomePageTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;


public class Cases
{

    HomePageTest homePageTest;

    @Parameters({"browser"})
    @BeforeClass
    public void beforeClass(String browser) {
        homePageTest = new HomePageTest();
    }
    @Parameters({"url"})
    @BeforeMethod
    public void beforeTest(String url) throws IOException {
        homePageTest.openURL(url);
    }

    @Test
    public void TestCpSanJose() throws IOException {
        homePageTest.searchSanJose();
    }

    @Test
    public void TestCpAlajuela() throws IOException {
        homePageTest.searchAlajueja();
    }

    @Test
    public void TestCpCartago() throws IOException {
        homePageTest.searchCartago();
    }

    @Test
    public void TestCpHeredia() throws IOException {
        homePageTest.searchHeredia();
    }

    @Test
    public void TestCpGuanacaste() throws IOException {
        homePageTest.searchGuanacaste();
    }
    @Test
    public void TestCpPuntarenas() throws IOException {
        homePageTest.searchPuntarenas();
    }
    @Test
    public void TestCpLimon() throws IOException {
        homePageTest.searchLimon();
    }

    @AfterMethod
    public void afterTest() {
    }
    @AfterClass
    public void afterClass() {
        homePageTest.closeDriver();
    }

}

