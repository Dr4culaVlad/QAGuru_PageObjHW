import org.junit.jupiter.api.Test;
import pages.TestBase;
import pages.TextBoxPage;

public class TextBoxPageHWPObj extends TestBase {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void textBoxFormTest() {
        textBoxPage.openPage()
                .setFullName("Petya")
                .setEmail("petya@elpirog.com")
                .setCurrentAddress("Test Adress")
                .setPermanentAddress("Second Test Adress")
                .submitButton()
                .checkResultBox(textBoxPage.nameResult, "Petya")
                .checkResultBox(textBoxPage.emailResult, "petya@elpirog.com")
                .checkResultBox(textBoxPage.currentAddressResult, "Test Adress")
                .checkResultBox(textBoxPage.permanentAddressResult, "Second Test Adress");
    }
}

