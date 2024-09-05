package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class UserDataUtils {
    Faker faker = new Faker((new Locale("en-GB")));

    public String name = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String mail = faker.internet().emailAddress();
    public String gender = faker.options().option("Male", "Female", "Other");
    public String phoneNumber = faker.number().digits(10);

    public String subject = faker.options().option("Maths", "Accounting", "Arts", "Social Studies", "Biology", "Physics", "Chemistry", "Computer Science", "Commerce", "Economics", "Civics", "Hindi", "English", "History");
    public String month = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    public String year = Integer.toString(faker.number().numberBetween(1900,2100));
    public String day = Integer.toString(chooseDay());

    public String state = faker.options().option("Rajasthan", "NCR", "Uttar Pradesh", "Haryana");;
    public String city = chooseCity();
    public String hobby = faker.options().option("Sports", "Reading", "Music");
    public String fileName = "ScreenshotHW1.png";
    public String address = faker.address().fullAddress();

    public int chooseDay() {
        if (month.equals("February")) {
            return faker.number().numberBetween(1, 28);
        } else if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")) {
            return faker.number().numberBetween(1, 30);
        } else {
            return faker.number().numberBetween(1, 31);
        }
    }

    public String chooseCity() {
        if (state.equals("NCR")) {
            return faker.options().option("Delhi", "Gurgaon", "Noida");
        } else if (state.equals("Uttar Pradesh")) {
            return faker.options().option("Agra", "Lucknow", "Merrut");
        } else if (state.equals("Haryana")) {
            return faker.options().option("Karnal", "Panipat");
        } else {
            return faker.options().option("Jaipur", "Jaipur");
        }
    }

    //state

    //city


    //Date year , date day and date month methods
    // state and city methods

}



