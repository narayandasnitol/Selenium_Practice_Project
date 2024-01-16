package PageObjectModel.pages;

import PageObjectModel.locatorUtils.LocatorUtils;
import PageObjectModel.utility.ProjectData;
import PageObjectModel.utility.ProjectSetup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactFormPage extends ProjectSetup {


    ProjectData randomInfo = ProjectData.generateRandomInfo();

    public void scrollToLocationModule() {
        WebElement scrollToLocationModule = driver.findElement(LocatorUtils.scrollToForm());
        jse.executeScript("arguments[0].scrollIntoView(true);", scrollToLocationModule);
    }

    public void enterFirstName() {
        driver.findElement(LocatorUtils.addFirstName()).sendKeys(randomInfo.getFirstName());
    }

    public void enterLastName() {
        driver.findElement(LocatorUtils.addLastName()).sendKeys(randomInfo.getLastName());
    }

    public void scrollToEmailModule() {
        WebElement scrollToEmailModule = driver.findElement(LocatorUtils.scrollToEmail());
        jse.executeScript("arguments[0].scrollIntoView(true);", scrollToEmailModule);
    }

    public void enterEmail() {
        driver.findElement(LocatorUtils.addEmail()).sendKeys(randomInfo.getUserEmailAddress());
    }

    public void enterMessage() {
        driver.findElement(LocatorUtils.addMessage()).sendKeys(randomInfo.getMessage());
    }

    public void checkPrivacy() {
        driver.findElement(LocatorUtils.clickPrivacyPolicy()).click();
    }

    public void clickSubmitBtn() {
        driver.findElement(LocatorUtils.submitBtn()).click();
    }
}


