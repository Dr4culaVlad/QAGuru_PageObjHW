package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CalendarComponent {
    //)
    public void setBDate(String year, String month, String day) {
        int numberOfDay = Integer.parseInt(day);

        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();

        if (numberOfDay < 10) {
            $(".react-datepicker__day--00" + day + ":not(.react-datepicker__day--outside-month)").click();
        } else {
            $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
        }
    }
}
