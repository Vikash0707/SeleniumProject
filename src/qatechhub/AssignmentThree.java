package qatechhub;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import java.sql.Driver;

public class AssignmentThree {


    WebDriver driver;
    String url ="https://qatechhub.com";
    public void invokeBrowser() {

        System.setProperty("webdriver.gecko.driver", "/Users/superaxis/Downloads/geckodriver");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        // Navigate to "https://qatechhub.com";
        driver.get(url);
    }
        // method to print Pass "QA Automation Tools trainings and Tutorials | QA Tech Hub" else FAIl.

    public void verifyPageTitle(){
        String expectedTitle = "QA Automation Tools trainings and Tutorials | QA Tech Hub";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
        }

    }

    public void navigateCommands(){
        // navigate to the facebook page
        driver.navigate().to("https://www.facebook.com");
       // navigate back to the QA Tech Hub
        driver.navigate().back();
        //print the url of the current page
        String urlFromWebpage = driver.getCurrentUrl();

        System.out.println(urlFromWebpage);

        // navigate forword
        driver.navigate().forward();
        // reload or refresh
        driver.navigate().refresh();



    }

    public void closeBrowser(){
        driver.close();
    }

    public static void main(String[] args) {
        AssignmentThree fa =new AssignmentThree();
        fa.invokeBrowser();
        fa.verifyPageTitle();
        fa.navigateCommands();
        fa.closeBrowser();

    }

}

