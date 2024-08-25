package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.BirthdayDateInput;
import pages.components.TableRusaltComponent;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    public static SelenideElement firstNameInput = $("[id=firstName]");
    public static SelenideElement lastNameInput = $("[id=lastName]");
    public static SelenideElement userEmailInput = $("[id=userEmail]");
    public static SelenideElement userNumberInput = $("[id=userNumber]");
    public static SelenideElement hobbiesWrapper = $("#hobbiesWrapper");
    public static SelenideElement genterWrapper = $("#genterWrapper");
    public static SelenideElement subjectsInput = $("#subjectsInput");

    public static SelenideElement uploadFile = $("#uploadPicture");
    public static SelenideElement userAdress = $("#currentAddress");
    public static SelenideElement userState = $("#state");
    public static SelenideElement userCity = $("#city");
    public static SelenideElement submit = $("#submit");
    TableRusaltComponent tableRusaltComponent = new TableRusaltComponent();
    BirthdayDateInput birthdayDateInput = new BirthdayDateInput();

    public PracticeFormPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("document.querySelector('#fixedban').style.display='none';");
        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public PracticeFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public PracticeFormPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public PracticeFormPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public PracticeFormPage setUserGenter(String value) {
        genterWrapper.$(byText(value)).click();
        ;
        return this;
    }

    public PracticeFormPage setSubjectBiology() {
        subjectsInput.setValue("b");
        $("#react-select-2-option-0").click();
        return this;
    }

    public PracticeFormPage setUserHobbie(String value) {
        hobbiesWrapper.scrollIntoView(true).$(byText(value)).click();
        ;
        return this;
    }

    public PracticeFormPage uploadFile(String value) {
        uploadFile.uploadFromClasspath(value);
        return this;
    }

    public PracticeFormPage setAdress(String value) {
        userAdress.setValue(value);
        return this;
    }

    public PracticeFormPage setState() {
        userState.scrollIntoView(true).click();
        ;
        $("#react-select-3-option-1").click();
        return this;
    }

    public PracticeFormPage setCity() {
        userCity.click();
        $("#react-select-4-option-1").click();
        return this;
    }

    public PracticeFormPage submitButton() {
        submit.scrollIntoView(true).click();
        return this;
    }

    public PracticeFormPage checkResult(String key, String value) {
        tableRusaltComponent.tableResultCheck(key, value);
        return this;
    }

    public PracticeFormPage setBirthday(String year, String month, String day) {
        birthdayDateInput.setBDate(year, month, day);
        return this;
    }
}
