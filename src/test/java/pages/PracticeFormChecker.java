package pages;


import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.CssValue;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selenide.$;

public class PracticeFormChecker {

    public static SelenideElement firstNameClass = $("#firstName.form-control");
    public static SelenideElement lastNameClass = $("#lastName.form-control");
    public PracticeFormChecker firstNameRedControlCheck(){
        firstNameClass.shouldHave(cssValue("border-color","rgb(220, 53, 69)"));
    return this;
        }

    public PracticeFormChecker lastNameRedControlCheck(){
        lastNameClass.shouldHave(cssValue("border-color","rgb(220, 53, 69)"));
        return this;
    }
}