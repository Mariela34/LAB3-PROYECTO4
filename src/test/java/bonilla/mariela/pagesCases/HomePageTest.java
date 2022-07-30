package bonilla.mariela.pagesCases;

import bonilla.mariela.adapter.Adapter;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class HomePageTest {

    private WebDriver driver = null;
    private static Adapter adapter = null;
    //private String routeResults = "";

    public HomePageTest() {
        adapter = new Adapter();
    }

    public void openURL(String url) throws IOException {
        adapter.openURL(url);
    }

    public void searchSanJose()throws IOException {
        adapter.findElementById(("ProvinceId")).click();
        adapter.findElementXpath(("//option[. = 'San José']")).click();
        adapter.findElementById(("CantonId")).click();
        adapter.findElementById(("CantonId"));
        adapter.findElementXpath(("//option[. = 'Acosta']")).click();
        adapter.findCssSelector((".btn-filter"));
        adapter.findTagName(("body"));
        adapter.findElementById(("DistrictId")).click();
        adapter.findElementXpath(("//option[. = 'Guaitil']")).click();
        adapter.findElementById(("PropertyTypeId")).click();
        adapter.findElementById(("PropertyTypeId"));
        adapter.findElementXpath(("//option[. = 'Vivienda']")).click();
        adapter.findElementById(("MinPrice")).click();
        adapter.findElementById(("MinPrice")).sendKeys("0");
        adapter.findElementById(("MaxPrice")).click();
        adapter.findElementById(("MaxPrice")).sendKeys("30000000");
        adapter.findCssSelector((".btn-filter")).click();
        adapter.findCssSelector((".property-item-title > strong")).click();
    }

    public void searchAlajueja()throws IOException {
        adapter.findElementById(("ProvinceId")).click();
        adapter.findElementXpath(("//option[. = 'Alajuela']")).click();
        adapter.findElementById(("CantonId")).click();
        adapter.findElementById(("CantonId"));
        adapter.findElementXpath(("//option[. = 'Alajuela']")).click();
        adapter.findCssSelector((".btn-filter"));
        adapter.findTagName(("body"));
        adapter.findElementById(("DistrictId")).click();
        adapter.findElementById(("PropertyTypeId")).click();
        adapter.findElementById(("PropertyTypeId"));
        adapter.findElementXpath(("//option[. = 'Terrenos']")).click();
        adapter.findElementById(("MinPrice")).click();
        adapter.findElementById(("MinPrice")).sendKeys("0");
        adapter.findElementById(("MaxPrice")).click();
        adapter.findElementById(("MaxPrice")).sendKeys("80000000");
        adapter.findCssSelector((".btn-filter")).click();
        adapter.findCssSelector((".property-item-title > strong")).click();
    }

    public void searchCartago()throws IOException {
        adapter.findElementById(("ProvinceId")).click();
        adapter.findElementXpath(("//option[. = 'Cartago']")).click();
        adapter.findElementById(("CantonId")).click();
        adapter.findElementById(("CantonId"));
        adapter.findElementXpath(("//option[. = 'Alvarado']")).click();
        adapter.findCssSelector((".btn-filter"));
        adapter.findTagName(("body"));
        adapter.findElementById(("DistrictId")).click();
        adapter.findElementById(("PropertyTypeId")).click();
        adapter.findElementById(("PropertyTypeId"));
        adapter.findElementXpath(("//option[. = 'Inmobiliario']")).click();
        adapter.findElementById(("MinPrice")).click();
        adapter.findElementById(("MinPrice")).sendKeys("10000000");
        adapter.findElementById(("MaxPrice")).click();
        adapter.findElementById(("MaxPrice")).sendKeys("200000000");
        adapter.findCssSelector((".btn-filter")).click();
        adapter.findCssSelector((".property-item-title > strong")).click();
    }

    public void searchGuanacaste()throws IOException {
        adapter.findElementById(("ProvinceId")).click();
        adapter.findElementXpath(("//option[. = 'Guanacaste']")).click();
        adapter.findElementById(("CantonId")).click();
        adapter.findElementById(("CantonId"));
        adapter.findElementXpath(("//option[. = 'Carrillo']")).click();
        adapter.findCssSelector((".btn-filter"));
        adapter.findTagName(("body"));
        adapter.findElementById(("PropertyTypeId")).click();
        adapter.findElementById(("PropertyTypeId"));
        adapter.findElementXpath(("//option[. = 'Finca']")).click();
        adapter.findElementById(("MinPrice")).click();
        adapter.findElementById(("MinPrice")).sendKeys("0");
        adapter.findElementById(("MaxPrice")).click();
        adapter.findElementById(("MaxPrice")).sendKeys("40000000");
        adapter.findCssSelector((".btn-filter")).click();
        adapter.findCssSelector((".property-item-title > strong")).click();

    }

    public void searchPuntarenas()throws IOException {
        adapter.findElementById(("ProvinceId")).click();
        adapter.findElementXpath(("//option[. = 'Puntarenas']")).click();
        adapter.findElementById(("CantonId")).click();
        adapter.findElementById(("CantonId"));
        adapter.findElementXpath(("//option[. = 'Quepos']")).click();
        adapter.findCssSelector((".btn-filter"));
        adapter.findTagName(("body"));
        adapter.findElementById(("PropertyTypeId")).click();
        adapter.findElementById(("PropertyTypeId"));
        adapter.findElementXpath(("//option[. = 'Terrenos']")).click();
        adapter.findElementById(("MinPrice")).click();
        adapter.findElementById(("MinPrice")).sendKeys("0");
        adapter.findElementById(("MaxPrice")).click();
        adapter.findElementById(("MaxPrice")).sendKeys("4000000000");
        adapter.findCssSelector((".btn-filter")).click();
        adapter.findCssSelector((".property-item-title > strong")).click();
    }

    public void searchLimon()throws IOException {
        adapter.findElementById(("ProvinceId")).click();
        adapter.findElementXpath(("//option[. = 'Limón']")).click();
        adapter.findElementById(("CantonId")).click();
        adapter.findElementById(("CantonId"));
        adapter.findElementXpath(("//option[. = 'Pococí']")).click();
        adapter.findCssSelector((".btn-filter"));
        adapter.findTagName(("body"));
        adapter.findElementById(("DistrictId")).click();
        adapter.findElementXpath(("//option[. = 'Guapiles']")).click();
        adapter.findElementById(("PropertyTypeId")).click();
        adapter.findElementById(("PropertyTypeId"));
        adapter.findElementXpath(("//option[. = 'Terrenos con construcciones']")).click();
        adapter.findElementById(("MinPrice")).click();
        adapter.findElementById(("MinPrice")).sendKeys("0");
        adapter.findElementById(("MaxPrice")).click();
        adapter.findElementById(("MaxPrice")).sendKeys("50000000");
        adapter.findCssSelector((".btn-filter")).click();
        adapter.findCssSelector((".property-item-title > strong")).click();
    }

    public void closeDriver() {
        adapter.closeDriver();
    }

}
