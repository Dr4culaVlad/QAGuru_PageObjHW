package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.TableResaltComponent;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage extends PageBase {

    private SelenideElement
            firstNameInput = $("[id=firstName]"),
            lastNameInput = $("[id=lastName]"),
            userEmailInput = $("[id=userEmail]"),
            userNumberInput = $("[id=userNumber]"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            genderWrapper = $("#genterWrapper"),
            subjectsInput = $("#subjectsInput"),

            subjectsField = $("#subjectsWrapper"),
            uploadFile = $("#uploadPicture"),
            userAddress = $("#currentAddress"),
            userState = $("#state"),
            userCity = $("#city"),
            submitButton = $("#submit"),
            firstNameClass = $("#firstName.form-control"),
            lastNameClass = $("#lastName.form-control");


    TableResaltComponent tableResaltComponent = new TableResaltComponent();
    CalendarComponent calendarComponent = new CalendarComponent();


    public PracticeFormPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public PracticeFormPage bannerRemove(){
        adBanerRemove();
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

    public PracticeFormPage setUserGender(String value) {
        genderWrapper.$(byText(value)).click();
        ;
        return this;
    }

    public PracticeFormPage selectSubject(String setValue, String selectValue) {
        subjectsInput.setValue(setValue);
        subjectsField.$(byText(selectValue)).click();;
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

    public PracticeFormPage setAddress(String value) {
        userAddress.setValue(value);
        return this;
    }

    public PracticeFormPage setState(String value) {
        userState.scrollIntoView(true).click();
        $(byText(value)).click();
        return this;
    }

    public PracticeFormPage setCity(String value) {
        userCity.click();
        $(byText(value)).click();;
        return this;
    }

    public PracticeFormPage submitButton() {
        submitButton.scrollIntoView(true).click();
        return this;
    }

    public PracticeFormPage checkResult(String key, String value) {
        tableResaltComponent.tableResultCheck(key, value);
        return this;
    }

    public PracticeFormPage setBirthday(String year, String month, String day) {
        calendarComponent.setBDate(year, month, day);
        return this;
    }

    // Checkers
    public PracticeFormPage firstNameRedControlCheck() {
        firstNameClass.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
        return this;
    }

    public PracticeFormPage lastNameRedControlCheck() {
        lastNameClass.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
        return this;
    }
}
