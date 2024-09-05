import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import utils.UserDataUtils;

public class DemoQAPracticeFormFakerTest extends TestBase {

    PracticeFormPage practiceFormPage = new PracticeFormPage();
    UserDataUtils user = new UserDataUtils();

    @Test
    void allFormCompletePObjTest() {
        practiceFormPage.openPage()
                .bannerRemove()
                .setFirstName(user.name)
                .setLastName(user.lastName)
                .setUserEmail(user.mail)
                .setUserGender(user.gender)
                .setUserNumber(user.phoneNumber)
                .setBirthday(user.year, user.month, user.day)
                .selectSubject(user.subject)
                .setUserHobbie(user.hobby)
                .uploadFile(user.fileName)
                .setAddress(user.address)
                .setState(user.state)
                .setCity(user.city)
                .submitButton()

                .checkResult("Student Name", user.name + " " + user.lastName)
                .checkResult("Student Email", user.mail)
                .checkResult("Gender", user.gender)
                .checkResult("Mobile", user.phoneNumber)
                .checkResult("Date of Birth", user.day + " " + user.month + "," + user.year)
                .checkResult("Subjects", user.subject)
                .checkResult("Hobbies", user.hobby)
                .checkResult("Picture", user.fileName)
                .checkResult("Address", user.address)
                .checkResult("State and City", user.state + " " + user.city);

    }

    @Test
    void minimumFormCompletePObjTest() {
        practiceFormPage.openPage()
                .setFirstName(user.name)
                .setLastName(user.lastName)
                .setUserEmail(user.mail)
                .setUserGender(user.gender)
                .setUserNumber(user.phoneNumber)
                .setBirthday(user.year, user.month, user.day)
                .submitButton()

                .checkResult("Student Name", user.name + " " + user.lastName)
                .checkResult("Student Email", user.mail)
                .checkResult("Gender", user.gender)
                .checkResult("Mobile", user.phoneNumber)
                .checkResult("Date of Birth", user.day + " " + user.month + "," + user.year)
                .checkResult("Subjects", " ")
                .checkResult("Hobbies", " ")
                .checkResult("Picture", " ")
                .checkResult("Address", " ")
                .checkResult("State and City", " ");

    }

    @Test
    void negtiveFormCompletePObjTest() {
        practiceFormPage.openPage()
                .setUserEmail(user.mail)
                .setUserGender(user.gender)
                .setUserNumber(user.phoneNumber)
                .setBirthday(user.year, user.month, user.day)
                .selectSubject(user.subject)
                .setUserHobbie(user.hobby)
                .uploadFile(user.fileName)
                .setAddress(user.address)
                .setState(user.state)
                .setCity(user.city)
                .submitButton()
                .firstNameRedControlCheck()
                .lastNameRedControlCheck();
    }

}


