package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BirthdayDateInput {
    //)
    public void setBDate(String year, String month, String day) {
        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__month").$(byText(day)).click();
    }


}
