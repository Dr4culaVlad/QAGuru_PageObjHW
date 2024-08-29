import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;


import static com.codeborne.selenide.Selenide.$;

public class DemoQAPracticeFormPObjTest extends TestBase {

    String name = "Danila";
    String lastName = "Bogrov";
    String mail = "mailq@mail.com";
    String number = "1390846575";
    String fileName = "ScreenshotHW1.png";
    String address = "ulitsa Pushkina, dom Kolotoshkina";
    PracticeFormPage practiceFormPage = new PracticeFormPage();


    @Test
    void allFormCompletePObjTest() {
        practiceFormPage.openPage()
                .bannerRemove()
                .setFirstName(name)
                .setLastName(lastName)
                .setUserEmail(mail)
                .setUserGender("Other")
                .setUserNumber(number)
                .setBirthday("1990", "May", "16")
                .selectSubject("b", "Biology")
                .setUserHobbie("Reading")
                .uploadFile(fileName)
                .setAddress(address)
                .setState("Uttar Pradesh")
                .setCity("Lucknow")
                .submitButton()

                .checkResult("Student Name", name + " " + lastName)
                .checkResult("Student Email", mail)
                .checkResult("Gender", "Other")
                .checkResult("Mobile", number)
                .checkResult("Date of Birth", "16 May,1990")
                .checkResult("Subjects", "Biology")
                .checkResult("Hobbies", "Reading")
                .checkResult("Picture", fileName)
                .checkResult("Address", address)
                .checkResult("State and City", "Uttar Pradesh Lucknow");

    }

    @Test
    void minimumFormCompletePObjTest() {
        practiceFormPage.openPage()
                .setFirstName(name)
                .setLastName(lastName)
                .setUserEmail(mail)
                .setUserGender("Other")
                .setUserNumber(number)
                .setBirthday("1990", "May", "16")
                .submitButton()

                .checkResult("Student Name", name + " " + lastName)
                .checkResult("Student Email", mail)
                .checkResult("Gender", "Other")
                .checkResult("Mobile", number)
                .checkResult("Date of Birth", "16 May,1990")
                .checkResult("Subjects", " ")
                .checkResult("Hobbies", " ")
                .checkResult("Picture", " ")
                .checkResult("Address", " ")
                .checkResult("State and City", " ");

    }

    @Test
    void negtiveFormCompletePObjTest() {
        practiceFormPage.openPage()
                .setUserEmail(mail)
                .setUserGender("Other")
                .setUserNumber(number)
                .setBirthday("1990", "May", "16")
                .selectSubject("b", "Biology")
                .setUserHobbie("Reading")
                .uploadFile(fileName)
                .setAddress(address)
                .setState("Uttar Pradesh")
                .setCity("Lucknow")
                .submitButton()
                .firstNameRedControlCheck()
                .lastNameRedControlCheck();
    }

}


