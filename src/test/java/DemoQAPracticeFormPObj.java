import org.junit.jupiter.api.Test;
import pages.PracticeFormChecker;
import pages.PracticeFormPage;
import pages.TestBase;

public class DemoQAPracticeFormPObj extends TestBase {

    String name = "Danila";
    String lastName = "Bogrov";
    String mail = "mailq@mail.com";
    String number = "1390846575";
    String fileName = "ScreenshotHW1.png";
    String address = "ulitsa Pushkina, dom Kolotoshkina";
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    PracticeFormChecker practiceFormChecker = new PracticeFormChecker();

    @Test
    void allFormCompletePObjTest() {
        practiceFormPage.openPage()
                .setFirstName(name)
                .setLastName(lastName)
                .setUserEmail(mail)
                .setUserGenter("Other")
                .setUserNumber(number)
                .setBirthday("1990", "May", "16")
                .setSubjectBiology()
                .setUserHobbie("Reading")
                .uploadFile(fileName)
                .setAdress(address)
                .setState()
                .setCity()
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
                .setUserGenter("Other")
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
    void negtiveFormCompletePObjTest(){
        practiceFormPage.openPage()
                .setUserEmail(mail)
                .setUserGenter("Other")
                .setUserNumber(number)
                .setBirthday("1990", "May", "16")
                .setSubjectBiology()
                .setUserHobbie("Reading")
                .uploadFile(fileName)
                .setAdress(address)
                .setState()
                .setCity()
                .submitButton();
        practiceFormChecker.firstNameRedControlCheck()
                .lastNameRedControlCheck();
    }

}


