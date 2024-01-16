package PageObjectModel.runner;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.*;
import PageObjectModel.pages.ContactFormPage;
import PageObjectModel.utility.EnvironmentSetup;
import PageObjectModel.utility.ProjectSetup;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class ContactUsForm extends ProjectSetup {
    static ContactFormPage contactFormPage = new ContactFormPage();
    ProjectSetup projectSetup = new ProjectSetup();

    @BeforeTest
    public void ProjectSetup() throws InterruptedException {
        projectSetup.projectSetup();
        driver.get(EnvironmentSetup.URL);
    }

    @Test(priority = 1, description = "Get In Touch")
    public static void CaseCenterNewCase() throws InterruptedException, IOException {

        Thread.sleep(1000);
        contactFormPage.enterFirstName();
        Thread.sleep(1000);
        contactFormPage.enterLastName();
        Thread.sleep(1000);
        contactFormPage.enterEmail();
        Thread.sleep(1000);
        contactFormPage.enterMessage();
        Thread.sleep(1000);
        contactFormPage.checkPrivacy();
        Thread.sleep(1000);

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("Screenshots\\SS001-Homepage" + ".jpg"));
        Allure.addAttachment("ContactUsForm", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

        contactFormPage.clickSubmitBtn();
        Thread.sleep(3000);

        File scrFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile2, new File("Screenshots\\SS002-ContactForm" + ".jpg"));
        Allure.addAttachment("ContactUsForm", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @AfterTest
    public void ProjectTearDown() {
        System.out.println("\n** Automation test has been closed..!!! **");

//        try {
//            File script3 = new File("Scripts/run_allure.bat");
//            ProcessBuilder processBuilder3 = new ProcessBuilder("cmd.exe", "/c", script3.getAbsolutePath());
//            Process process3 = processBuilder3.start();
//        } catch (IOException var4) {
//            var4.printStackTrace();
//        }
        driver.quit();
    }
}
