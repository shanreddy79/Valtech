package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.HashMap;

/**
 * "HomePage.java" class file handles all the relevant HomePage Element Locators for automation framework
 * This Page is demonstration of Page Object Model of the framework
 *
 * @author shan.reddy
 */
public class HomePage {

    final WebDriver driver;
    public By elementLocator;



    public By homePageLocs(String locs) throws Exception {
        HashMap<String, By> hmap = new HashMap();
        /*Adding elements to HashMap*/
        try {

            hmap.put("LATESTNEWS", By.xpath("//h2[@class='block-header__heading'][contains(text(),'Latest news')]"));

            hmap.put("ABOUT", By.xpath("//a[@href='/about/']//span"));

            hmap.put("WORK", By.xpath("//span[contains(text(),'Work')]"));
            hmap.put("SERVICES", By.xpath("//span[contains(text(),'Services')]"));
            hmap.put("About", By.xpath("//h1[contains(text(),'About')]"));
            hmap.put("Work", By.xpath("//h1[contains(text(),'Work')]"));
            hmap.put("Services", By.xpath("//h1[contains(text(),'Services')]"));
            elementLocator = hmap.get(locs);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return elementLocator;
    }

    // This is a constructor, as every page need a base driver to find web elements
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}

