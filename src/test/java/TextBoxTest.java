import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TextBoxTest {

    WebDriver wd;
    @BeforeClass
    public void init (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("load-extension=C:\\Tools\\5.0.2_0");
        wd = new ChromeDriver(options);
        wd.manage().window().maximize();
    wd.navigate().to("https://demoqa.com/");
    returnToDemoQA();
    }


@BeforeMethod
public void goToTextBox(){
        
}

    @Test
    public void textBoxTest(){

    }
    private void returnToDemoQA() {
       List <String> tabs = new ArrayList<>( wd.getWindowHandles());
       wd.switchTo().window(tabs.get(1)).close();
       wd.switchTo().window(tabs.get(0));
    }


}
