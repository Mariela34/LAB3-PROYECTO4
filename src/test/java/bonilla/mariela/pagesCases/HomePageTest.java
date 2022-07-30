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

}
