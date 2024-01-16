//package PageObjectModel.locatorUtils;
//
//import org.openqa.selenium.By;
//
//public class LocatorUtils extends PageObjectModel.utility.ProjectSetup{
//    /* START - Login Page Locators - START */
//    public static By getLoginUserName() {
//        return By.id("am-1218");
//    }
//    public static By getLoginPassword() {
//        return By.id("am-1221");
//    }
//    public static By getLoginBtn() {
//        return By.id("am-1226");
//    }
//    /* END - Login Page Locators - END */
//
//
//    /* START Logout Page Locators - START */
//    public static By getLogoutBtnOption(){
//        return By.className("username");
//    }
//    public static By getLogoutBtn(){
//        return By.xpath("//mat-icon[text()=\"exit_to_app\"]");
//    }
//    /* END Logout Page Locators - END */
//
//
//    /* START - Home Page Language Change - START */
//    public static By getLanguageChangeOptionBtn() {
//        return By.className("iso");
//    }
//    public static By getLanguageChangeBtn() {
//        return By.xpath("//span[text()=\" Englisch \"]");
//    }
//    public static String getCurrentBuildVersion() {
//        return ("Front-end version: " + driver.findElement(By.cssSelector(".text-center.w-100-p")).getText()).replaceAll("\\schat$", "");
//    }
//    /* END - Home Page Language Change - END */
//
//
//    /* START - CREATE CASE MODULE - START */
//    public static By createNewCaseBtn(){
//        return By.xpath(("//mat-icon[text()=\"add\"]"));
//    }
//    public static By caseInfoModuleBtn(){
//        return By.xpath("//p[text()=\"Case Info\"]");
//    }
//    public static By claimInsuranceNumber(){
//        return By.xpath("//input[@formcontrolname=\"InsuranceClaimNumber\"]");
//    }
//    public static By policyHolderModuleBtn(){
//        return By.xpath("//p[text()=\"Policy Holder Details\"]");
//    }
//    public static By policyHolderName(){
//        return By.xpath("//input[@formcontrolname=\"Name\"]");
//    }
//    public static By policyHolderEmail(){
//        return By.xpath("//input[@formcontrolname=\"EmailAddress\"]");
//    }
//    public static By policyHolderPhone(){
//        return By.xpath("//input[@placeholder=\"Phone\"]");
//    }
//    public static By caseTypeOptionBtn(){
//        return By.cssSelector("[formcontrolname=\"CaseTypeId\"]");
//    }
//    public static By caseTypeName(){
//        return By.xpath("//span[text()=\" Elementarschaden \"]");
//    }
//    public static By scrollToServiceAddress(){
//        return By.xpath("//p[text()=\"Service Address\"]");
//    }
//    public static By streetName(){
//        return By.xpath("//input[@formcontrolname=\"ObjectStreet\"]");
//    }
//    public static By streetNumber(){
//        return By.xpath("//input[@formcontrolname=\"ObjectStreetNumber\"]");
//    }
//    public static By zipCode(){
//        return By.xpath("//input[@formcontrolname=\"ZipCodeOfIssuer\"]");
//    }
//    public static By cityName(){
//        return By.xpath("//input[@formcontrolname=\"ObjectCity\"]");
//    }
//    public static By serviceTypeModuleBtn(){
//        return By.xpath("//p[text()=\"Service Type\"]");
//    }
//    public static By cfConsultation(){
//        return By.xpath("//span[text()=\"Consultation with craftsman\"]");
//    }
//    public static By claimDescription(){
//        return By.xpath("//input[@formcontrolname=\"ClaimDescription\"]");
//    }
//    public static By productDescription(){
//        return By.xpath("//input[@formcontrolname=\"ProductDescription\"]");
//    }
//    public static By uploadFileModuleBtn(){
//        return By.xpath("//p[text()=\"Upload Files\"]");
//    }
//    public static By documentUploadBtn(){
//        return By.xpath("//input[@accept=\".PNG,.png,.jpg,.jpeg,.pdf,.doc,.rtf\"]");
//    }
//    public static By selectOfferType(){
//        return By.xpath("//span[text()=\" Offer \"]");
//    }
//    public static By selectPhotoType(){
//        return By.xpath("//span[text()=\" Photo \"]");
//    }
//    public static By submitCaseBtn(){
//        return By.xpath("//span[text()=\" SUBMIT CASE\"]");
//    }
//    /* END - CREATE CASE MODULE - END */
//
//
//
//}

package PageObjectModel.locatorUtils;

import org.openqa.selenium.By;

public class LocatorUtils extends PageObjectModel.utility.ProjectSetup{
    /* START */
    public static By scrollToForm() {
        return By.xpath("//h3[text()=\"Locations\"]");
    }
    public static By addFirstName() {
        return By.cssSelector("[placeholder=\"First Name*\"]");
    }
    public static By addLastName() {
        return By.cssSelector("[placeholder=\"Last Name*\"]");
    }
    public static By scrollToEmail(){
        return By.xpath("//h3[text()=\"Parkcenter\"]");
    }
    public static By addEmail() {
        return By.cssSelector("[placeholder=\"Email*\"]");
    }
    public static By addMessage() {
        return By.cssSelector("[placeholder=\"Message\"]");
    }
    public static By clickPrivacyPolicy() {
        return By.id("wpforms-1319-field_11_1");
    }
    public static By submitBtn() {
        return By.id("wpforms-submit-1319");
    }
    /* END */
}
