package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    private final SelenideElement
            fullNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            resultBox = $("#output"),
            submit = $("#submit");

    public final SelenideElement
            nameResult = resultBox.$("#name"),
            emailResult = resultBox.$("#email"),
            currentAddressResult = resultBox.$("#currentAddress"),
            permanentAddressResult = resultBox.$("#permanentAddress");


    public TextBoxPage openPage() {
        open("/text-box");
        executeJavaScript("document.querySelector('#fixedban').style.display='none';");
        return this;
    }

    public TextBoxPage setFullName(String name) {
        fullNameInput.setValue(name);
        return this;
    }

    public TextBoxPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public TextBoxPage setCurrentAddress(String address) {
        currentAddressInput.setValue(address);
        return this;
    }

    public TextBoxPage setPermanentAddress(String address) {
        permanentAddressInput.setValue(address);
        return this;
    }

    public TextBoxPage submitButton() {
        submit.scrollIntoView(true).click();
        return this;
    }

    public TextBoxPage checkResultBox(SelenideElement locatorId, String text) {
        locatorId.shouldHave(text(text));
        return this;
    }
}
